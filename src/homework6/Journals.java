package homework6;

public class Journals extends Library {
    private String name;
    private int yearOfPublication;
    private int numberInTheYear;
    private String publisher;

    public Journals() {
    }

    public Journals(String name, int yearOfPublication, int numberInTheYear, String publisher) {
        this.name = name;
        this.yearOfPublication = yearOfPublication;
        this.numberInTheYear = numberInTheYear;
        this.publisher = publisher;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public int getNumberInTheYear() {
        return numberInTheYear;
    }

    public void setNumberInTheYear(int numberInTheYear) {
        this.numberInTheYear = numberInTheYear;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @Override
    public void printBooks() {
        System.out.printf("Журнал: %s, год выхода - %s, %s номер, издательство %s.\n", name, yearOfPublication, numberInTheYear, publisher  );
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Journals journals = (Journals) o;

        if (yearOfPublication != journals.yearOfPublication) return false;
        if (numberInTheYear != journals.numberInTheYear) return false;
        if (name != null ? !name.equals(journals.name) : journals.name != null) return false;
        return publisher != null ? publisher.equals(journals.publisher) : journals.publisher == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + yearOfPublication;
        result = 31 * result + numberInTheYear;
        result = 31 * result + (publisher != null ? publisher.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Journals{" +
                "name='" + name + '\'' +
                ", yearOfPublication=" + yearOfPublication +
                ", numberInTheYear=" + numberInTheYear +
                ", publisher='" + publisher + '\'' +
                '}';
    }
}
