public class Task1 {
static void subsets(int[] a, int index, String result) {
if (index == a.length) {
System.out.println("{" + result + "}");
return;
}
subsets(a, index + 1, result);
if (result.length() == 0) {
subsets(a, index + 1, result + a[index]);
} else {
subsets(a, index + 1, result + ", " + a[index]);
}
}
public static void main(String[] args) {
int[] a = {1, 2, 3};
subsets(a, 0, "");
}
}