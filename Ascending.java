import java.util.Scanner;
public class Ascending {
 	public static void main(String[] args) {
		Scanner masukan = new Scanner(System.in);
        int data1,data2,hasil;

        System.out.print("Data pertama : ");
		data1 = masukan.nextInt(); masukan.nextLine();
        System.out.print("Data kedua : ");
        data2 = masukan.nextInt(); masukan.nextLine();

        if(data1 < data2);
        {System.out.println("Urutan data : "+data1+", "+data2);}
     }
}