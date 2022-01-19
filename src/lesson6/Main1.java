package lesson6;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        System.out.println("Выберите фигуру, которую хотите посчитать");
        System.out.println("1 - треугольник");
        System.out.println("2 - круг");
        System.out.println("3 - параллелепипед");
        System.out.println("4 - овал");
        System.out.println("5 - конус");

        Scanner scanner = new Scanner(System.in);
        int selectedFigura = scanner.nextInt();
        switch (selectedFigura) {

            case 1:
                System.out.println("Введите сторону A: ");
                int a = scanner.nextInt();
                System.out.println("Введите сторону B: ");
                int b = scanner.nextInt();
                System.out.println("Введите сторону C: ");
                int c = scanner.nextInt();

                Treugolnik treugolnik = new Treugolnik();
                treugolnik.setA(a);
                treugolnik.setB(b);
                treugolnik.setC(c);
                if (treugolnik.ploshad() != -1) {
                    System.out.println("Площадь треугольника: " + treugolnik.ploshad());
                    System.out.println("Периметр треугольника: " + treugolnik.perimetr());
                }
                break;

            case 2:
                System.out.println("Введите радиус: ");
                int radius = scanner.nextInt();

                Krug krug = new Krug();
                krug.setRadius(radius);
            {
                System.out.println("Площадь круга: " + krug.ploshad());
                System.out.println("Периметр круга: " + krug.perimetr());
            }
            break;

            case 3:
                System.out.println("Введите длину ребра А: ");
                int aP = scanner.nextInt();
                System.out.println("Введите длину ребра B: ");
                int bP = scanner.nextInt();
                System.out.println("Введите длину ребра C: ");
                int cP = scanner.nextInt();

                Parallelepiped parallelepiped = new Parallelepiped();
                parallelepiped.setA(aP);
                parallelepiped.setB(bP);
                parallelepiped.setC(cP);
            {
                System.out.println("Площадь параллелепипеда : " + parallelepiped.ploshad());
                System.out.println("Периметр параллелепипеда : " + parallelepiped.perimetr());
                System.out.println("Объем параллелепипеда : " + parallelepiped.volume());
            }
            break;

            case 4:
                System.out.println("Введите длину полуоси А: ");
                int aO = scanner.nextInt();
                System.out.println("Введите длину полуоси B: ");
                int bO = scanner.nextInt();

                Oval oval = new Oval();
                oval.setA(aO);
                oval.setB(bO);
            {
                System.out.println("Площадь овала: " + oval.ploshad());
                System.out.println("Периметр овала: " + oval.perimetr());
            }
            break;

            case 5:
                System.out.println("Введите радиус: ");
                int radiusK = scanner.nextInt();
                System.out.println("Введите длину образующей: ");
                int l = scanner.nextInt();

                Konus konus = new Konus();
                konus.setRadius(radiusK);
                konus.setL(l);
            {
                System.out.println("Площадь боковой поверхности конуса: " + konus.ploshadB());
                System.out.println("Площадь поверхности конуса : " + konus.ploshadP());
                System.out.println("Площадь основания: " + konus.plashadOsn());
                System.out.println("Объем конуса: " + konus.volume());
            }

            break;

            default:
                System.out.println("Такой фигуры у нас пока нет.");
        }
    }
}
