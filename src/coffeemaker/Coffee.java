package coffeemaker;

public class Coffee {
    private String name;
    private int price;

    public Coffee(MenuItem menuitem) { // 커피 이름과 가격 get
        this.name = menuitem.getName();
        this.price = menuitem.getPrice();
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
