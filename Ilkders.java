package ilkders;
import java.util.Scanner; //kullanıcıdan veri alma sınıfını tanımla
public class Ilkders {
    public static void main(String[] args) {
        int mat,türkce,kim,fiz,tarih,muz,sonuc;
       Scanner giris=new Scanner(System.in);  //sınıf nesenesi oluştur ki deşikenlere giris ile hükmet.
       
        System.out.println("matematik notunu gir: ");  
        mat=giris.nextInt();
       
        System.out.println("turkçe notu: ");
        türkce=giris.nextInt();
        
        System.out.println("kimya :");
        kim=giris.nextInt();
        
        System.out.println("fizik:");
        fiz=giris.nextInt();
        
        System.out.println("tarih:");
        tarih=giris.nextInt();
        
        System.out.println("müzik:");
        muz=giris.nextInt();
        
        sonuc=mat+tarih+türkce+fiz+kim+muz;
        double asılsonuc=sonuc/6;
        
        String gecme= asılsonuc >60 ? "gecti" : "kaldı";   //60dan fazlaysa geçti değilse kaldı.
        System.out.println(asılsonuc+"ile "+gecme);
        
    }
    
}
