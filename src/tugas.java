public class tugas {
    // class tugas
    String nama;
    int nim;
    float nilaiTugas;
    float nilaiUTS;
    float nilaiUAS;

    // constructor
    public tugas() {
        this.nama = nama;
        this.nim = nim;
        this.nilaiTugas = nilaiTugas;
        this.nilaiUTS = nilaiUTS;
        this.nilaiUAS = nilaiUAS;
    }
    public tugas(String nama, int nim, float nilaiTugas, float nilaiUTS, float nilaiUAS) {
        this.nama = nama;
        this.nim = nim;
        this.nilaiTugas = nilaiTugas;
        this.nilaiUTS = nilaiUTS;
        this.nilaiUAS = nilaiUAS;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getNim() {
        return nim;
    }

    public void setNim(int nim) {
        this.nim = nim;
    }

    public float getNilaiTugas() {
        return nilaiTugas;
    }

    public void setNilaiTugas(float nilaiTugas) {
        this.nilaiTugas = nilaiTugas;
    }

    public float getNilaiUTS() {
        return nilaiUTS;
    }

    public void setNilaiUTS(float nilaiUTS) {
        this.nilaiUTS = nilaiUTS;
    }

    public float getNilaiUAS() {
        return nilaiUAS;
    }

    public void setNilaiUAS(float nilaiUAS) {
        this.nilaiUAS = nilaiUAS;
    }

    // class method
    float rataRata(float nilaiTugas, float nilaiUTS, float nilaiUAS){
        return (nilaiTugas + nilaiUTS + nilaiUAS)/3;
    }
}

