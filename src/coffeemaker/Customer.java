package coffeemaker;

public abstract class Customer {
    abstract void order(String menuName, Menu menu, Barista barista);

    abstract String getName();

}

class 홍길동 extends Customer {

    String name = "홍길동";

    홍길동(String name) {
        this.name = "홍길동";
    }

    public void order(String menuName, Menu menu, Barista barista) {
        MenuItem menuItem = menu.choose(menuName);
        Coffee coffee = barista.makeCoffee(menuItem);

        System.out.println(this.name + "이" + menuItem.getPrice() + "원" + menuItem.getName() + "를 받았습니다");

    }

    @Override
    String getName() {
        this.name = name;
        return null;
    }

}
