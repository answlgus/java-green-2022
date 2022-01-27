package coffeemaker;

public class Barista {
    public void makeCoffee(MenuItem menuItem) {
    }
}

class 공유 extends Barista {
    String name;

    공유(String name) {
        this.name = name;
    }

    public void makeCoffee(MenuItem menuItem) {
        Coffee coffee = new Coffee(menuitem);
        return coffee;
    }
}
