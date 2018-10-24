package patterns.composite;


import java.util.ArrayList;
import java.util.Iterator;

public class Menu extends MenuComponent {
    ArrayList menucomponents = new ArrayList();
    String name;
    String description;

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public void add(MenuComponent menuComponent) {
        menuComponent.add(menuComponent);
    }

    public void remove(MenuComponent menuComponent) {
        menuComponent.remove(menuComponent);
    }

    public MenuComponent getChild(int i) {
        return (MenuComponent) menucomponents.get(i);
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void print() {
        System.out.println(getName());
        System.out.println(getDescription());
        System.out.println("---------");
    }

    Iterator iterator = menucomponents.iterator();
    while(iterator.hasNext())

    {
        MenuComponent menuComponent = (MenuComponent) Iterator.next();
        menuComponent.print();
    }
}

