package compane.view;

/**
 * Интерфейс прослойка для реализации  Liskov substitution Principle
 */
public interface UI {
    boolean processing(String request);
    void infoByUser();
}
