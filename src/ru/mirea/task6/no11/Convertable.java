package ru.mirea.task6.no11;

public interface Convertable {
    double convert();
}

class Celsius implements Convertable{

    private double temperature;

    Celsius(double temperature){
        this.temperature = temperature;
    }

    @Override
    public double convert() {
        return temperature;
    }

    public double toKelvin(){
        return temperature + 273.15;
    }

    public double toFahrenheit(){
        return (temperature * 9 / 5) + 32;
    }

    @Override
    public String toString() {
        return temperature + " °C = " + toKelvin() + " K = " +
                toFahrenheit() + " °F";
    }
}

class Main{
    public static void main(String[] args) {
        Celsius celsius = new Celsius(42);
        System.out.println("temperature in celsius = " + celsius.convert());
        System.out.println(celsius.toString());
    }
}
