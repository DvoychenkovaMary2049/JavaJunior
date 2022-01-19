package Zaur;

public class EmployeeTest {
    public static void main(String[] args) {

        Employee emp1 = new Employee(4, "Соколов", 45, 45555, "Печатник");

        emp1.uvelichZp();
        System.out.println("Новая зарплата: " + emp1.surname + "  " + emp1.salary);

    }
}
