public class Apple extends Fruit{
    private final int vitaminC;

    public Apple(Color color, int weight, int vitaminC) {
        super(color, weight);
        this.vitaminC = vitaminC;
    }

    @Override
    public void print() {
        System.out.println("Apple: " + "\uD83C\uDF4E" + ", vitamin C: " + vitaminC + "mg");
    }
}
