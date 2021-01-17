import java.util.Scanner;
public class penjumlahanderet {
 	public static void main(String[] args) {
		Scanner masukan = new Scanner(System.in);
        int i,a,b,n,Un,Sn=0;

        System.out.print("Masukkan angka suku ke-1 : ");
        a = masukan.nextInt(); masukan.nextLine();
        System.out.print("Masukkan suku ke-N : ");
        n = masukan.nextInt(); masukan.nextLine();
        System.out.print("Masukkan beda suku berurutan : ");
        b = masukan.nextInt(); masukan.nextLine();

        Un = a + (n-1)*b;
        System.out.println("Angka suku ke-N : "+Un);

        System.out.println("Urutan baris angka :");

        for(i=a;i<=Un;i=i+b)
        {
           System.out.print(+i+" ");
           Sn += i;
        }

        System.out.print("\n");
        System.out.println("Jumlah N suku : "+Sn);
     }
}