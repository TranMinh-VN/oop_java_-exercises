package part8_design_pattern.observer_pattern;

// ==================== INTERFACES (CUNG CẤP CHO SINH VIÊN) ====================

/**
 * Interface Observer - Đối tượng quan sát
 */
public interface Observer {
    void update(float temperature, float humidity, float pressure);
}
