package homework5;


class EmployeeTest {
    public static void main(String[] args) {
      Employee[] employeesArr = new Employee[5];
      employeesArr[0] = new Employee("Абрамов Виктор Валерьевич", "dev1", "someemail", "99292929292", "1000$", 47);
      employeesArr[1] = new Employee("Хабарова Ольга Викторовна", "dev2", "ASDasd@asdasd", "8926545887", "1500$", 32);
      employeesArr[2] = new Employee("Осипова Вера Викторовна", "dev3", "sdasd@wqeqw", "2223334444", "2000$", 42);
      employeesArr[3] = new Employee("Столяров Илья Михайлович", "dev4", "asdasd@poius", "87412587", "2500$", 34);
      employeesArr[4] = new Employee("Абузяров Марат Ханяфиявич", "dev5", "aszcxbgtgr@savvd", "123123222", "3000$", 54);

        for (int i = 0; i < employeesArr.length; i++) {
            if (employeesArr[i].getAge() >= 40){
                System.out.println("сотрудники старше 40 лет:" + employeesArr[i].getFullname() + " " + employeesArr[i].getAge());
            }

        }
    }
}