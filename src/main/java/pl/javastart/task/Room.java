package pl.javastart.task;

public class Room {

    public static void main(String[] args) {
        Furniture furniture1 = new Furniture("wood", 1, "table");
        Furniture furniture2 = new Furniture("glass", 3, "window");

        System.out.println("First furniture:");
        furniture1.showInfo();
        System.out.println("\nSecond furniture:");
        furniture2.showInfo();
    }
}