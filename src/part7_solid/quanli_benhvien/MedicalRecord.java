package part7_solid.quanli_benhvien;

import java.util.ArrayList;
import java.util.List;

/**
 * CLASS 2: MedicalRecord - Đại diện cho hồ sơ khám bệnh
 *
 * THUỘC TÍNH:
 * - recordId: String - Mã hồ sơ (duy nhất)
 * - patientId: String - Mã bệnh nhân
 * - doctorName: String - Tên bác sĩ
 * - diagnosis: String - Chẩn đoán
 * - recordDate: String - Ngày khám (format: dd/MM/yyyy HH:mm)
 * - symptoms: String - Triệu chứng
 * - medications: java.util.List<Medication> - Danh sách thuốc (inner class)
 * - charges: java.util.List<Charge> - Danh sách chi phí (inner class)
 * - totalCost: double - Tổng chi phí
 * - notes: String - Ghi chú
 *
 * INNER CLASS: Medication
 * - name: String - Tên thuốc
 * - dosage: String - Liều lượng
 *
 * INNER CLASS: Charge
 * - description: String - Mô tả
 * - amount: double - Số tiền
 *
 * YÊU CẦU:
 * 1. Implement các interface: Displayable, Validatable, Billable
 * 2. Constructor nhận các tham số: recordId, patientId, doctorName, diagnosis
 *    - recordDate = thời gian hiện tại (format: dd/MM/yyyy HH:mm)
 *    - symptoms = ""
 *    - medications = new ArrayList
 *    - charges = new ArrayList
 *    - totalCost = 0
 *    - notes = ""
 * 3. Implement phương thức getDisplayInfo():
 *    - Format: "Record [recordId] | Patient: [patientId] | Doctor: [doctorName] | Date: [recordDate] | Diagnosis: [diagnosis] | Medications: [số lượng] | Total Cost: [totalCost] VND"
 * 4. Implement phương thức isValid():
 *    - recordId không null và không rỗng
 *    - patientId không null và không rỗng
 *    - doctorName không null và không rỗng
 *    - diagnosis không null và không rỗng
 *    - totalCost >= 0
 * 5. Implement calculateTotalCost():
 *    - Tính tổng của tất cả charges
 *    - Cập nhật totalCost
 *    - Trả về totalCost
 * 6. Implement addCharge(String description, double amount):
 *    - Tạo Charge mới và thêm vào charges
 *    - Gọi calculateTotalCost() để cập nhật
 * 7. Phương thức addMedication(String name, String dosage):
 *    - Tạo Medication mới và thêm vào medications
 * 8. Phương thức setSymptoms(String symptoms):
 *    - Set symptoms
 * 9. Phương thức setNotes(String notes):
 *    - Set notes
 * 10. Phương thức getMedicationList():
 *     - Trả về danh sách medications
 * 11. Phương thức getChargeList():
 *     - Trả về danh sách charges
 * 12. Override toString() trả về getDisplayInfo()
 * 13. Tạo các getter cho tất cả thuộc tính
 */
public class MedicalRecord implements Displayable, Validatable, Billable {
    // TODO: Sinh viên hoàn thiện class này

    // Inner class Medication
    public static class Medication {
        private String name;
        private String dosage;

        public Medication(String name, String dosage) {
            this.name = name;
            this.dosage = dosage;
        }

        public String getName() { return name; }
        public String getDosage() { return dosage; }

        @Override
        public String toString() {
            return name + " (" + dosage + ")";
        }
    }

    // Inner class Charge
    public static class Charge {
        private String description;
        private double amount;

        public Charge(String description, double amount) {
            this.description = description;
            this.amount = amount;
        }

        public String getDescription() { return description; }
        public double getAmount() { return amount; }

        @Override
        public String toString() {
            return description + ": " + amount + " VND";
        }
    }

    private String recordId;
    private String patientId;
    private String doctorName;
    private String diagnosis;
    private String recordDate;
    private String symptoms;
    private List<Medication> medications;
    private List<Charge> charges;
    private double totalCost;
    private String notes;

    // Constructor
    public MedicalRecord(String recordId, String patientId, String doctorName, String diagnosis) {
        this.recordId = recordId;
        this.patientId = patientId;
        this.doctorName = doctorName;
        this.diagnosis = diagnosis;
        this.recordDate = "02/11/2025";
        this.symptoms = "";
        this.medications = new ArrayList<>();
        this.charges = new ArrayList<>();
        this.totalCost = 0;
        this.notes = "";
    }


}
