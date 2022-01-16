import java.util.Scanner;
public class deretkeN {
 	public static void main(String[] args) {
		Scanner masukan = new Scanner(System.in);
        int i,a,jumlahnilai=0;

        System.out.print("Masukkan angka ke-N : ");
        a = masukan.nextInt(); masukan.nextLine();
        
        for(i=1;i<=a;i++)
        {
            jumlahnilai = jumlahnilai + i;
        }
        System.out.println("Jumlah bilangan : "+jumlahnilai);
     }
}