package Homework;

//2-й блок кода. Пример с машиной
public class Car extends Vehicle {
    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void service() {
        updateTyre();
        checkEngine();
    }

    private void updateTyre() {
        System.out.println("Меняем покрышку автомобиля");
    }

    private void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
}