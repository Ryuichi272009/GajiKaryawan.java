
    import java.util.Scanner;

public class GajiKaryawan {
    public static void main(String[] args) {
        double jamKerja, tarifPerjam, pajak, gaji;

        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan jumlah jam kerja: ");
        jamKerja = input.nextDouble();
        System.out.println("Masukkan tarif kerja/jam: ");
        tarifPerjam = input.nextDouble();
        System.out.println("Masukkan pajak: ");
        pajak = input.nextDouble();
        
        gaji=tarifPerjam;
        pajak=(pajak/100)*gaji;
        gaji=gaji-pajak;
        System.out.println("Total gaji bersih: "+gaji);

    }
}

