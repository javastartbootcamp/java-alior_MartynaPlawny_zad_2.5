package pl.javastart.task;

public class Furniture {
    String material;
    int amount;
    String name;

    Furniture() {
        material = "wood";
        amount = 1;
        name = "table";
    }

    public void showInfo() {
        System.out.printf("Name: %s\nMaterial: %s\nAmount: %d\n", name, material, amount);
    }
}