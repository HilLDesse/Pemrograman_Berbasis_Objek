package Interface.src;

public class Food extends Goods {
    private int calories;

    // Constructor
    public Food(String description, double price, int calories) {
        super(description, price);
        this.calories = calories;
    }

    // Getter
    public int getCalories() {
        return calories;
    }

    // Setter
    public void setCalories(int calories) {
        this.calories = calories;
    }

    // Menampilkan informasi makanan
    @Override
    public void display() {
        super.display();
        System.out.println("Calories: " + calories);
    }
}
