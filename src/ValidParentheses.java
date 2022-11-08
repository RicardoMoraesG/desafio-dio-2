import java.util.*;

/**
 * Desafio
 * Dada uma string com apenas os seguintes caracteres
 * '(', ')', '{', '}', '[', ']'
 * determine se uma determinada string é válida.
 *
 * Entrada
 * Uma string é considerada válida se:
 *
 * Caracteres de abertura devem ser fechadas pelo mesmo tipo.
 * Abertura devem ser fechados com uma chave correspondente.
 * Uma string vazia é considerada válida.
 */
public class ValidParentheses {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        //boolean caracter = ehValido(scanner.nextLine());
        boolean caracter = ehValido(scanner.nextLine());
        System.out.println(caracter);
    }

    public static boolean ehValido(String s) {
        // implemente a lógica de caracteres válidos
        // e retorne se a string é valida ou não.
        boolean valido = false;
        char abre = s.charAt(0);
        char fecha = s.charAt(s.length()-1);
        System.out.println(abre);
        System.out.println(fecha);
        if((abre == '[') && (fecha ==']')) valido = true;
        if((abre == '(') && (fecha ==')')) valido = true;
        if((abre == '{') && (fecha =='}')) valido = true;
        return valido;
    }

}
