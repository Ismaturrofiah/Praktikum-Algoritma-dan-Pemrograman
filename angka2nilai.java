import java.util.Scanner;
public class angka2nilai {
 	public static void main(String[] args) {
		Scanner masukan = new Scanner(System.in);
        int i,a,b;

        System.out.print("Masukkan angka terkecil : ");
        a = masukan.nextInt(); masukan.nextLine();
        System.out.print("Masukkan angka terbesar : ");
        b = masukan.nextInt(); masukan.nextLine();

         System.out.println("Urutan angka : ");
        for(i=a;i<=b;i++)
        {
            System.out.print(+i+" ");
        }
     }
}