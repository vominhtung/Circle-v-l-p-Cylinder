public class cylinderText {
    public static void main(String[] args) {
        Cylinder tung1 = new Cylinder();
        System.out.println(tung1);

        tung1 = new Cylinder(2,3,"red");
        System.out.println(tung1);
        System.out.println(tung1.getVolume());

    }
}
