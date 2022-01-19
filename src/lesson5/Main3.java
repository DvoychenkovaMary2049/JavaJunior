package lesson5;

public class Main3 {
    public static void main(String[] args) {
        String s1 = "qwe12qwe345qwe678qwe90qwe";
        String s2 = "qwe";
        StringBuffer s = new StringBuffer(s1);
        int p = -1;
        while ( (p = s.toString().indexOf(s2)) >= 0 ) {
            s.delete(p, p + s2.length());
        }
        s1 = s.toString();
    }
}
