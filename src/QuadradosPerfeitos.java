import java.util.*;

/**
 * Desafio
 * Dado um inteiro n,
 * retorne o menor número de números quadrados perfeitos
 * cuja soma seja n. Um quadrado perfeito é um inteiro
 * que é o quadrado de um inteiro;
 * em outras palavras, é o produto de algum inteiro consigo mesmo.
 * Por exemplo, 1, 4, 9 e 16 são quadrados perfeitos, enquanto 3 e 11 não são.
 *
 * Entrada
 * A entrada consiste em um número inteiro n, representando o valor total.
 *
 * Saída
 * A saída consiste em retornar o menor número de números quadrados perfeitos.
 */
public class QuadradosPerfeitos {

    public static void main(String[] args) {
        int n = Integer.parseInt(new Scanner(System.in).nextLine());
        int[] d = new int[n + 1];
        // Com base no valor total,
        // retorne o menor número de quadrados perfeitos.
        List<Integer> lista = listarQuadradosPerfeitos(n);
        int menorNumero = iterar(lista, n);
        System.out.println(menorNumero);
    }

    public static int iterar(List<Integer> lista, int n){
        boolean resultado = false;
        int iteracoes = 0;//A quantidade de quadrados perfeitos para totalizar a soma.
        while(!resultado) {
            iteracoes++;
            //Testar o método mais simples primeiro: dividir.
            //Exemplo: (9 / 1) = 9. Ou (16 / 3) = 4 (4+4+4);
            //Se 4 está na lista, é um quadrado perfeito.
            if (lista.contains(n / iteracoes )) {
                resultado = true;
                //Senão, somar números da sequência da lista.
            } else if (somarQuadradosPerfeitos(lista, n, iteracoes)) {
                iteracoes++;//somar mais uma iteração;
                resultado = true;
            }
        }
        return iteracoes;
    }
    public static boolean somarQuadradosPerfeitos(List<Integer> lista, int n, int iteracao){
        boolean resultado = false;
        int maiorIndice = lista.size() - 1;//Fluxo do maior para menor.
        int acumulado = lista.get(maiorIndice);
        while(iteracao > 0){
            for(int i = maiorIndice; i >= 0; i--){
                if(acumulado + lista.get(i) == n){
                    //encontrou resultado.
                    i = 0;//sai do for()
                    iteracao = 0;//sai do while()
                    resultado = true;//sai da função()
                } else if(acumulado + lista.get(i) < n){
                    //é um quadrado perfeito que pode ser somado.
                    acumulado = acumulado + lista.get(i);
                }
            }
            iteracao--;
        }
        return resultado;
    }

    public static List<Integer> listarQuadradosPerfeitos(int n){
        int numero = 1;
        int quadradoPerfeito = 1;
        List<Integer> lista = new ArrayList<>();
        while( n >= quadradoPerfeito ){
            lista.add(quadradoPerfeito);
            numero++;
            quadradoPerfeito = numero * numero;
        };
        return lista;
    }

}
