//https://www.codewars.com/kata/54b724efac3d5402db00065e
public class MorseCodeDecoder {
    public static String decode(String morseCode) {
        String letters[]=morseCode.trim().split(" ");
        String sentence="";
        for(int i=0; i<letters.length;i++){
            if(letters[i].isEmpty()&&letters[i+1].isEmpty()){
                sentence+=" ";
                i++;
            }
            else
                sentence+=MorseCode.get(letters[i]);
        }
        return sentence;
    }
}
