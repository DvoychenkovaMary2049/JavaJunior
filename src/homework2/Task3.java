package homework2;

public class Task3 {
    public static void main(String[] args) {
        // вывести от 10-50, но не выводить 20-25
        for (int i = 10; i <= 50; i++) {
            if (20 <= i && i <= 25) {
                continue;
            }
                System.out.println(i);
        }
    }
}
