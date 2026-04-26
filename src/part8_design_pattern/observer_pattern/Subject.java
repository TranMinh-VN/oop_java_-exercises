package part8_design_pattern.observer_pattern;

// ==================== INTERFACES (CUNG CẤP CHO SINH VIÊN) ====================

/**
 * Interface Subject - Đối tượng được quan sát
 */
public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
