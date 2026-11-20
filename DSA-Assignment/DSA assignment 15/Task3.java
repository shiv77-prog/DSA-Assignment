public class Task3 {
static void arrange(char[] letters, boolean[] used,
char[] result, int index) {
if (index == letters.length) {
System.out.println(new String(result));
return;
}
for (int i = 0; i < letters.length; i++) {
if (!used[i]) {
used[i] = true;
result[index] = letters[i];
arrange(letters, used, result, index + 1);
used[i] = false;
}
}
}
public static void main(String[] args) {
char[] letters = {'x', 'y'};
boolean[] used = new boolean[2];
char[] result = new char[2];
arrange(letters, used, result, 0);
}
}