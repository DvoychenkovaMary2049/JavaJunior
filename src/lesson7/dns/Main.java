package lesson7.dns;

public class Main {
    public static void main(String[] args) {
        Otziv otziv1 = new Otziv();
        otziv1.setRate(5);
        otziv1.setMainText("Очень хороший товар");
        otziv1.setUsername("qwertyuiop");

        Otziv otziv2= new Otziv();
        otziv2.setRate(4);
        otziv2.setMainText("Нет инструкции");
        otziv2.setUsername("asdfgh");

        Tovar elka = new Tovar();
        elka.setName("Елка 2 метра");
        elka.setFullPrise(2000);
        elka.setSalePrise(1499);
        elka.addOtziv(otziv1);
        elka.addOtziv(otziv2);



    }
}
