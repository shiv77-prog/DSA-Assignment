class Shape {
int area() {
return 0;
}
}
class Square extends Shape {
int side;
int area() {
return side * side;
}
}
public class Task3 {
public static void main(String[] args) {
Square square = new Square();
square.side = 3;
Shape s = square;
System.out.println("Area: " + s.area());
}
}