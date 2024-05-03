/*3) Utilizar Métodos Estáticos:
Crie uma classe chamada CalculoArray com métodos estáticos que façam cálculos em arrays unidimensionais do tipo int[].
Todos esses métodos recebem um array por parâmetro e retornam um resultado. Crie os seguintes métodos:
- calcularSoma: soma todos os elementos do array e retorna um resultado ind;
- calcularMedia: calcula a média de todos os elementos do array e retorna um resultado double;
- ordernar: ordena o array em ordem crescente e retorna o array ordenado;
- ordernarDecr: ordena o array em ordem decrescente e retorna o array ordenado.
- concatenar: recebe como parâmetro dois arrays do tipo int[] e retornará outro array que tem os elementos desses dois arrays juntos.*/

import java.util.Arrays;

public final class CalculoArray { 
	
	CalculoArray() {}
	
	public static int calcularSoma(int array[]) {
		int soma = 0;
		for (int num: array) {
			soma += num;
		}
		return soma;
	}
	
	public static double calcularMedia(int[] array) {
        int soma = calcularSoma(array);
        return (double) soma / array.length;
    }

    public static int[] ordenar(int[] array) {
        int[] sortedArray = Arrays.copyOf(array, array.length);
        Arrays.sort(sortedArray);
        return sortedArray;
    }

    public static int[] ordenarDecr(int[] array) {
        int[] sortedArray = Arrays.copyOf(array, array.length);
        Arrays.sort(sortedArray);
        reverseArray(sortedArray);
        return sortedArray;
    }

    private static void reverseArray(int[] array) {
        int start = 0;
        int end = array.length - 1;
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }

    public static int[] concatenar(int[] array1, int[] array2) {
        int[] concatenatedArray = new int[array1.length + array2.length];
        System.arraycopy(array1, 0, concatenatedArray, 0, array1.length);
        System.arraycopy(array2, 0, concatenatedArray, array1.length, array2.length);
        return concatenatedArray;
    }
}

