package coffeemaker;

public abstract class Customer {
    public void order(String menuName, Menu menu, Barista barista) {

    }
}

class 홍길동 extends Customer {
    String name;

    홍길동(String name) {
        this.name = name;
    }

    public void order(String menuName, Menu menu, Barista barista) {
        MenuItem menuItem = menu.choose(menuName);
        Coffee coffee = barista.makeCoffee(menuItem);
    }
}
