package lesson4;

import java.util.Locale;

public class Main3 {
    public static void main(String[] args) {
        String password = "asdf4gfff";

       int countChars= password.length();
        if (countChars <8){
            System.out.println("Символов меньше 8");
            return;
        }
        String alfabetUpper = "abcdefghijklmnopqrstuvwxyz".toUpperCase();
        int countUpperLetters=0;
        for (int i=0; i<password.length(); i++){
            char currentCharFromPassword = password.charAt(i);
            if (alfabetUpper.contains(currentCharFromPassword + "")){
                countUpperLetters++;
            }
        }
        if (countUpperLetters==0){
            System.out.println("Пароль не содержит заглавную букву");
            return;

        }
    }
}
