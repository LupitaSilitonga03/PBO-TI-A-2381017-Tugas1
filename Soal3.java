import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan kata : ");
        String input = scanner.nextLine();

        int jumlahKata = 1;
        int i = 0;

        do {
            if (Character.isUpperCase(input.charAt(i))) {
                jumlahKata++;
            }
            i++;
        } while (i < input.length());

        System.out.println("Jumlah kata camelCase adalah : " + jumlahKata);
        scanner.close();
    }
}
