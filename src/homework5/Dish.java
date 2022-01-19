package homework5;

import javax.swing.*;

public class Dish {
    private String name; // название блюда
    private String weight; // вес блюда
    private String ingredients; // ингредиенты блюда
    private String image; // фото блюда
    private int prise; // цена блюда

    public Dish() {
    }

    public Dish(String name, String weight, String ingredients, String image, int prise) {
        this.name = name;
        this.weight = weight;
        this.ingredients = ingredients;
        this.image = image;
        this.prise = prise;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getPrise() {
        return prise;
    }

    public void setPrise(int prise) {
        this.prise = prise;
    }
}
