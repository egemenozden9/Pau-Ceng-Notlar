import java.util.Scanner;

public class ArabaTest {

    public static void main(String[] args) {
        // define Araba object=new Araba();


        Araba car1 = new Araba();
        //  System.out.printf("Araba 1: %s--%d--%d--%d%n", car1.marka, car1.yili, car1.maxhizi, car1.getFiyat());
        // Araba car4 = new Araba();
        // System.out.printf("Araba 2: %s--%d--%d--%d%n",car4.marka,car4.yili,car4.maxhizi,car4.getFiyat());

        // Araba car5=new Araba("Woswos",2022,400,750000);
        // System.out.printf("%s--%d--%d--%d",car4.marka,car4.yili,car4.maxhizi,car4.getFiyat());

        // car1.marka="Mercedes";
        // car1.maxhizi=1100;
        // car1.yili=2020;
        //System.out.printf("Araba 1: %s--%d--%d--%d%n", car1.marka, car1.yili, car1.maxhizi, car1.getFiyat());
        //  System.out.printf("Araba 5: %s--%d--%d--%d",car5.marka,car5.yili,car5.maxhizi,car5.getFiyat());
        /*       System.out.printf("%s--%d--%d--%d",car5.marka,car5.yili,car5.maxhizi,car5.getFiyat());
        System.out.println(car1.maxhizi);
        System.out.println(car1.marka);
        System.out.println(car1.yili);

        car1.setFiyat(500000);
        System.out.printf("Arananın yeni fiyatı:%d%n",car1.getFiyat());

        Araba car2 =new Araba();

*/
        /*

        Araba car1 =new Araba("Mercedes",800,2020,500000,15,0);
        System.out.printf("Araba 1 --> marka:%s - fiyat:%d - yili:%d - maxhizi:%d - kilometre:%.1f - yakıt miktarı:%.1f%n",
                car1.marka,
                car1.getFiyat(),
                car1.yili,
                car1.maxhizi,
                car1.getKilometre(),
                car1.getYakitMiktari());
         */


        //  Araba car2 =new Araba("Tesla",800,2022,700000,18,0);
     /*   System.out.printf("Araba 2 --> marka:%s - fiyat:%d - yili:%d - maxhizi:%d - kilometre:%.1f - yakıt miktarı:%.1f",
                car2.marka,
                car2.getFiyat(),
                car2.yili,
                car2.maxhizi,
                car2.getKilometre(),
                car2.getYakitMiktari());
/*
        // paket içi farklı sınıflarda da olsa Random import edilmiş gibi
        Random rand11 = new Random();
        int int_ran = rand11.nextInt(7);
        System.out.printf("%npaket içi class-import denemesi:%d%n",int_ran);
 */

        System.out.printf("Araba 1: %s--%d--%d--%d --%f, -- %f %n", car1.marka, car1.yili, car1.maxhizi, car1.getFiyat(), car1.getYakitMiktari(), car1.getKilometre());

        int durak = 1;
        while (durak <= 23) {

            if (car1.getYakitMiktari() > 0) {
                car1.gitIleri(1000);
                System.out.printf("Durak sayısı:%d - Arananın kilometresi:%.1f ** Güncel yakıt bilgisi %.0f%n", durak, car1.getKilometre(), car1.getYakitMiktari());

                if (car1.getKilometre() % 10000 == 0) {
                    System.out.println("***** UYARI ********* Arananın 10.000 bakımı geldi **************");
                    //car1.setKilometre(0);
                    String err = car1.hataUret();
                    System.out.printf("***** UYARI ********* Araçta ' %s ' hatası/uyarısı meydana geldi %n", err);
                }
            } else {
                System.out.printf("Arabanın yakıtı yok:%.1f", car1.getYakitMiktari());
                //break;

                Scanner userInput = new Scanner(System.in);  // hata varsa-break sil
                System.out.printf("Yakit Yüklemek istermisin ** Evet-yakıt miktarı ** Hayır:0 ");
                int litreYakit = userInput.nextInt();
                if (litreYakit == 0) {
                    break;
                } else {
                    car1.setYakitDoldur(litreYakit);
                }

            }
            durak++;  // Test forget this line
        }


        // for döngüsü ile
        /*
         for (int i = 0; i < 21; i++) {
            car1.gitIleri(1000);
            System.out.printf("Arananın yeni konumu:%.1f%n",car1.getKilometre());
            if (car1.getKilometre()%10000 == 0){
                System.out.println("***** UYARI ********* Arananın 10.000 bakımı geldi **************");
                car1.setKilometre(0);
            }

        }
        */


    }
}

        //car1.setArabaOzellik("Opel");
 //       System.out.println("Araba1 markası:"+car1.marka+car1.maxhiz);
 //       System.out.printf("Arabanın markası:%s%nMax hız:%d",car1.marka,car1.maxhiz);

        /*
       System.out.println(car1.fiyat);  //public
       System.out.println(car1.getFiyat());  //private

       car1.setFiyat(750000);
       System.out.println(car1.getFiyat());

nextInt()
nextFloat()
nextLine() strfin

         */






