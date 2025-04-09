import java.awt.*;
import java.util.*;

public class Strings {

    public static void main(String[] args) {
/*
        String greeting = "Hello World";  //append test
        System.out.println(greeting);
        System.out.println("The length of the txt string is: " + greeting.length());

      // System.out.println("The length of the txt string is: " + greeting.length());
    ///    String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    //    System.out.println("The length of the txt string is: " + txt.length());
        System.out.println(greeting.toUpperCase());   // Outputs "HELLO WORLD"
        System.out.println(greeting.toLowerCase());   // Outputs "hello world"
        System.out.println(greeting.indexOf("o"));
        String s1="ali";
        String s2="veli";
        System.out.println(s1+" "+s2);
        System.out.println(s1.concat(s2));
*/

       // String text="DenemeMetin";
      //  System.out.println(text.substring(2)); //başlama indexi
       // System.out.println(text.substring(0,4));
        //startIndex: inclusive
        //endIndex: exclusive
       // System.out.println(text.indexOf("M"));
     //   text.append("dene");


/*
        String txt1 = "Please locate where 'locate' occurs!";
        System.out.println(txt1.indexOf("p"));
        //The indexOf() method returns the index (the position) of the first occurrence of a specified text in a string (including whitespace):
*/
/*
        String firstName = "John";
        String lastName = "Doe";
        System.out.println(firstName + " " + lastName);
      //  System.out.println(firstName.concat(lastName));

        String newS=firstName+lastName;
        System.out.println("yeni string:"+newS);


        String text="DenemeMetin";
        System.out.println(text.substring(2)); //başlama indexi
        System.out.println(text.substring(0,2));
        //startIndex: inclusive
        //endIndex: exclusive
        System.out.println(text.indexOf("M"));

        /*
        Java uses the + operator for both addition and concatenation.
        Numbers are added. Strings are concatenated.
         */

       // https://www.javatpoint.com/StringBuilder-class
        //Java StringBuilder sınıfı, değiştirilebilir (değiştirilebilir) String oluşturmak için kullanılır.

       // StringBuilder sb=new StringBuilder("HelloTestMe");
       // sb.append("Pau");  //append() method concatenates the given argument with this String.
       // sb.insert(2,"XX"); //insert() method inserts the given string with this string at the given position.
      //  System.out.println(sb.insert(2,"NEW"));
       // System.out.println(sb.charAt(2));



        // System.out.println(sb.charAt(0));  // ilgili indexteki karakter alma.



        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
       // PAU---->sezar---encoded text  SDX-PAU

        //ABC---şifreli


        String son3chars= chars.substring(23) ; //XYZ
        System.out.println(son3chars);
        String ilk23chars= chars.substring(0,23) ; //XYZ
        System.out.println(ilk23chars);
        String enct=son3chars+ilk23chars;
        System.out.println(chars);
        System.out.println(enct);



       //System.out.println(son3chars);
       // System.out.println(ilk23chars);

        //String sifreliTxt=son3chars+ilk23chars;
        //System.out.println(sifreliTxt);


        // sezar şifreleme-şifrelerken 3 karakter sonrasını seç-encription ıcın 3 geri
        //PAU-->SDX
        //ABC

    }


}
