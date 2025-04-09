import java.util.Random;

public class Test {
    public static void main(String[] args) {

        //Rastgele int sayı üretimi
        Random rndObj=new Random();
        /*int randomInt=rndObj.nextInt();
        System.out.println("Uretilen random sayi:"+randomInt);
        //Rastgele double(0-1 aralığında) sayı üretimi
        double randomDouble=rndObj.nextDouble();
        System.out.println("Uretilen double sayi:"+randomDouble);
        // 0-100 arasında sayı üretimi
        double randomDouble2=rndObj.nextDouble()*100;
        System.out.println("0.0-100.0 aralığında sayi üretilmesi:"+randomDouble2);
        //10-100 arasında
        double randomDouble3=rndObj.nextDouble()*90+10;
        System.out.println("10.0-100.0 aralığında sayi üretilmesi:"+(int)randomDouble3);
        // 0 -ustlimit
        int ustLimit=50;
        int randomInt2=rndObj.nextInt(ustLimit);
        System.out.println("0-ust limit arası:"+randomInt2);
        System.out.println(Math.random());*/
       /* int total=10000000;
        int cemberici=0;
        int r=1;
        for (int i=0;i<total;i++) {
            double x = rndObj.nextDouble();
            double y = rndObj.nextDouble();
            if (x * x + y * y <= r * r)
                cemberici++;
        }
        double Pi=4*((float)cemberici/total);
        System.out.println("Yaklaşık pi:"+Pi);
*/
        System.out.println((byte)'a');
        System.out.println((int)'a');
        System.out.println((char)75);
        int num=5;
        // tanımladığınız değişkenin türünü ekrana yazdırmak için
        System.out.println(((Object)num).getClass().getName());
        String sdf="";
        if(sdf instanceof String){
            System.out.println("String");
        }
    }
}
