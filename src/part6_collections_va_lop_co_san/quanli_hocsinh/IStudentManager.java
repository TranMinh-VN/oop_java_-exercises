package part6_collections_va_lop_co_san.quanli_hocsinh;

interface IStudentManager {
    boolean addStudent(IStudent student);
    boolean removeStudent(String id);
    IStudent findStudentById(String id);
    java.util.Set<IStudent> findStudentsByMajor(String major);
    java.util.Set<IStudent> getAllStudents();
    int getTotalStudents();
    java.util.Set<IStudent> getTopStudents(double minGPA);
    java.util.Set<String> getAllMajors();
    boolean hasStudent(String id);
}
