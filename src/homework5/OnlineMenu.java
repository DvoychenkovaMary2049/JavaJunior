package homework5;

public class OnlineMenu {
    public static void main(String[] args) {

        Dish soupTomat = new Dish();
        soupTomat.setName("Томатный суп со свежим базиликом");
        soupTomat.setWeight("260 грамм");
        soupTomat.setIngredients("Овощной бульон, лук репчатый, томаты, базилик, чеснок. Подается с хлебной равиоле и сыром");
        soupTomat.setImage("путь к файлу");
        soupTomat.setPrise(250);

        Dish saladVeget = new Dish();
        saladVeget.setName("Овощной салат ");
        saladVeget.setWeight("200 грамм");
        saladVeget.setIngredients("Помидоры, огурцы свежие, редис, перец болгарский, лук красный, масло или сметана");
        saladVeget.setImage("путь к файлу");
        saladVeget.setPrise(350);

        Dish fettuccine = new Dish();
        fettuccine.setName("Феттуччине с креветками");
        fettuccine.setWeight("320 грамм");
        fettuccine.setIngredients("Паста феттуччине с обжаренными креветками и томатным соусом, с добавлением ароматного базилика и томатов черри");
        fettuccine.setImage("путь к файлу");
        fettuccine.setPrise(520);

        Dish cheesecake = new Dish();
        cheesecake.setName("Чизкейк с ягодным соусом");
        cheesecake.setWeight("125 грамм");
        cheesecake.setIngredients("Яйцо куриное, сливки, творожный сыр, сахар, апельсин, мука, масло сливочное. Подается с топпингом лесные ягоды");
        cheesecake.setImage("путь к файлу");
        cheesecake.setPrise(295);

        Menu dishesMenu = new Menu();
        dishesMenu.setName("Меню блюд");
        dishesMenu.addDish(soupTomat);
        dishesMenu.addDish(saladVeget);
        dishesMenu.addDish(fettuccine);
        dishesMenu.addDish(cheesecake);

    }
}
