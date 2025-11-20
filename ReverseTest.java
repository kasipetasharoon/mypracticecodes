import java.util.*;

public class ReverseTest {
    public static void reverse(int[] array) {
        int f = 0;
        int b = array.length - 1;
        while (f < b) {
            int temp = array[f];
            array[f] = array[b];
            array[b] = temp;
            f++;
            b--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        reverse(a);

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
