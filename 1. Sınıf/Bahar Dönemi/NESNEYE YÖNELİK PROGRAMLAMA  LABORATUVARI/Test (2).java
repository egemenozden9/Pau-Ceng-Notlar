public class Test {
    public static void main(String[] args)
    {
        String mesaj="HELLO ALL THERE";
        String sifreliMesaj= SezarEncrypt(mesaj,7);
        System.out.println("Kelime: "+mesaj+" \nSifreli:"+sifreliMesaj);
        System.out.println("De-sifre mesaj:"+SezarDecrypt(sifreliMesaj,7));
        System.out.println("De-sifre mesaj:"+SezarDecrypt2(sifreliMesaj,7));

        String key = "VIGENERECIPHER";
        String ori = "Beware the Jabberwock, my son! The jaws that bite, the claws that catch!";
        String enc = VIGENEREencrypt(ori, key);
        System.out.println(enc);
        System.out.println(VIGENEREdecrypt(enc, key));
    }
    static String VIGENEREencrypt(String text, final String key) {
        String res = "";
        text = text.toUpperCase();
        for (int i = 0, j = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c < 'A' || c > 'Z') continue;
            res += (char)((c + key.charAt(j) - 2 * 'A') % 26 + 'A');
            j = ++j % key.length();
        }
        return res;
    }

    static String VIGENEREdecrypt(String text, final String key) {
        String res = "";
        text = text.toUpperCase();
        for (int i = 0, j = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c < 'A' || c > 'Z') continue;
            res += (char)((c - key.charAt(j) + 26) % 26 + 'A');
            j = ++j % key.length();
        }
        return res;
    }
    public static String SezarDecrypt2(String encryptedmesaj, int key)
    {
        String alph="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
       int decryptKey=alph.length()-key;
        StringBuilder decryptedMessage=new StringBuilder(encryptedmesaj);
        for(int i=0; i<encryptedmesaj.length();i++) {
            char letter = encryptedmesaj.charAt(i);
            int idx = alph.indexOf(letter);
            if(idx>=0) {
                int tmpIndis = idx + decryptKey;
                if (tmpIndis >= alph.length())
                    tmpIndis = (idx + decryptKey) % alph.length();
                //System.out.println(tmpIndis);
                char newletter = alph.charAt(tmpIndis);
                decryptedMessage.setCharAt(i, newletter);
            }
        }
        return decryptedMessage.toString();
    }
    public static String SezarDecrypt(String encryptedmesaj, int key)
    {
        String alph="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String encrAlp=alph.substring(key)+alph.substring(0,key);
        StringBuilder decryptedMessage=new StringBuilder(encryptedmesaj);
        for(int i=0; i<encryptedmesaj.length();i++)
        {  char letter=encryptedmesaj.charAt(i);
            int idx=encrAlp.indexOf(letter);
            if(idx >= 0)
            {
                char newLetter=alph.charAt(idx);
                decryptedMessage.setCharAt(i,newLetter);
            }
        }
        return decryptedMessage.toString();
    }
    public static String SezarEncrypt(String mesaj, int key)
    {
        String alph="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String encrAlp=alph.substring(key)+alph.substring(0,key);
        StringBuilder encryptedMessage=new StringBuilder(mesaj);
        for(int i=0; i<mesaj.length();i++)
        {  char letter=mesaj.charAt(i);
            int idx=alph.indexOf(letter);
            if(idx >= 0)
            {
                char newLetter=encrAlp.charAt(idx);
                encryptedMessage.setCharAt(i,newLetter);
            }
        }
        return encryptedMessage.toString();
    }
	public static String VigenereSifreleme(String mesaj, String key) {
        
        String alfabe = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder sifreliMesaj = new StringBuilder(mesaj);
        
        int keyIndex = 0;
        
        for (int i = 0; i < mesaj.length(); i++) {
            char harf = mesaj.charAt(i);
            
            if (harf != ' ') {
                char keyHarf = key.charAt(keyIndex);
                
                int harfDeger = alfabe.indexOf(harf);
                int keyDeger = alfabe.indexOf(keyHarf);
                
                int yeniHarfIndex = (harfDeger+keyDeger) % alfabe.length();
                
                sifreliMesaj.setCharAt(i, alfabe.charAt(yeniHarfIndex));
                
                keyIndex++;
                keyIndex = keyIndex % key.length();
            }
        }
        
        return sifreliMesaj.toString();
        
    }
    
    
    public static String VigenereCozumleme(String mesaj, String key) {
        
        String alfabe = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder cozulmusMesaj = new StringBuilder(mesaj);
        
        int keyIndex = 0;
        
        for (int i=0;i<mesaj.length();i++) {
            
            char harf = mesaj.charAt(i);
            
            if (harf != ' ') {
                
                char keyHarf = key.charAt(keyIndex);
                
                int harfDeger = alfabe.indexOf(harf);
                int keyDeger = alfabe.indexOf(keyHarf);
                
                int yeniHarfIndex = harfDeger-keyDeger;
                
                if (yeniHarfIndex<0) {
                    yeniHarfIndex += alfabe.length();
                }
                
                cozulmusMesaj.setCharAt(i, alfabe.charAt(yeniHarfIndex));
                
                keyIndex++;
                keyIndex = keyIndex % key.length();
                
            }
            
        }
        
        return cozulmusMesaj.toString();
        
    }
}
