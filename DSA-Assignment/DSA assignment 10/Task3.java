class Person {
String name;
void greet() {
System.out.println("Hello, " + name);
}
}
class Teacher extends Person {
}
public class Task3 {
public static void main(String[] args) {
Teacher t = new Teacher();
t.name = "Kiran";
t.greet();
}
}