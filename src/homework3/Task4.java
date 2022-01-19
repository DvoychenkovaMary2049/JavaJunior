package homework3;

public class Task4 {
    public static void main(String[] args) {
        // Вывести на консоль только гласные из этого массива
        char[] abcdef = {'a', 'b', 'c', 'd', 'e', 'f'};
        for (int i = 0; i < abcdef.length; i++) {
            if (abcdef[i] == 'a' || abcdef[i] == 'e' || abcdef[i] == 'y' || abcdef[i] == 'u' || abcdef[i] == 'o' || abcdef[i] == 'i') {
                System.out.println(abcdef[i]);
            }
        }
    }
}
