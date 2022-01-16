import java.util.Scanner;
public class Kasir {
    public static void main(String[]args){
        
        Scanner masuk = new Scanner(System.in);
        
        int jumlah,kode=0,i,ulang,pilihan,jumlahitem = 0,totalhargaitem=1,totalsemua=0,totalbarang = 0,pembayaran,kembalian;
       
        System.out.println("Mesin Kasir ");
        System.out.println("1.Mendata Barang ");
        System.out.println("2.Mendata Pembelian ");
        System.out.print("Pilih : ");
        
        pilihan = masuk.nextInt();
        
        switch(pilihan){
            case 1: System.out.println("Mendata barang : "); 
            { System.out.print("Masukan jumlah data barang : ");
        jumlah = masuk.nextInt();
        ulang = jumlah - 1;
       
         
        String [] namabarang = {" ","Keyboard","Mouse","Headset","Processor","RAM","VGA","Hardisk","Monitor","Mousepad","LAN Cable"};
        String [] hargabarang = {" ", "Rp. 100.000 ","Rp. 90.000 ","Rp. 325.000 ","Rp. 9.620.000 ","Rp. 3.250.000 ","Rp. 6.350.000 ","Rp. 2.500.000","Rp. 1.500.000","Rp. 150.000","Rp. 30.000 "};
        String [] stokbarang = {" ", "30","25","52","65","41","20","20","36","15","120"};
          
        for(i=0;i<=ulang;i++){
            
            System.out.println("Kode terdiri dari angka 1 - 10");
            
            System.out.print("Masukan kode barang : ");
            
             kode = masuk.nextInt();
             
             System.out.println("Kode Barang    : " +kode);
             System.out.println("Nama Barang    : " +namabarang[kode]);
             System.out.println("Harga Barang   : " +hargabarang[kode]);
             System.out.println("Stok Barang    : " +stokbarang[kode]);
        }
        
             
         };break;
            case 2:System.out.println("Data pembelian barang");
            { System.out.println("Mendata pembelian barang : "); 
            { System.out.print("Masukan jumlah total barang yang mau dibeli : ");
        jumlah = masuk.nextInt();
        ulang = jumlah - 1;
        
         String [] namabarang = {" ","Keyboard","Mouse","Headset","Processor","RAM","VGA","Hardisk","Monitor","Mousepad","LAN Cable"};
        String [] hargabarang = {" ", "Rp. 100.000 ","Rp. 90.000 ","Rp. 325.000 ","Rp. 9.620.000 ","Rp. 3.250.000 ","Rp. 6.350.000 ","Rp. 2.500.000","Rp. 1.500.000","Rp. 150.000","Rp. 30.000 "};
        
        int [] harga = {0,100000,90000,325000,9620000,3250000,6350000,2500000,1500000,150000,30000};
        
         for(i=0;i<=ulang;i++){
            
            System.out.println("Kode terdiri dari angka 1 - 10");
            
            System.out.print("Masukan kode barang yand dibeli : ");
            
             kode = masuk.nextInt();
             
             System.out.print("Masukan jumlah pembelian barang "+namabarang[kode]+ " : ");
             jumlahitem = masuk.nextInt();
             
             totalbarang +=jumlahitem;
              
             totalhargaitem = jumlahitem *harga[kode];
             
             totalsemua += totalhargaitem;
                     
            System.out.println("=================================================== ");
              System.out.println("Kode Barang             : " +kode);
              System.out.println("Harga peritem           : " +hargabarang[kode]);
               System.out.println("Jumlah beli peri item  : " +jumlahitem);
               System.out.println("Total Harga Item       : " +" Rp. " +totalhargaitem);
          System.out.println("=================================================== ");
           
          
         
            
            
        } 
          System.out.println("Total barang yang dibeli : "+totalbarang);
                     
          System.out.println("Total harga semua        : "+totalsemua);
          
          System.out.print("Uang yang dibayar : ");
          pembayaran = masuk.nextInt();
          kembalian = pembayaran - totalsemua;
           System.out.println("Uang kembalian : "+kembalian);
           
          System.out.println("Terima kasih sudah berbelanja di toko kami :) ");
          System.out.println("=================================================== ");
       
        
              
          }
       
        
       
    
}break;
            default :System.out.println("Inputan Salah");break;
    }    
    
    }
        
        
}