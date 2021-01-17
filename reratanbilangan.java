import java.util.Scanner;
public class reratanbilangan {
 	public static void main(String[] args) {
		Scanner masukan = new Scanner(System.in);
        int i,a,n,jumlah=0;
        double rerata;

        System.out.println("Berapa angka yang akan diinput?");
        n = masukan.nextInt(); masukan.nextLine();
        
        for(i=1;i<=n;i++)
        {
            System.out.print("Masukkan angka ke-"+i+" : ");
            a = masukan.nextInt(); masukan.nextLine();
            jumlah += a;
        }
        
        rerata = (double)jumlah/n;
        
        System.out.println("Untuk mencari rata-rata : "+jumlah+"/"+n);
        System.out.println("Rata - rata : "+rerata);
     }
}