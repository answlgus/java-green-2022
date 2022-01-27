package coffeemaker;

import java.util.List;

//menuitem에 해당하는 MenuItem 찾기
public class Menu {
    private List<MenuItem> items;

    public Menu(List<MenuItem> items) {
        this.items = items;
    }

    public MenuItem choose(String menuName) { // 이름이 동일한 MenuItem을 찾아서 반환
        for (MenuItem each : items) {
            if (each.getName().equals(menuName)) {
                return each;
            }
        }
        return null;
    }
}
