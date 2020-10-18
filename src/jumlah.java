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
        if (t.rataRata(t.nilaiTugas, t.nilaiUTS, t.nilaiUAS) >= 80
                    && t.rataRata(t.nilaiTugas, t.nilaiUTS, t.nilaiUAS) <= 100) {
                System.out.println("Grade A");
            } else if (t.rataRata(t.nilaiTugas, t.nilaiUTS, t.nilaiUAS) >= 73
                    && t.rataRata(t.nilaiTugas, t.nilaiUTS, t.nilaiUAS) <= 79.99) {
                System.out.println("Garde  B+");
            } else if (t.rataRata(t.nilaiTugas, t.nilaiUTS, t.nilaiUAS) >= 66
                    && t.rataRata(t.nilaiTugas, t.nilaiUTS, t.nilaiUAS) <= 72.99) {
                System.out.println("Garde  B");
            } else if (t.rataRata(t.nilaiTugas, t.nilaiUTS, t.nilaiUAS) >= 58
                    && t.rataRata(t.nilaiTugas, t.nilaiUTS, t.nilaiUAS) <= 65.99) {
                System.out.println("Garde  C+");
            } else if (t.rataRata(t.nilaiTugas, t.nilaiUTS, t.nilaiUAS) >= 51
                    && t.rataRata(t.nilaiTugas, t.nilaiUTS, t.nilaiUAS) <= 57.99) {
                System.out.println("Garde  C");
            } else if (t.rataRata(t.nilaiTugas, t.nilaiUTS, t.nilaiUAS) >= 41
                    && t.rataRata(t.nilaiTugas, t.nilaiUTS, t.nilaiUAS) <= 50.99) {
                System.out.println("Garde  D");
            } else if (t.rataRata(t.nilaiTugas, t.nilaiUTS, t.nilaiUAS) >= 0
                    && t.rataRata(t.nilaiTugas, t.nilaiUTS, t.nilaiUAS) <= 40.99) {
                System.out.println("Garde  E");
            }

        System.out.print("Thank You For Your Checking ^^");
        }
    }
