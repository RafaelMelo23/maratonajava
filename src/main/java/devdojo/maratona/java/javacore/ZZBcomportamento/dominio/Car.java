package devdojo.maratona.java.javacore.ZZBcomportamento.dominio;

public class Car {

    private String name = "Audi RS6";
    private String color;

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                '}';
    }

    public Car(String color, int year) {
        this.color = color;
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    private int year;
}
