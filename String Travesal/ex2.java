
/**
 * クラス ex2 の注釈をここに書きます.
 * 
 * @author (Hein THu)
 * @version (2019/11/01)
 */
public class ex2{
    public static void main(String[] args){
        String name = "hein";
            int length = name.length();
             char lastName = name.charAt(length);
        for(int i = 0;i < name.length();i++){
            char letter = name.charAt(i);
                System.out.print(letter);
        }
    }
}

