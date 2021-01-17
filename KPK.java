import java.util.Scanner;
public class KPK {
 	public static void main(String[] args) {
		Scanner masukan = new Scanner(System.in);
        int a,b,c,i,j,sisa,KPK,faktor=1;

        System.out.println("\n--------------");
        System.out.println("Menghitung KPK");
        System.out.println("--------------");

        System.out.print("Masukkan angka pertama : ");
        a = masukan.nextInt(); masukan.nextLine();
        System.out.print("Masukkan angka kedua : ");
        b = masukan.nextInt(); masukan.nextLine();

        c = a*b;

        i = 2;
        j = 2;
        while (i<=a)
        {
           sisa = a%i;
           if(sisa==0)
           while (j<=b)
           {
               if((b%j)==0)
               if(i==j)
               faktor = j;
               break;
           }
           j++;
           i++;
        }

        KPK = c/faktor;
        
        System.out.println("KPK dari "+a+" dan "+b+" : "+KPK);
     }
}