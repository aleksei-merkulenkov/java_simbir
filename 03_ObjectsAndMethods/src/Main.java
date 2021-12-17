public class Main {
    public static void main(String[] args) {
        Basket vasyaBasket = new Basket();

        vasyaBasket.add("Молоко", 75,2);
        vasyaBasket.add("Хлеб", 50,3,200);
        vasyaBasket.add("Масло", 75,2,400);

        vasyaBasket.print("Корзина Васи");
        System.out.println("Общий вес: " + vasyaBasket.getTotalWeight() + " грамм");
        System.out.println("Стоимость: " + vasyaBasket.getTotalPrice() + " руб.");

        vasyaBasket.clear();
        System.out.println();
        vasyaBasket.print("Корзина Васи");
        System.out.println("Общий вес: " + vasyaBasket.getTotalWeight() + " грамм");
        System.out.println("Стоимость: " + vasyaBasket.getTotalPrice() + " руб.");
    }
}
