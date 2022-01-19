package lesson6;

public class Konus {
    private int radius;
    private int l;

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setL(int l) {
        this.l = l;
    }

    public double ploshadB() {
        return Math.PI * radius * l;
    }

    public double ploshadP() {
        return Math.PI * radius * (l + radius);
    }

    public double plashadOsn() {
        return Math.PI * radius * radius;
    }

    public double volume() {
        return (1 * Math.PI * radius * radius * (Math.sqrt(l * l - radius * radius))) / 3;
    }
}
