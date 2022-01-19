package Zaur.lesson6;

public class MethodOverLoadingTest {
    public static void main(String[] args) {
        MethodOverLoading mO = new MethodOverLoading();
        int a = 500;
        mO.show(a);
        boolean b = true;
        mO.show(b);
        String s = "ПРИВЕТ";
        mO.show(s);
    }
}
