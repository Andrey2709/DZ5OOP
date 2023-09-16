package compane.model;

import java.util.ArrayList;
import java.util.List;

public class WorkerDB implements WorkerHandler {

    private static List<Worker> workers = new ArrayList<>(List.of(
            new Worker("Ivan", "Director", 7_921_234_1541l, 70000, StatusWorker.APPROVED),
            new Worker("Anna", "Manage", 7_921_299_1541l, 30000, StatusWorker.APPROVED),
            new Worker("Valera", "Manage", 7_921_234_1541l, 30000, StatusWorker.ILL),
            new Worker("Evgen", "Manage", 7_921_234_6541l, 30000, StatusWorker.APPROVED),
            new Worker("Roman", "Manage", 7_921_234_1541l, 30000, StatusWorker.DISMISS),
            new Worker("Genadi", "Accountant", 7_941_284_1541l, 50000, StatusWorker.VACATION),
            new Worker("Natasha", "Loader", 7_938_234_1541l, 40000, StatusWorker.APPROVED),
            new Worker("Fedor", "Loader", 7_923_234_1541l, 40000, StatusWorker.APPROVED),
            new Worker("Lord Vader", "King", 7_921_234_2341l, 100000, StatusWorker.VACATION)
    ));

    @Override
    public void changeStatus(String name, StatusWorker statusWorker) {
        workers.stream().filter(worker -> worker.getName().equals(name)).findFirst().get().setStatus(statusWorker);
    }

    @Override
    public void call(String name) {
        System.out.println("Сотруджника " + name + " вызвали на ковер");
    }

    @Override
    public void changeSalary(String name, int salary) {
        workers.stream().filter(worker -> worker.getName().equals(name)).findFirst().get().setSalary(salary);
    }

    @Override
    public void changePosition(String name, String position) {
        workers.stream().filter(worker -> worker.getName().equals(name)).findFirst().get().setPosition(position);
    }

    @Override
    public void deleteFromDatabase(String name) {
        workers.removeIf(worker -> worker.getName().equals(name));

    }

    @Override
    public void info(String name) {
        System.out.println(workers.stream().filter(worker -> worker.getName().equals(name)).findFirst().orElseThrow());
    }

    @Override
    public void addWorker(Worker worker) {
        workers.add(worker);
    }

    @Override
    public void allInfo() {
        for (Worker worker:workers) {
            System.out.println(worker.toString());
        }
    }
}
