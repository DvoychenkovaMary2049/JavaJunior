package homework3;

public class Task3 {
    public static void main(String[] args) {
        //Вывести через ячейку
        int[] numbs = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < numbs.length; i = i + 2) {
            System.out.println(numbs[i]);
        }
    }
}
