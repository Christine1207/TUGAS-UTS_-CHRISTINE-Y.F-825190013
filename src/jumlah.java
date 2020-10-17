import java.util.Scanner;
public class jumlah {
    public static void main (String[] args) {
        tugas t = new tugas();
        Scanner scan = new Scanner(System.in);

        System.out.print("Masukkan Nama Mahasiswa : ");
        t.nama = scan.nextLine();

        System.out.print("Masukkan NIM Mahasiswa : ");
        t.nim = scan.nextInt();

        System.out.print("Masukkan Nilai Tugas : ");
        t.nilaiTugas = scan.nextFloat();

        System.out.print("Masukkan Nilai UTS : ");
        t.nilaiUTS = scan.nextFloat();

        System.out.print("Masukkan Nilai UAS : ");
        t.nilaiUAS = scan.nextFloat();

        System.out.println("Hasil Rata-Rata : " + t.rataRata(t.nilaiTugas, t.nilaiUTS, t.nilaiUAS));
    }

}


