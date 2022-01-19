package homework5;

public class Menu {
    private String name;
    private Dish[] dishes = new Dish[1000];

    public Menu() {
    }

    public Menu(String name, Dish[] dishes) {
        this.name = name;
        this.dishes = dishes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dish[] getDishes() {
        return dishes;
    }

    public void setDishes(Dish[] dishes) {
        this.dishes = dishes;
    }

    public void addDish(Dish dish) {
        for (int i = 0; i < dishes.length; i++) {
            if (dishes[i]==null) {
                dishes[i] = dish;
                break;
            }
        }
    }
}