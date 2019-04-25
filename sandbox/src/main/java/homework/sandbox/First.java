package homework.sandbox;

public class First {
    public static void main(String[] args) {

        Point p1 = new Point(5,7);
        Point p2 = new Point(1,2);

        System.out.println("Расстояние между точкой с координатами x = " + p1.x + "y = " + p1.y + " и точкой с коррдинатами x = " + p2.x + " и y = " + p2.y + " = " + p1.distance(p2));
    }


}