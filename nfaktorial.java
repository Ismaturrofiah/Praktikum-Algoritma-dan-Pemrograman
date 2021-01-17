import java.util.Scanner;
public class nfaktorial {
 	public static void main(String[] args) {
		Scanner masukan = new Scanner(System.in);
      
        int i=1,n,total=1;

        System.out.println("\n--------------------------");
        System.out.println("Menghitung nilai faktorial");
        System.out.println("--------------------------");

        System.out.print("\nMasukkan angka yang akan dihitung faktorialnya : ");
        n = masukan.nextInt(); masukan.nextLine();
        System.out.print(n+"! : ");

        faktorial(i,n,total);
    }

    public static void faktorial(int i,int n,int total){
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