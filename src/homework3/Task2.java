package homework3;

public class Task2 {
    public static void main(String[] args) {
        // Вывести кого больше в массиве, четных или нечетных?
        int[] numbs = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int even = 0;//четный
        int uneven = 0;//нечетный

        for (int i = 0; i < numbs.length; i++) {
            if (numbs[i] % 2 == 0) {
                even++;
            }
            if (numbs[i] % 2 != 0) {
                uneven++;
            }
        }

        if (even > uneven) {
            System.out.println("В массиве больше четных.");
        } else if (even < uneven) {
            System.out.println("В массиве больше нечетных.");
        } else {
            System.out.println("В массиве кол-во четных и нечетных равны.");
        }
    }
}
