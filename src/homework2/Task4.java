package homework2;

public class Task4 {
    public static void main(String[] args) {
        // среднее значение нечетных чисел от 0-100
        int summa = 0;
        int count = 0;
        int average = 0;

        for (int i = 0; i <= 100; i++) {
            if (i % 2 != 0){
                summa += i;
            count++;}
        }
        average = summa / count ;
        System.out.println(average);
    }
}
