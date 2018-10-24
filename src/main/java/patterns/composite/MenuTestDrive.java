package patterns.composite;

public class MenuTestDrive {
    public static void main(String args[]){
        MenuComponent pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU", "Breakfast");
        MenuComponent dinnerMenu = new Menu("DINER MENU", "lunch");
        MenuComponent cafeMenu = new Menu("CAFE MENU", "Dinner");
        MenuComponent dessertMenu = new Menu("DESSERT MENU", "Dessert of course!");
        MenuComponent allMenus = new Menu("All MENU", "ALL menus combined");
        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinnerMenu);
        allMenus.add(cafeMenu);
        dinnerMenu.add(new MenuItem("pasta","marinara",true,1.59));
        Waitress waitress = new Waitress(allMenus);
        waitress.printMenu();

    }
}
