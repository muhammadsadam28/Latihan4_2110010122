package penilaian;

public class ClassMain {
        public static void main(String[] args) {
        NilaiAkhir nilai = new NilaiAkhir("Muhammad sadam", "2110010122", 80, 90, 85);

        System.out.println("Nama: " + nilai.getNama());
        System.out.println("NPM: " + nilai.getNpm());
        System.out.println("Nilai Akhir: " + nilai.hitungNilaiAkhir());
    }
}