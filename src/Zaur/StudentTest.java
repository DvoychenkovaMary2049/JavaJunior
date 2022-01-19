package Zaur;

public class StudentTest {
    double sredOrifmOcenka (Student st){
        double sredOcenka =(st.mathAverageGrade + st.economicsAverageGrade + st.foreignLanguageAverageGrade) / 3;
        System.out.println("Средняя оценка ученика: " + st.name + st.sureName + sredOcenka);
        return sredOcenka;
    }
}
