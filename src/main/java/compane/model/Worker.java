package compane.model;


/**
 * Класс шаблон\модель
 */
 public class Worker {
    private String name;
    private String position;
    private long phone;
    private int salary;
    private StatusWorker status;

     public Worker(String name, String position, long phone, int salary, StatusWorker status) {
         this.name = name;
         this.position = position;
         this.phone = phone;
         this.salary = salary;
         this.status = status;
     }

     public Worker() {

     }


     public void setName(String name) {
        this.name = name;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setPhone(long phone) {
        String   s = String.valueOf(phone);
        if (s.charAt(0)!= '7'){
            System.out.println("Неверный номер телефона");
            System.out.println("Номер должен начинаться с цыфры 7");

        }else if(s.length()>10){
            System.out.println("Неверный номер телефона");
            System.out.println("Проверьте длинну набранного номера");
           }else {
            this.phone = phone;
        }
    }

    public void setSalary(int salary)  {
        if (salary<=0){
            System.out.println("Зарплата не может быть отрицательной или 0");
        }else {
            this.salary = salary;
        }
    }

    public void setStatus(StatusWorker status) {
        this.status = status;
    }

       @Override
    public String toString() {
        return   "Name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", phone=" + phone +
                ", salary=" + salary +
                ", status=" + status;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public long getPhone() {
        return phone;
    }

    public int getSalary() {
        return salary;
    }

    public StatusWorker getStatus() {
        return status;
    }


 }
