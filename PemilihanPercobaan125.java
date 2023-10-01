import java.util.Scanner;

public class PemilihanPercobaan125 {             
    private static String jenisBiangan;

    public static void main(String[] args) {
        Scanner input25 = new Scanner(System.in);

        System.out.print("Masukan angka: ");
        int angka = input25.nextInt();
                                                                                                
        String jenisBilangan = (angka % 2 == 0) ? "genap" : "ganjil";
        System.out.println("Angka " + angka + " adalah bilangan " + jenisBilangan + ".");

    }
}