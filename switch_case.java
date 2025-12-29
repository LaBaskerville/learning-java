import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class switch_case {
    public static void main(String[] args) {
        System.err.print("Masukkan angka untuk bergerak : ");
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        String hurufInput = null ;
        try {
            hurufInput = bfr.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        int Data = Integer.valueOf(hurufInput).intValue();
        switch (Data) {
            case 1:
                System.out.println("maju");
                //untuk mengakhiri suatu syarat atau digunakan untuk membatasi
                break;
            case 2:
                System.out.println("mundur");
                break;
            case 3:
                System.out.println("kiri");
                break;
            case 4:
                System.out.println("kanan");
            default:
                System.out.println("petunjuk");
                System.out.println("masukkan angka 1 untuk maju, 2 untuk mundur, 3 untuk ke kiri, atau 4 untuk ke kanan");
                break;
        }
    }
}