package Zaur;

public class Employee {

    int id;
    String surname;
    int age;
    int salary; //зарплата
    String department; // отдел


    Employee(int id1, String surname1, int age1, int salary1, String department1) {
        id = id1;
        surname = surname1;
        age = age1;
        salary = salary1;
        department = department1;

    }

    int uvelichZp() {
        salary = salary * 2;
        return salary;
    }
}
