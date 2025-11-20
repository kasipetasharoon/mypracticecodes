import java.util.*;

public class SwapTest {
    public static boolean swap(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            int temp = array1[i];
            array1[i] = array2[i];
            array2[i] = temp;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int[] a1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            a1[i] = sc.nextInt();
        }

        int n2 = sc.nextInt();
        int[] a2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            a2[i] = sc.nextInt();
        }

        boolean result = swap(a1, a2);
        System.out.println(result);

        for (int i = 0; i < a1.length; i++) {
            System.out.print(a1[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < a2.length; i++) {
            System.out.print(a2[i] + " ");
        }
    }
}
