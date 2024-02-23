import java.util.Scanner;
//MochCahya_G
public class HitungKembalian {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Total Pembelian : Rp ");
        double totalPembelian = input.nextDouble();

        System.out.print("Masukkan Jumlah Uang Yang Diberikan : Rp ");
        double jumlahUang = input.nextDouble();

        double kembalian = jumlahUang - totalPembelian;

        if (kembalian < 0) {
            System.out.println("Maaf uang yang diberikan kurang!");    
        } else if (kembalian == 0) {
            System.out.println("Terima kasih, tidak ada kembalian.");
        } else {
            System.out.println("Kembalian anda : Rp " + kembalian);
        }
        input.close();
    }
}
