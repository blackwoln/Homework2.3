package Homework;
//4-й блок кода. Пример с грузовой машиной
public class Truck extends Vehicle {
    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void service() {
        updateTyre();
        checkEngine();
        checkTrailer();
    }

    private void updateTyre() {
        System.out.println("Меняем покрышку грузовика");
    }

    private void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    private void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
}
