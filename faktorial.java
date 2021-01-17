import java.util.Scanner;
public class faktorial {
 	public static void main(String[] args) {
		Scanner masukan = new Scanner(System.in);
      
        int i,n,total=1;

        System.out.println("\n--------------------------");
        System.out.println("Menghitung nilai faktorial");
        System.out.println("--------------------------");

        System.out.print("Masukkan angka yang akan dihitung faktorialnya : ");
        n = masukan.nextInt(); masukan.nextLine();
        System.out.print(n+"! : ");

        i=1;
        while (i<=n)
        {
           System.out.print(i+"*");
           total *= i;
           i++;
        }

        System.out.println("\nHasil faktorial : "+total);
     }
}