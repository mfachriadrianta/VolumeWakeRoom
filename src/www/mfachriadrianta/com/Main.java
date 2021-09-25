package www.mfachriadrianta.com;

import java.util.Scanner;

public class Main {
    public static void main(String[] arrgs){
        // Beranggapan ini adalah Edittext pada Android
//        System.out.print("Edittext : ");
//        Scanner scanner = new Scanner(System.in);
//        String inputUser = scanner.nextLine();
//        System.out.print(inputUser);

        hitungBangunRuang();
    }

    private static void hitungBangunRuang() {
        // Luas
        System.out.print("Lebar : ");
        Scanner lebar = new Scanner(System.in);
        Integer inputUser = lebar.nextInt();
        System.out.println(inputUser);

        // Panjang
        System.out.print("Panjang : ");
        Scanner panjang = new Scanner(System.in);
        Integer inputUserTwo = panjang.nextInt();
        System.out.println(inputUserTwo);

        // Hasil
        System.out.println("Hasilnya : " + inputUser * inputUserTwo);
    }
}
