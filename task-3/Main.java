public class Main {
    public static void main(String[] args) {
        Shape[] shapes = {
            new Rectangle(5, 10),
            new Circle(7)
        };

        AreaCalculator calculator = new AreaCalculator();
        double totalArea = calculator.calculateTotalArea(shapes);
        System.out.println("Total area: " + totalArea);
    }
}