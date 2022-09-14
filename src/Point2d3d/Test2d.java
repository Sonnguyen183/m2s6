package Point2d3d;

public class Test2d {
    public static void main(String[] args) {
        Ponit2D ponit2D = new Ponit2D();
        System.out.println(ponit2D);
        System.out.println("[");
        for (float e : ponit2D.getXY()) {
            System.out.println(e + ",");
        }
        System.out.println("]");
    }
}