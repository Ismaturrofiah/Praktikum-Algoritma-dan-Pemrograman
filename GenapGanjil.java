import java.util.Scanner;
public class GenapGanjil {
 	public static void main(String[] args) {
		Scanner masukan = new Scanner(System.in);
        int bilangan;
        String kategori;

        System.out.print("Masukkan bilangan : ");
		bilangan = masukan.nextInt(); masukan.nextLine();
        
        if(bilangan % 2 == 0)
        {kategori = "genap";} else
        {kategori = "ganjil";}

         if(bilangan > 0)
        {System.out.println("Bilangan tersebut "+kategori);} else
        {System.out.println("Bilangan tidak dapat ditentukan");}
    }
}
