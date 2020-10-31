
import java.util.Scanner;


/**
 *
 * @author Diva Sabila Ramadhan 
 * Nama  : Diva Sabila Ramadhan 
 * Kelas : IF1
 * NIM   : 10119039
 * Deskripsi Program : Program ini untuk menampilkan nama menjadi ejaan 
 */

public class Main {

    static final Scanner scan = new Scanner (System.in);
    String nama;
    
    public void masukkanNamaDepan(){
       System.out.print("Masukkan nama anda untuk di eja : ");
       nama = scan.next();
    }
    
    public void tampilEjaanNama(){
       System.out.print("\nEjaan untuk \""+nama+"\" adalah  : ");
       int num = 1;
        for (char ejaan : nama.toCharArray()){
            System.out.println();
            System.out.println("Huruf ke-"+(num++)+" : "+ejaan);
                    
        }
    }
    
    public static void main(String[] args) {
       Main data = new Main();
       data.masukkanNamaDepan();
       data.tampilEjaanNama();
       System.out.println("Developed by : Diva Sabila Ramadhan");
    }
    
}
