public class Lemon extends Fruit{
    private final double citricAcid;

    public Lemon(Color color, int weight, double citricAcid) {
        super(color, weight);
        this.citricAcid = citricAcid;
    }

    @Override
    public void print() {
        System.out.println("Lemon: " + "\uD83C\uDF4B" + ", citric acid: " + citricAcid + "mg");
    }
}
