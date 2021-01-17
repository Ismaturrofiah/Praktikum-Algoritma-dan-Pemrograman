import java.util.Scanner;
public class FPB {
 	public static void main(String[] args) {
		Scanner masukan = new Scanner(System.in);
        int a,b,c,i,j,sisa,KPK,faktor=1;

        System.out.println("\n--------------");
        System.out.println("Menghitung FPB");
        System.out.println("--------------");

        System.out.print("Masukkan angka pertama : ");
        a = masukan.nextInt(); masukan.nextLine();
        System.out.print("Masukkan angka kedua : ");
        b = masukan.nextInt(); masukan.nextLine();

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
        
        System.out.println("FPB dari "+a+" dan "+b+" : "+faktor);
     }
}