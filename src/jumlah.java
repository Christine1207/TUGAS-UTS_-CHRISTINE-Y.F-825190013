import java.util.Scanner;
public class jumlah {
    public static void main (String[] args) {
        tugas t = new tugas();
        Scanner scan = new Scanner(System.in);

        System.out.print("Masukkan Jumlah Mahasiswa : ");
        t.n = scan.nextInt();

        for (int i=1; i <= t.n; i++) {

            System.out.print("Mahasiswa ke- ");
            System.out.println(i);

            System.out.print("Masukkan Nama Mahasiswa : ");
            t.nama = scan.next();

            System.out.print("Masukkan NIM Mahasiswa : ");
            t.nim = scan.nextInt();

            System.out.print("Masukkan Nilai Tugas : ");
            t.nilaiTugas = scan.nextFloat();

            System.out.print("Masukkan Nilai UTS : ");
            t.nilaiUTS = scan.nextFloat();

            System.out.print("Masukkan Nilai UAS : ");
            t.nilaiUAS = scan.nextFloat();

            System.out.println("Hasil Rata-Rata : " + t.rataRata(t.nilaiTugas, t.nilaiUTS, t.nilaiUAS));
            if (t.rataRata(t.nilaiTugas, t.nilaiUTS, t.nilaiUAS) >= 80
                    && t.rataRata(t.nilaiTugas, t.nilaiUTS, t.nilaiUAS) <= 100) {
                System.out.println("Grade A");
            } else if (t.rataRata(t.nilaiTugas, t.nilaiUTS, t.nilaiUAS) >= 73
                    && t.rataRata(t.nilaiTugas, t.nilaiUTS, t.nilaiUAS) <= 79.99) {
                System.out.println("Grade  B+");
            } else if (t.rataRata(t.nilaiTugas, t.nilaiUTS, t.nilaiUAS) >= 66
                    && t.rataRata(t.nilaiTugas, t.nilaiUTS, t.nilaiUAS) <= 72.99) {
                System.out.println("Grade  B");
            } else if (t.rataRata(t.nilaiTugas, t.nilaiUTS, t.nilaiUAS) >= 58
                    && t.rataRata(t.nilaiTugas, t.nilaiUTS, t.nilaiUAS) <= 65.99) {
                System.out.println("Grade  C+");
            } else if (t.rataRata(t.nilaiTugas, t.nilaiUTS, t.nilaiUAS) >= 51
                    && t.rataRata(t.nilaiTugas, t.nilaiUTS, t.nilaiUAS) <= 57.99) {
                System.out.println("Grade  C");
            } else if (t.rataRata(t.nilaiTugas, t.nilaiUTS, t.nilaiUAS) >= 41
                    && t.rataRata(t.nilaiTugas, t.nilaiUTS, t.nilaiUAS) <= 50.99) {
                System.out.println("Grade  D");
            } else if (t.rataRata(t.nilaiTugas, t.nilaiUTS, t.nilaiUAS) >= 0
                    && t.rataRata(t.nilaiTugas, t.nilaiUTS, t.nilaiUAS) <= 40.99) {
                System.out.println("Grade  E");
            }

            System.out.println("==============================");
        }

        for (int i=1; i <= t.n; i++) {
            System.out.println(" ");
            System.out.println("Hasil Keluaran : ");
            System.out.println("==========================");
            System.out.println("Nama Mahasiswa : " + t.nama);
            System.out.println("NIM Mahasiswa  : " + t.nim);
            System.out.println("Nilai Tugas    : " + t.nilaiTugas);
            System.out.println("Nilai UTS      : " + t.nilaiUTS);
            System.out.println("Nilai UAS      : " + t.nilaiUAS);
            System.out.println("Rata - Rata    : " + t.rataRata(t.nilaiTugas, t.nilaiUTS, t.nilaiUAS));
            System.out.println(" ");
        }

        System.out.print("Thank You For Your Checking ^^");
        }
    }
