package pl.javastart.task;

public class Furniture {
    String material;
    int amount;
    String name;

    Furniture(String m, int a, String n) {
        material = m;
        amount = a;
        name = n;
    }

    public void showInfo() {
        System.out.printf("Name: %s\nMaterial: %s\nAmount: %d\n", name, material, amount);
    }
}