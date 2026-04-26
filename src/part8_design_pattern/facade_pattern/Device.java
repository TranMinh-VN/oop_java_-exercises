package part8_design_pattern.facade_pattern;

// ==================== INTERFACES (CUNG CẤP CHO SINH VIÊN) ====================

/**
 * Interface cho các thiết bị trong hệ thống Home Theater
 */
public interface Device {
    void turnOn();
    void turnOff();
    String getStatus();
}
