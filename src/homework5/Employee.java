package homework5;

public class Employee {

    private String fullname;
    private String position;
    private String email;
    private String telephoneNumber;
    private String salary;
    private int age;


    public Employee(String fullname, String position, String email, String telephoneNumber, String salary, int age) {
        this.fullname = fullname;
        this.position = position;
        this.email = email;
        this.telephoneNumber = telephoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void info() {
        System.out.println("ФИО: " + fullname + "; Должность: " + position + "; email: " + email + "; номер телефона: " + telephoneNumber + "; Зарплата: " + salary + "; Возраст: " + age );
    }

}
