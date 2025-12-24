import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class nestedLoop {
    public static void main(String[] args) {
        int ulang = inputData() ;
        buatSegitiga(ulang) ;
    }
    private static int inputData() {
        System.err.print("masukkan angka yang anda inginkan : ");
        BufferedReader bfr = new BufferedReader (new InputStreamReader(System.in));
        String angkaInput = null ;
        try {
            angkaInput = bfr.readLine();
        } 
        catch (IOException e) {
            e.printStackTrace();
        }
        int Data = Integer.valueOf(angkaInput).intValue();
        return Data ;
    }
    private static void buatSegitiga(int ulang) {
        //menentukan jumlah baris. Jika Variabel ulang adalah 10, maka proses di bawah ini akan berjalan 10 kali.
        for (int i=1; i <= ulang; i++) {
            //looping ini mencetak spasi di awal baris agar # terlihat ke tengah.
            for (int j=1; j<=(ulang-i); j++) {
                System.err.print(" ");
            }
            //looping ini mencetak # untuk bagian kiri
            for (int k=1; k<=i; k++) {
                System.err.print("#");
            }
            //looping ini mencetak # untuk bagian kanan 
            for (int b=2; b<=i; b++) {
                System.err.print("#");
            }
        //digunakan untuk pindah baris diakhir loop
        System.err.println(" ");;
        }
    }
}