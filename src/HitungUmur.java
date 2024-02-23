import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class HitungUmur {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan tahun kelahiran : ");
        int tahunKelahiran = input.nextInt();

        LocalDate hariIni = LocalDate.now();

        int umur = Period.between(LocalDate.of(tahunKelahiran, 1, 1), hariIni).getYears();

        System.out.println("Umur anda adalah : "+ umur + "tahun");

        input.close();
    }
}
