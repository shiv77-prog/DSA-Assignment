class Shape {
int area() {
return 0;
}
}
class Rectangle extends Shape {
int length;
int breadth;
int area() {
return length * breadth;
}
}
public class Task2 {
public static void main(String[] args) {
Rectangle r = new Rectangle();
r.length = 4;
r.breadth = 5;
System.out.println("Area: " + r.area());
}
}