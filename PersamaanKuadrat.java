import java.util.Scanner;
public class PersamaanKuadrat {
 	public static void main(String[] args) {
		Scanner masukan = new Scanner(System.in);
        double a,b,c,det,x1,x2;
        String akar,definit;

        System.out.println("Bentuk umum persamaan kuadrat : ax^2+bx+c=0");
        System.out.print("Masukkan nilai  a : ");
		a = masukan.nextDouble(); masukan.nextLine();
        System.out.print("Masukkan nilai  b : ");
		b = masukan.nextDouble(); masukan.nextLine();
        System.out.print("Masukkan nilai  c : ");
		c = masukan.nextDouble(); masukan.nextLine();
        System.out.println("Persamaan kuadrat yang didapat : "+a+"x^2+"+b+"x+"+c+"=0");

        det = b*b-4*a*c;
        System.out.println("Determinan : "+det); 

        if(a>0)
            {definit = "POSITIF";} else
            {definit = "NEGATIF";}

        if(det == 0)
            {
            System.out.println("Akar persamaan yang didapat SAMA"); 
            x1 = -b/2*a;
            System.out.println("Akar-akarnya : ");
            System.out.println("x1 = x2 = "+x1);
            } else
        if(det > 0)
            {
            System.out.println("Akar persamaan yang didapat NYATA"); 
            x1 = (-b + Math.pow(det,0.5))/2*a;
            x2 = (-b - Math.pow(det,0.5))/2*a;
            System.out.println("Akar-akarnya : ");
            System.out.println("x1 = "+x1);
            System.out.println("x2 = "+x2);
            } else
            {
            System.out.println("Akar persamaan yang didapat KHAYAL");
            System.out.println("Persamaan kuadrat DEFINIT "+definit);
            }
    }
}