class Animal {
void sound() {
System.out.println("Some sound");
}
}
class Dog extends Animal {
}
public class Task1 {
public static void main(String[] args) {
Dog d = new Dog();
d.sound();
}
}