import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class loop_do_while {
    public static void main(String[] args) {
        int Data;
        do {
            System.out.println("ayo main tebak-tebakkan! kalau kamu mau bebas kamu harus berhasil menebak angka yang aku tentukan");
            System.out.print("Masukkan angka agar kamu terbebas! :");
            BufferedReader bfr = new BufferedReader 
            (new InputStreamReader(System.in));
            String angkaInput = null ;
                try {
                    angkaInput = bfr.readLine();
                }
                    catch (IOException e) {
                        e.printStackTrace();
                }
                Data = Integer.valueOf(angkaInput).intValue();
        } 
        //selama Data yang dimasukkan bersifat TRUE maka looping akan terus terjadi
        //contoh: 10 != 67 hasilnya TRUE karena 10 tidak sama dengan 67
        while (Data != 67);
        System.out.print("Selamat anda terbebas!");
    }
}