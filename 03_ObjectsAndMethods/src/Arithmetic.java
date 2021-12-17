public class Arithmetic {
    public static void main(String[] args) {
        Arithmetic arithmetic = new Arithmetic(2, 5);
        arithmetic.additional();
        arithmetic.subtraction();
        arithmetic.multiplication();
        arithmetic.averageValue();
        arithmetic.maxValue();
        arithmetic.minValue();
    }
    public static int x;
    public static int y;

    public Arithmetic(int x, int y){
        this.x = x;
        this.y = y;
    }

    public static int additional() {
        return (x + y); } //  сумма

    public static int subtraction() {
        return (x - y); } //  разность

    public static int multiplication() {
        return (x * y); } //  произведение

    public static double averageValue () {
        return ((x + y) / 2); }   //  среднее значение

    public static int maxValue() {   //  максимальное значение
        if (x > y)
            return x;
        return (y);
    }

    public static int minValue() {   //  минимальное значение
        if (x < y)
            return x;
        return (y);
    }
}
