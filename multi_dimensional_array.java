import java.util.Arrays;

public class multi_dimensional_array {
    public static void main(String[] args) {
        // int[][] artinya array yang berisi array (seperti tabel/matriks)
        // Baris pertama (Indeks 0): {1, 2, 3}
        // Baris kedua   (Indeks 1): {4, 5, 6}
        int[][] angka= {{1, 2, 3}, {4, 5, 6}};
        // Arrays.deepToString() digunakan khusus untuk Array Multi-Dimensi.
        // Fungsi ini akan mengonversi seluruh struktur array menjadi string
        // sehingga bisa dibaca oleh manusia saat dicetak ke terminal.
        System.out.println(Arrays.deepToString(angka));
    }
}