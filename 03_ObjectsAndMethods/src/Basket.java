public class Basket {

    private String items = "";
    private int totalPrice = 0;
    private int limit;
    private double totalWeight = 0.0;

    public Basket(){
        items = "Список товаров:";
        this.limit = 1000000;
    }

    public Basket(int limit){
        this();
        this.limit = limit;
    }

    public Basket(String items, int totalPrice){
        this();
        this.items = this.items + items;
        this.totalPrice = totalPrice;
    }

    public void add(String name, int price){
        add(name, price, 1);
    }

    public void add(String name, int price, int count, double weight){ // 1
        add(name, price, count);
        totalWeight = totalWeight + count * weight;
    }

    public void add(String name, int price, double weight){ // 2
        add(name, price, 0, weight);
    }

    public void add(int count, String name){

    }

    public void add(String name, int price, int count){
        if (contains(name)){
            return;
        }
        if (totalPrice + count * price >= limit){
            return;
        }
        items = items + "\n" + name + " * " +
                count + " шт. = " + count * price + " руб.";
        totalPrice = totalPrice + count * price;
    }

    public void clear() {
        items = "";
        totalPrice = 0;
        totalWeight = 0;
    }

    public int getTotalPrice(){
        return totalPrice;
    }

    public double getTotalWeight(){
        return totalWeight;
    }

    public boolean contains(String name){
        return items.contains(name);
    }

    public void print(String title){
        System.out.println(title);
        if (items.isEmpty()){
            System.out.println("Корзина пуста");
        } else {
            System.out.println(items);
        }
    }
}
