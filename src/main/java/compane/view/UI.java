package compane.view;

import compane.model.StatusWorker;
import compane.model.Worker;
import compane.model.WorkerDB;
import compane.model.WorkerHandler;

import java.util.Scanner;

public class UI {
    WorkerHandler worker = new WorkerDB();
    Scanner scanner = new Scanner(System.in);

    public void infoByUser() {
        System.out.println("Получить список сотрудников  ввудите: \"All\" \n" +
                " Получить информацию о конкретном сотруднике введите \"User\"\n" +
                " Удалить сотрудника из базы  введите \"Delete \" \n" +
                " Добавить нового сотрудника в базу  введите \"Add\" и заполните необходимые данные \n" +
                " Изменить статус сотрудника  введите \"Status \" \n" +
                " Изменить заработную плату \"Salary\" \n" +
                " Изменить занимаемую должность \"Position\" \n"+
                "Для выхода введите \"Out\""

        );
    }

    public boolean processing(String request) {
        switch (request) {
            case ("All"):
                worker.allInfo();
                break;
            case ("User"):
                worker.info(haveName());
                break;
            case ("Delete"):
                worker.deleteFromDatabase(haveName());
                break;
            case ("Add"):
                worker.addWorker(haveWorker());
                break;
            case ("Status"):
                worker.changeStatus(haveName(), haveStatus());
                break;
            case ("Salary"):
                worker.changeSalary(haveName(), haveSalary());
                break;
            case ("Position"):
                worker.changePosition(haveName(), havePosition());
                break;
            case ("Out"):
               return false ;

        }
        return true;
    }


    private String haveName() {
        System.out.println("Введите имя сотрудника");
        String answer = String.valueOf(scanner.nextLine());
        return answer;
    }


    private Worker haveWorker() {
        Worker worker = new Worker();
        System.out.println("Введите имя нового сотрудника");
        worker.setName(scanner.nextLine());
        System.out.println("Введите должность нового сотрудника");
        worker.setPosition(scanner.nextLine());
        System.out.println("Введите номер телефона начиная с  '7'  нового сотрудника");
        worker.setPhone(scanner.nextLong());
        System.out.println("Введите зарабатную плату нового сотрудника");
        worker.setSalary(scanner.nextInt());
        System.out.println("Введите статус нового сотрудника");
        worker.setStatus(StatusWorker.valueOf(String.valueOf(scanner.nextLine())));
        return worker;
    }

    private StatusWorker haveStatus() {
        System.out.println("Введите статус сотрудника");
        StatusWorker answer = StatusWorker.valueOf(scanner.nextLine());
        return answer;
    }

    private int haveSalary() {
        System.out.println("Введите заработную плату сотрудника");
        int salary = scanner.nextInt();
        return salary;
    }

    private String havePosition() {
        System.out.println("Введите должность сотрудника");
        String answer = String.valueOf(scanner.nextLine());
        return answer;
    }

}
