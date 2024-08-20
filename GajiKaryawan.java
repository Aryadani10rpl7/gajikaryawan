import java.util.Scanner;

public class GajiKaryawan {
    public static void main(String[] args) {
         double gajiKaryawan, jamKerja, pajak, totalGaji;
        Scanner input = new Scanner(System.in);
        System.out.println(" Masukkan GajiKaryawan: ");
        gajiKaryawan = input.nextDouble();
        System.out.println("Masukkan JamKerja");
        jamKerja = input.nextDouble();
        System.out.println("Masukkan Pajak");
        pajak = input.nextDouble();

        totalGaji=gajiKaryawan*jamKerja;
        pajak=(pajak/100)*totalGaji;
        totalGaji=totalGaji-pajak;
        System.out.println("TotalGaji :"+totalGaji);
    }
}
