package quiz;
import java.util.Scanner;
public class soal4 {
    static final double U0 = 0;
    public static void main(String[] args) {
        double kecepatan,jarak,waktu;
        Scanner scan = new Scanner(System.in);
        System.out.println("kecepatan mobil=");
        kecepatan = scan.nextDouble();
        System.out.println("waktu tempuh mobil=");
        waktu = scan.nextDouble();
        jarak= U0+( 0.5 * kecepatan * waktu * waktu);
        System.out.println("jarak tempuh mobil="+jarak);
    }
}
