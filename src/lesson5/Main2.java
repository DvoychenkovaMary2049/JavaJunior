package lesson5;

public class Main2 {
    public static void main(String[] args) {
        String [] [] tours = { { "Турция", "75000", "9", "4 звезды", "самолет"},
                               { "Египет", "90000", "6", "3 звезды", "автобус"},
                               { "Тунис", "150000", "7", "3 звезды", "самолет"},
                               { "Турция", "120000", "5", "4 звезды", "автобус"},
                               { "ОАЭ",    "40000", "5", "5 звезды", "самолет"},
                               { "ОАЭ",    "90000", "4", "4 звезды", "самолет"}};

//       ToursUtils.printToursByCountry (tours, "Турция");
//       ToursUtils.printToursByCountry(tours, "ОАЭ");

//       ToursUtils.printToursFromToPrice(tours, 60000, 100000);

//        ToursUtils.printToursFromToStars(tours, 4,5);

//        ToursUtils.printToursFromToCountry(tours, "Турция",60000, 100000);

//        ToursUtils.printToursTransport(tours, "автобус");

          ToursUtils.printToursAveragePrice(tours, "Тунис");
    }
}
