public class Soal2 {
    public static void main(String[] args) {
        int n = 4;
        int i = 1;
        do {
            int j = 1;
            while (j <= n - i) {
                System.out.print(" ");
                j++;
            }

            int k = 1;
            while (k <= i) {
                System.out.print("#");
                k++;
            }
            System.out.println();

            i++;
        } while (i <= n);
    }
}
