package lesson4;

public class Main1 {
    public static void main(String[] args) {
//        int [] [] mass= {{2,6,3,7},// нулевая строка
//                         {3,2,5,7},// первая строка
//                         {4,3,7,8}};// вторая строка

        int[][] mass = new int[8][8];

        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                if (i == j) {

                    System.out.print(mass[i][j] + " ");
                } else {
                    System.out.print(" " + " ");
                }

            }
            System.out.println();
        }
    }
}