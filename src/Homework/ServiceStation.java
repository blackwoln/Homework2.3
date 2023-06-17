package Homework;

import Homework.Bicycle;
import Homework.Car;

//3-й блок кода. Пример с сервисной станцией
public class ServiceStation {
    public void check(Servicable vehicle) {
        if (vehicle != null) {
            System.out.println("Обслуживаем " + vehicle.getModelName());
            vehicle.service();
        }
    }
}
