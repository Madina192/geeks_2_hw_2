public class Watermelon extends Fruit{
    private final int waterContent;

    public Watermelon(Color color, int weight, int waterContent) {
        super(color, weight);
        this.waterContent = waterContent;
    }

    @Override
    public void print() {
        System.out.println("Watermelon: " + "\uD83C\uDF49" + ", water content: " + waterContent + "%");
    }
}
