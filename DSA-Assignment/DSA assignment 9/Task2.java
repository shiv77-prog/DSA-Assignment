class Box {
int width;
Box(int width) {
this.width = width;
}
}
public class Task2 {
public static void main(String[] args) {
Box b = new Box(25);
System.out.println("Width: " + b.width);
}
}