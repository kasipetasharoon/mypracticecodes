import java.util.*;

public class GradesHistogram {
    public static int[] grades;

    public static void main(String[] args) {
        readGrades();
        int[] bins = computeBins(grades);
        printHorizontal(bins);
        printVertical(bins);
    }

    public static void readGrades() {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        grades = new int[n];

        for (int i = 0; i < n; i++) {
            int g = sc.nextInt();
            if (g >= 0 && g <= 100) {
                grades[i] = g;
            } else {
                i--;
            }
        }
    }

    public static int[] computeBins(int[] array) {
        int[] bins = new int[10];
        for (int i = 0; i < array.length; i++) {
            int grade = array[i];
            if (grade == 100) {
                bins[9]++;
            } else {
                int index = grade / 10;
                bins[index]++;
            }
        }
        return bins;
    }

    public static void printHorizontal(int[] bins) {
        for (int i = 0; i < 10; i++) {
            int start = i * 10;
            int end = (i == 9) ? 100 : (i * 10 + 9);

            System.out.printf("%2d -%3d: ", start, end);

            for (int j = 0; j < bins[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printVertical(int[] bins) {
        int max = 0;
        for (int i = 0; i < bins.length; i++) {
            if (bins[i] > max) {
                max = bins[i];
            }
        }

        for (int level = max; level > 0; level--) {
            for (int i = 0; i < bins.length; i++) {
                if (bins[i] >= level) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }

        System.out.println("0-9  10-19 20-29 30-39 40-49 50-59 60-69 70-79 80-89 90-100");
    }
}
