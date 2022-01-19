package Zaur;

public class Main {
    public static void main(String[] args) {
        Student st1 = new Student();

        st1.name = "Ваня ";
        st1.sureName = "Горохов ";
        st1.course = 4;
        st1.foreignLanguageAverageGrade = 4.1;
        st1.economicsAverageGrade = 4.9;
        st1.mathAverageGrade = 4.3;

        StudentTest stTest1 = new StudentTest();
        stTest1.sredOrifmOcenka(st1);
    }
}
