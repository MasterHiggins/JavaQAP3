public class Demo {
    public static void main(String[] args) {
        Point point = new Point(1.0f, 2.0f);
        System.out.println(point);

        MovablePoint movablePoint = new MovablePoint(3.0f, 4.0f, 0.5f, 0.5f);
        System.out.println(movablePoint);

        movablePoint.move();
        System.out.println("After moving: " + movablePoint);

        MovablePoint anotherMovablePoint = new MovablePoint(5.0f, 6.0f);
        System.out.println(anotherMovablePoint);

        anotherMovablePoint.setX(2.0f);
        anotherMovablePoint.setY(3.0f);
        anotherMovablePoint.setSpeed(1.0f, 1.0f);
        System.out.println("After setting values: " + anotherMovablePoint);
        anotherMovablePoint.move();
        System.out.println("After moving: " + anotherMovablePoint);
    }
}
