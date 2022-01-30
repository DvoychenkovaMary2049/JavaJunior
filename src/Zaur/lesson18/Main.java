package Zaur.lesson18;

public class Main extends Test {
    public static void main(String[] args) {
        int [] array = { 3, 6, 1, -7, -9, 6, -1};
        sortirovka(array);
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}
