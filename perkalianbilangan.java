import java.util.Scanner;
public class perkalianbilangan {
 	public static void main(String[] args) {
		Scanner masukan = new Scanner(System.in);
        int i,a,n,total=1;

        System.out.println("Berapa bilangan yang akan diinput?");
        n = masukan.nextInt(); masukan.nextLine();

        for(i=1;i<=n;i++)
        {
           System.out.print("Masukkan angka ke-"+i+" : ");
           a = masukan.nextInt(); masukan.nextLine();
           total *= a;
        }

        System.out.println("Hasil perkalian : "+total);
     }
}