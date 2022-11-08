import java.util.Scanner;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

public class Palindromo {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String palavra = sc.nextLine();
            //TODO: Retorne TRUE ou FALSE, caso a "palavra" seja ou não um Palíndromo.
            System.out.println(isPalindromo(palavra));
        }
    public static String isPalindromo(String palavra){
        String reverso = new StringBuilder(palavra).reverse().toString();
        if (reverso.equals(palavra))
            return "TRUE";
        else return "FALSE";
    }
    /*
    public static Boolean isPalindromo(String palavra){
        String reverso = new StringBuilder(palavra).reverse().toString();
        return reverso.equals(palavra);
    }

     */

}
