package pl.javastart.task;

public class Room {

    public static void main(String[] args) {
        Furniture furniture1 = new Furniture();
        Furniture furniture2 = new Furniture();

        furniture2.name = "window";
        furniture2.amount = 3;
        furniture2.material = "glass";

        System.out.println("First furniture:");
        furniture1.showInfo();
        System.out.println("\nSecond furniture:");
        furniture2.showInfo();
    }
}