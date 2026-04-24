package part7_solid.quanli_benhvien;

import java.util.ArrayList;
import java.util.List;

/**
 * CLASS 1: Patient - Đại diện cho một bệnh nhân
 *
 * THUỘC TÍNH:
 * - patientId: String - Mã bệnh nhân (duy nhất, format: PT + 6 số)
 * - fullName: String - Họ tên bệnh nhân
 * - age: int - Tuổi (phải > 0 và <= 150)
 * - gender: String - Giới tính (MALE, FEMALE, OTHER)
 * - phoneNumber: String - Số điện thoại (10-11 số)
 * - address: String - Địa chỉ
 * - bloodType: String - Nhóm máu (A, B, AB, O với +/-)
 * - medicalRecords: java.util.List<MedicalRecord> - Danh sách hồ sơ khám bệnh
 * - status: String - Trạng thái (ADMITTED, DISCHARGED)
 * - admissionDate: String - Ngày nhập viện (format: dd/MM/yyyy)
 * - emergencyContact: String - Số điện thoại người thân
 *
 * YÊU CẦU:
 * 1. Implement các interface: Treatable, Displayable, Validatable
 * 2. Constructor nhận các tham số: patientId, fullName, age, gender, phoneNumber,
 *    address, bloodType, emergencyContact
 *    - medicalRecords = new ArrayList
 *    - status = "ADMITTED"
 *    - admissionDate = ngày hiện tại (format: dd/MM/yyyy)
 * 3. Implement phương thức examine(String doctor, String diagnosis):
 *    - Kiểm tra status == "DISCHARGED" thì throw PatientDischargedException
 *    - Kiểm tra doctor và diagnosis không null và không rỗng
 *    - Tạo MedicalRecord mới và thêm vào medicalRecords, Id = MR + this.count
 *    - Throw InvalidMedicalRecordException nếu thông tin không hợp lệ
 * 4. Implement phương thức prescribeMedication(String medication, String dosage):
 *    - Kiểm tra status == "DISCHARGED" thì throw PatientDischargedException
 *    - Kiểm tra có ít nhất 1 medical record
 *    - Lấy medical record cuối cùng và thêm thuốc vào
 * 5. Implement phương thức discharge():
 *    - Set status = "DISCHARGED"
 * 6. Implement phương thức getDisplayInfo():
 *    - Format: "Patient [patientId] | Name: [fullName] | Age: [age] | Gender: [gender] | Blood: [bloodType] | Phone: [phoneNumber] | Status: [status] | Records: [số lượng records]"
 * 7. Implement phương thức isValid():
 *    - patientId không null và match pattern "PT\d{6}"
 *    - fullName không null và không rỗng
 *    - age > 0 và age <= 150
 *    - gender là một trong: MALE, FEMALE, OTHER
 *    - phoneNumber có độ dài 10 hoặc 11 và chỉ chứa số
 *    - bloodType là một trong: A+, A-, B+, B-, AB+, AB-, O+, O-
 *    - emergencyContact có độ dài 10 hoặc 11 và chỉ chứa số
 * 8. Phương thức getMedicalHistory():
 *    - Trả về danh sách tất cả medical records
 * 9. Phương thức getLatestDiagnosis():
 *    - Trả về chẩn đoán của medical record gần nhất
 *    - Trả về "No diagnosis" nếu chưa có record
 * 10. Phương thức isAdmitted():
 *     - Trả về true nếu status == "ADMITTED"
 * 11. Override toString() trả về getDisplayInfo()
 * 12. Tạo các getter cho tất cả thuộc tính
 */
public class Patient implements Treatable, Displayable, Validatable {
    // TODO: Sinh viên hoàn thiện class này
    private String patientId;
    private String fullName;
    private int age;
    private String gender;
    private String phoneNumber;
    private String address;
    private String bloodType;
    private List<MedicalRecord> medicalRecords;
    private String status;
    private String admissionDate;
    private String emergencyContact;
    private static int count = 1;

    // Constructor
    public Patient(String patientId, String fullName, int age, String gender,
                   String phoneNumber, String address, String bloodType, String emergencyContact) {
        this.patientId = patientId;
        this.fullName = fullName;
        this.age = age;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.bloodType = bloodType;
        this.emergencyContact = emergencyContact;
        this.medicalRecords = new ArrayList<>();
        this.status = "ADMITTED";
        this.admissionDate = "02/11/2025";
    }

    @Override
    public void examine(String doctor, String diagnosis) throws PatientDischargedException,
            InvalidMedicalRecordException {
        if (status.equals("DISCHARGED")) {
            throw new PatientDischargedException("Patient " + patientId + " has been discharged");
        }
        if (doctor == null || doctor.trim().isEmpty()) {
            throw new InvalidMedicalRecordException("Doctor name cannot be empty");
        }
        if (diagnosis == null || diagnosis.trim().isEmpty()) {
            throw new InvalidMedicalRecordException("Diagnosis cannot be empty");
        }

        String recordId = "MR" + this.count;
        count += 1;
        MedicalRecord record = new MedicalRecord(recordId, patientId, doctor, diagnosis);
        medicalRecords.add(record);
    }


}
