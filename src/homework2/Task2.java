package homework2;

public class Task2 {
    public static void main(String[] args) {
        // вывести сумму четных чисел от 20-40
        int summa = 0;
        for (int i = 20; i <= 40; i++) {
            if (i % 2 == 0)
                summa += i;
        }
        System.out.println(summa);
    }
}
