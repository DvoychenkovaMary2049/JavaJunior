package homework3;

public class Task1 {
    public static void main(String[] args) {
        //Вывести на консоль сумму четных чисел этого массива
        int[] numbs = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;

        for (int i = 0; i < numbs.length; i++) {
            if (numbs[i] % 2 == 0) {
                sum = sum + numbs[i];
            }
        }
        System.out.println(sum);
    }
}
