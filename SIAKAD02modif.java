
import java.util.Scanner;

public class SIAKAD02modif {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("====================================");
        System.out.print("Masukkan jumlah siswa: ");
        int jumlahSiswa = sc.nextInt();
        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlahMataKuliah = sc.nextInt();
        System.out.println("====================================");
        int[][] nilai = new int[jumlahSiswa][jumlahMataKuliah];

        for (int i = 0; i < nilai.length; i++) {
            System.out.println("\nInput nilai mahasiswa ke-" + (i + 1));
            double totalPerSiswa = 0;

            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print("Nilai mata kuliah " + (j + 1) + ": ");
                nilai[i][j] = sc.nextInt();
                totalPerSiswa += nilai[i][j];
            }

            System.out.println("Nilai rata-rata: " + totalPerSiswa / jumlahMataKuliah);
        }

        System.out.println("\n====================================");
        System.out.println("Rata-rata Nilai setiap Mata Kuliah");

        for (int j = 0; j < jumlahMataKuliah; j++) {
            double totalPerMataKuliah = 0;

            for (int i = 0; i < jumlahSiswa; i++) {
                totalPerMataKuliah += nilai[i][j];
            }

            System.out.println("Mata Kuliah " + (j + 1) + ": " + totalPerMataKuliah / jumlahSiswa);
        }

        sc.close();
    }
}
