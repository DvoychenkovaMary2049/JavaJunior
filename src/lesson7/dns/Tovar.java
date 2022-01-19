package lesson7.dns;

public class Tovar {
    private String name;//название
    private int fullPrise;//полная цена
    private int salePrise;//цена со скидкой
    private Otziv [] otzivs = new Otziv[1000];

    public Tovar() {
    }

    public Tovar(String name, int fullPrise, int salePrise) {
        this.name = name;
        this.fullPrise = fullPrise;
        this.salePrise = salePrise;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFullPrise() {
        return fullPrise;
    }

    public void setFullPrise(int fullPrise) {
        this.fullPrise = fullPrise;
    }

    public int getSalePrise() {
        return salePrise;
    }

    public void setSalePrise(int salePrise) {
        this.salePrise = salePrise;
    }

    public Otziv[] getOtzivs() {
        return otzivs;
    }

    public void setOtzivs(Otziv[] otzivs) {
        this.otzivs = otzivs;
    }

    public void addOtziv(Otziv otz) {
        for (int i = 0; i < otzivs.length; i++){
            if (otzivs[i]==null){
                otzivs[i] = otz;
                break;

            }
        }
    }
}
