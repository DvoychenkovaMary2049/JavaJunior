package lesson6;

public class Parallelepiped {
    private int a;
    private int b;
    private int c;

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setC(int c) {

        this.c = c;
    }

    public int ploshad() {
        return (a * b + a * c + c * b) * 2;
    }

    public int perimetr() {
        return 4 * (a + b + c);
    }

    public int volume() {
        return a * b * c;
    }
}
