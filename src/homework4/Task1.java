package homework4;

public class Task1 {
    public static void main(String[] args) {
        //диагональ наоборот
        int[][] mass = new int[8][8];

        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                if (i + j == mass.length - 1) {
                    System.out.print(mass[i][j] + " ");
                } else {
                    System.out.print(" " + " ");
                }
            }
            System.out.println();
        }
    }
}

