package ru.job4j.calculator;

public class TemperatureFit {
    public static double idealTemperatureForFruits(int temperature) {
        return temperature - 2.0;
    }

    public static double idealTemperatureForMeat(int temperature) {
        return temperature - 5.0;
    }

    public static void main(String[] args) {
        int roomTemperature = 10;
        double fruitsTemperature = TemperatureFit.idealTemperatureForFruits(roomTemperature);
        double meatTemperature = TemperatureFit.idealTemperatureForMeat(roomTemperature);
        System.out.println("Ideal temperature for fruits is " + fruitsTemperature + "°C");
        System.out.println("Ideal temperature for meat is " + meatTemperature + "°C");
    }
}
