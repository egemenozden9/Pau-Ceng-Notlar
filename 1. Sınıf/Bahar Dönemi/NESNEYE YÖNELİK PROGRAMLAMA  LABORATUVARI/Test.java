import java.util.Scanner;

public class Test {
    public static void main(String[] args)
    {
        //uygulama 3
        double step=0.001, toplam=0;
        for(double point=5;point>=-5;point-=step)
            toplam+=step*(point*point);

        System.out.println("Toplam Alan:"+toplam);
        /*
        //uygulama 2
        Scanner s=new Scanner(System.in);
        int num1,num2,toplam;
        num1=s.nextInt();
        num2=s.nextInt();
        toplam=num1+num2;
        for (int i = 0; i <5 ; i++) {
            System.out.print(toplam+"\n");
        }*/
        /*Uygulama 1
        Scanner s=new Scanner(System.in);
        String ad,soyad;
        System.out.print("İsim giriniz:");
        ad=s.nextLine();
        System.out.println("Soyad giriniz");
        soyad=s.nextLine();
        System.out.println("Girilen isim:"+ad+"\t"+soyad);*/
    }
}
