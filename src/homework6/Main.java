package homework6;

public class Main {
    public static void main(String[] args) {

        Journals journal1 = new Journals("Elle Girl", 2021,62,"Elle Girl");
        Journals journal2 = new Journals("Думай", 2020, 24, "DUMA");
        Journals journal3 = new Journals("Холодное сердце", 2021, 9, "FROZEN");

        Books book1 = new Books("Гарри Поттер и узник Азкабана", "Роулинг Д.", 2020, 529, "Махаон");
        Books book2 = new Books("Щелкунчик и мышиный король", "Гофман Эрнст Теодор Амадей", 2019, 104, "Проф-Пресс");
        Books book3 = new Books("Ведьмак", "Сапковский Анджей", 2020, 1344, "АСТ");

        Library [] libraries = new Library[6];
        libraries [0] = journal1;
        libraries [1] = book1;
        libraries [2] = journal2;
        libraries [3] = book2;
        libraries [4] = journal3;
        libraries [5] = book3;

        for (Library l: libraries){
            l.printBooks();
        }
        }
}
