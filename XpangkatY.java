import java.util.Scanner;
public class XpangkatY {
 	public static void main(String[] args) {
		Scanner masukan = new Scanner(System.in);
        int i,a,b,hasil=1;

        System.out.println("\n---------------------------------");
        System.out.println("Menghitung pangkat suatu bilangan");
        System.out.println("---------------------------------");
        
        System.out.print("Masukkan angka yang akan dihitung : ");
        a = masukan.nextInt(); masukan.nextLine();
        System.out.print("Masukkan pangkat : ");
        b = masukan.nextInt(); masukan.nextLine();

        i=1;
        while (i<=b)
        {
           hasil = hasil*a;
           i++;
        }

        System.out.println("Hasil dari "+a+"^"+b+" : "+hasil);
     }
}