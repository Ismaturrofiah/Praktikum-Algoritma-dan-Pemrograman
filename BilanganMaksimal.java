import java.util.Scanner;
public class BilanganMaksimal {
 	public static void main(String[] args) {
		Scanner masukan = new Scanner(System.in);
        int a,b,c,terbesar;

        System.out.print("Bilangan pertama : ");
		a = masukan.nextInt(); masukan.nextLine();
        System.out.print("Bilangan kedua : ");
        b = masukan.nextInt(); masukan.nextLine();
        System.out.print("Bilangan ketiga : ");
        c = masukan.nextInt(); masukan.nextLine();

        if(a > b && a > c)
        {terbesar = a;} else

        if(b > c)
        {terbesar = b;} else
        {terbesar = c;}

        System.out.println("Bilangan Terbesar : "+terbesar);
    }
}