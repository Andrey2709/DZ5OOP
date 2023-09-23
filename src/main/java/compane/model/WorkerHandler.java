package compane.model;

/**
 * Для реализации управления системой необходимы все методы представленные в данном интерфейсе
 */
public interface WorkerHandler {
    void changeStatus(String name, StatusWorker statusWorker);

    void changeSalary(String name, int salary);

    void changePosition(String name, String position);

    void deleteFromDatabase(String name);

    void info(String name);

    void addWorker(Worker worker);

    void allInfo();

}
