public class Main {
    public static void main(String[] args) {
        System.out.println(createObject("Apple"));
        System.out.println(createObject("Lemon"));
        System.out.println(createObject("Watermelon"));

    }
    static Fruit createObject(String className) {
        Fruit linkToObject = null;
        switch (className) {
            case "Apple" -> {
                Apple apple = new Apple(Color.RED, 100, 5);
                apple.print();
                linkToObject = apple;
            }
            case "Lemon" -> {
                Lemon lemon = new Lemon(Color.YELLOW, 150, 8);
                linkToObject = lemon;
                lemon.print();
            }
            case "Watermelon" -> {
                Watermelon watermelon = new Watermelon(Color.GREEN, 7000, 92);
                linkToObject = watermelon;
                watermelon.print();
            }
        }
        return linkToObject;
    }

}