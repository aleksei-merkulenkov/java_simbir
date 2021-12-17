public class Elevator {
    private int minFloor = 0;
    private int maxFloor = 0;
    private int currentFloor = 1;

    // конструктор, сохраняющий указанные параметры в переменных класса
    public Elevator (int minFloor, int maxFloor) {
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
    }
    // метод, перемещающий лифт на заданный в параметре этаж
    public void move(int floor) {
        if (floor > maxFloor || floor < minFloor) {
            System.out.println("Error");
            return;
        }
        while (getCurrentFloor() != floor) {
            if (getCurrentFloor() < floor) {
                moveUp();
            }
            else {
                moveDown();
            }
            System.out.println(getCurrentFloor());
        }
    }
    // метод, перемещающий лифт на один этаж вниз
    public void moveDown () {
        currentFloor = currentFloor > minFloor ? currentFloor - 1 : currentFloor;
    }
    // метод, перемещающий лифт на один этаж вверх
    public void moveUp () {
        currentFloor = currentFloor < maxFloor ? currentFloor + 1 : currentFloor;
    }
    // метод, возвращающий текущий этаж, на котором находится лифт
    public int getCurrentFloor () {
        return currentFloor;
    }

}

