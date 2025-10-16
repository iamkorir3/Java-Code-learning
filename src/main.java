public class main {
    public static void main() {
        Rectanle r1 = new Rectanle(7, 9);

        // r1.setWidth(4);
        // r1.setHeight(5);
        r1.calculateArea();
        r1.perimeter();
        System.err.println("height is: " + r1.getHeight() + ", " + r1.getWidth());
    }
    
}
