
import java.util.Scanner;

public class Konversi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int hari, bulan, tahun, sisa1, sisa2;

        System.out.println("Jumlah Hari: ");
        hari = input.nextInt();

        tahun = konversiTahun(hari);
        sisa1 = hari % 365;

        bulan = konversiBulan(sisa1);
        sisa2 = konversiHari(sisa1);

        System.out.println(hari + " Hari = " + tahun + " Tahun " + bulan + " Bulan " + sisa2 + " Hari");

    }

    private static int konversiTahun(int hari) {
        return hari / 365;
    }

    private static int konversiBulan(int sisa1) {
        return sisa1 / 30;
    }

    private static int konversiHari(int sisa1) {
        return sisa1 % 30;
    }
}
