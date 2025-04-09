import sun.lwawt.macosx.CSystemTray;

import java.util.Random;
import java.util.Scanner;
public class Araba {

     // define String marka /int maxhizi;
    String marka;
    int maxhizi;
    int yili;
    private int fiyat;
    private float yakitMiktari;  //litre
    private float kilometre;
//constructor
    public Araba(){
        System.out.println("PArametreSIZ -Yapıcı fonksiyon tetiklendi");
        marka="Unknown";
        maxhizi=560;
        yili=2022;
        fiyat=500000;
        kilometre=0;
        yakitMiktari=15;
    }
    public Araba(String pmarka,int yili, int maxhizi, int fiyat){
        System.out.println("PArametreli Yapıcı fonksiyon tetiklendi");
        this.marka=marka;
        this.yili=yili;
        this.maxhizi=maxhizi;
        this.fiyat=fiyat;
    }



//constructer



/*
//, float yakitMiktari, float kilometre
public Araba(String marka, int maxhizi, int yili, int fiyat, float yakitMiktari ){
    System.out.println("parametreli Yapıcı fonksiyon tetiklendi-çalıştı");
    this.marka=marka;
    this.maxhizi=maxhizi;
    this.yili=yili;
    this.fiyat=fiyat;
  //  this.yakitMiktari=yakitMiktari;
  //  this.kilometre=kilometre;
}
*/
    public int getFiyat(){
        return fiyat;
    }
    public void setFiyat(int pfiyat){
        fiyat =pfiyat;
        System.out.println("Fiyat bilgisi güncellendi");
    }

    // get kilometre method-return
    public float getKilometre() {
        return kilometre;
    }
    // set kilometre
    public void setKilometre(float kilometre) {
        this.kilometre = kilometre;
    }

    public void setYakitDoldur(float dyakit) {
        this.yakitMiktari = yakitMiktari + dyakit;
    }

    public float getYakitMiktari() {
        return yakitMiktari;
    }

    public void gitGeri(float km){
        kilometre=kilometre+km;
        yakitMiktari=yakitMiktari-1;
        System.out.println("Konum bilgisi geri yönde güncellendi");

    }
    public void gitIleri(float km){
        kilometre=kilometre+km;
        yakitMiktari=yakitMiktari-1;     //km başına 1 litre yaksın
        System.out.println("Konum bilgisi ileri yönde güncellendi");
    }

    private String hataFırlat(int hatakodu) {
        //Random rand = new Random();
        //int int_random = rand.nextInt(7);
        String hata;
        switch (hatakodu) {
            case 1:
                hata = "Lastik Basıncı";
                break;
            case 2:
                hata= "Motor yağı eksik";
                break;
            case 3:
                hata= "Silecek arızası";
                break;
            case 4:
                hata= "Triger kayıs ömrü dolmak üzere";
                break;
            case 5:
                hata= "Motor yagı eksik";
                break;
            case 6:
                hata= "Motor sıcaklık artisi- Hararet";
                break;
            case 7:
                hata= "Filtre yetersiz calisiyor";
                break;
            default:
                hata= "Hata yok-yola devam edebilirsin";

        }
        return hata;

    }

    public String hataUret (){
        Random rand = new Random();
        int int_random = rand.nextInt(7);
        String hataMetni=hataFırlat(int_random);
        return hataMetni;
    }



}


/*
The this keyword refers to the current object in a method or constructor.
*/

