package lesson5;

public class ToursUtils {

    public static void printToursByCountry(String[][] toursBySort, String country) {
        for (int i = 0; i < toursBySort.length; i++) {
            if (toursBySort[i][0].equals(country)) {
                System.out.printf
                        ("Тур: %s, %s, %s, %s, транспорт - %s \n", toursBySort[i][0], toursBySort[i][1],
                                toursBySort[i][2], toursBySort[i][3], toursBySort[i][4]);
            }
        }

    }

    public static void printToursFromToPrice(String[][] tours, int from, int to) {
        for (int i = 0; i < tours.length; i++) {
            String tourPrice = tours[i][1];
            int tourPriceNum = Integer.parseInt(tourPrice);
            if (tourPriceNum >= from && tourPriceNum <= to) {
                System.out.printf
                        ("Тур: %s, %s, %s, %s, транспорт - %s \n", tours[i][0], tours[i][1], tours[i][2],
                                tours[i][3], tours[i][4]);
            }
        }

    }

    public static void printToursFromToStars(String[][] toursStar, int from, int to) {
        for (int i = 0; i < toursStar.length; i++) {
            String tourPrice = toursStar[i][3];
            int st = tourPrice.indexOf(' ');
            String st1 = tourPrice.substring(0, st);

            int tourPriceNum = Integer.parseInt(st1);
            if (tourPriceNum >= from && tourPriceNum <= to) {
                System.out.printf
                        ("Тур: %s, %s, %s, %s, транспорт - %s \n", toursStar[i][0], toursStar[i][1], toursStar[i][2],
                                toursStar[i][3], toursStar[i][4]);
            }

        }

    }

    public static void printToursFromToCountry(String[][] toursCountry, String country, int from, int to) {
        for (int i = 0; i < toursCountry.length; i++) {
            String tourPrice = toursCountry[i][1];
            int tourPriceNum = Integer.parseInt(tourPrice);

            if (toursCountry[i][0].equals(country) && (tourPriceNum >= from && tourPriceNum <= to)) {
                System.out.printf
                        ("Тур: %s, %s, %s, %s, транспорт - %s \n", toursCountry[i][0], toursCountry[i][1], toursCountry[i][2],
                                toursCountry[i][3], toursCountry[i][4]);

            }

        }

    }

    public static void printToursTransport(String[][] toursTransport, String transport) {
        for (int i = 0; i < toursTransport.length; i++) {
            if (toursTransport[i][4].equals(transport)) {
                System.out.printf
                        ("Тур: %s, %s, %s, %s, транспорт - %s \n", toursTransport[i][0], toursTransport[i][1],
                                toursTransport[i][2], toursTransport[i][3], toursTransport[i][4]);
            }
        }
    }


    public static void printToursAveragePrice(String[][] toursAvPrice, String country) {
        int summa = 0;
        int count = 0;
        int average = 0;

        for (int i = 0; i < toursAvPrice.length; i++) {
            String tourPrice = toursAvPrice[i][1];
            int tourPriceNum = Integer.parseInt(tourPrice);

            if (toursAvPrice[i][0].equals(country)) {
                summa += tourPriceNum;
                count++;
                average = summa / count;
            }
        }
            average = summa / count;
            System.out.printf("Тур : %s, средняя цена %s\n", country, average);
    }
}

// напечатать все туры от ... звезд и выше +
// напечатать туры только в ... страну от ... до ... по бюджету +
// напечатать туры только на ... (вид транспорта) +
// напечатать среднюю цену тура в ... страну +