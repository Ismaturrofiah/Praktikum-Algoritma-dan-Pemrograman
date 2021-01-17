import java.util.Scanner;
public class deretgeometri {
 	public static void main(String[] args) {
		Scanner masukan = new Scanner(System.in);
        int n;
        double i,a,r,Un=1;
        double hasil=0;

        System.out.println("\n-----------------------");
        System.out.println("Menghitung deret geometri");
        System.out.println("-------------------------");

        System.out.print("Masukkan suku ke-1 : ");
        a = masukan.nextDouble(); masukan.nextLine();
        System.out.print("Masukkan rasio : ");
        r = masukan.nextDouble(); masukan.nextLine();
        System.out.print("Masukkan nilai n dalam 'suku ke-n' : ");
        n = masukan.nextInt(); masukan.nextLine();

        Un = a * Math.pow(r,n-1);
        
        System.out.println("Suku ke-"+n+" : "+Un);

        i = a;
        while (i<=Un)
        {
           hasil = hasil+i;
           i = i*r;
        }

        System.out.println("Hasil deret "+n+" suku pertama geometri : "+hasil);
     }
}