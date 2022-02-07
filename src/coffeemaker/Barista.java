package coffeemaker;

public abstract class Barista { 
    abstract Coffee makeCoffee(MenuItem menuItem);

    abstract String getName();
}

class 공유 extends Barista {
    String name = "공유";

    공유(String name) {
        this.name = name;
    }

    @Override
    Coffee makeCoffee(MenuItem menuItem) {
        Coffee coffee = new Coffee(menuItem);
        return coffee;
    }

    @Override
    String getName() {
        this.name = name;
        return null;
    }

}
