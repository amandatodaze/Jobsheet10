
import java.util.Scanner;

public class BioskopWithScanner2modif1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nama;
        String next;
        int baris;
        int kolom;

        String[][] penonton = new String[4][2];

        while (true) {
            System.out.println("\n------------------------");
            System.out.println("------ PILIH MENU ------");
            System.out.println("------------------------");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilihan: ");
            int pilihan = sc.nextInt();
            sc.nextLine();

            if (pilihan == 1) {
                while (true) {
                    System.out.println("----- Input data penonton -----");
                    System.out.print("Masukkan nama: ");
                    nama = sc.nextLine();
                    System.out.print("Masukkan baris (1-4): ");
                    baris = sc.nextInt();
                    System.out.print("Masukkan kolom (1-2): ");
                    kolom = sc.nextInt();
                    sc.nextLine();

                    if ( baris >= 1 && baris <= 4 && kolom >= 1 && kolom <= 2) {
                        penonton[baris - 1][kolom - 1] = nama;
                    } else {
                        System.out.println("Baris atau kolom kursi tidak tersedia.");
                    }
                    
                    System.out.print("Input penonton lainnya? (y/n): ");
                    next = sc.nextLine();
                    if (next.equalsIgnoreCase("n")) {
                        break;
                    }
                }

            } else if (pilihan == 2) {
                System.out.println("\n----- DAFTAR PENONTON BIOSKOP -----");
                for (int i = 0; i < penonton.length; i++) {
                    for (int j = 0; j < penonton[i].length; j++) {
                        System.out.print(penonton[i][j] + "\t");
                    }
                    System.out.println();
                }
                
            } else if (pilihan == 3) {
                System.out.println("\n--------------------------");
                System.out.println("------ Terima Kasih ------");
                System.out.println("--------------------------");
                break;
            }
        }
    }
}
