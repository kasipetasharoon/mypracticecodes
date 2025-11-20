import java.util.*;

public class CopyOf1Test {
    public static int[] copyOf(int[] array) {
        int[] newArr = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            newArr[i] = array[i];
        }
        return newArr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int[] b = copyOf(a);

        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
    }
}
