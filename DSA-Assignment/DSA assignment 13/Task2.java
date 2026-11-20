public class Task2 {
static int max(int[] a, int i) {
if (i == a.length - 1) {
return a[i];
}
int restMax = max(a, i + 1);
return Math.max(a[i], restMax);
}
public static void main(String[] args) {
int[] a = {3, 6, 9, 12, 15};
System.out.println(max(a, 0));
}
}