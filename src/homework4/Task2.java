package homework4;

public class Task2 {
    public static void main(String[] args) {
        //в шахматном порядке
        int[][] mass = new int[8][8];

        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass.length; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print(mass[i][j] + " ");
                } else {
                    System.out.print(" " + " ");
                }
            }
            System.out.println();
        }
    }

}
