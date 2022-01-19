package lesson6;

public class Oval {
    private int a;
    private int b;

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public double ploshad() {
        return Math.PI * a * b;
    }

    public double perimetr() {
        return 2 * Math.PI * Math.sqrt((a * a + b * b) / 2);
    }
}
