package Point2d3d;

public class Test3D {
    public static void main(String[] args) {
        Point3D point3D = new Point3D();
        System.out.println(point3D);

        System.out.println("[");
        for (float e : point3D.getXYZ()){
            System.out.println(e + " ,");
        }
        System.out.println("]");

        Point3D point3Da = new Point3D();
        System.out.println(point3Da);
        point3Da.setXYZ(3,4,5);

        System.out.println("[");
        for (float e : point3Da.getXYZ()){
            System.out.print(e +",");
        }
        System.out.println("]");
    }
}
