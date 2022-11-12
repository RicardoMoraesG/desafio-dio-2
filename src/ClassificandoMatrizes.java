// IMPORTANTE: Para ler os dados de entrada do usuário, utilize a classe Scanner,
// instanciando seu leitor da seguinte forma: "Scanner leitor = new Scanner(System.in);".
// Por outro lado, para imprimir suas saídas, utilize System.out.print ou System.out.println.

// Abaixo segue um exemplo de código que você pode ou não utilizar:

import java.util.*;
import java.util.Scanner;

public class ClassificandoMatrizes {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i;
        int N = input.nextInt();
        int[] nums = new int[N];

        for (i = 0; i < N; i++) {
            nums[i] = input.nextInt();
        }
        // mova todos os inteiros pares para o inicio do array, seguido por todos os números ímpares
        int j = 0;
        for (i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                nums[i] = nums[i] ^ nums[j] ^ (nums[j] = nums[i]);
                j++;
            }
        }
        for (var entry : nums) {
            System.out.println(entry);
        }
    }

}
