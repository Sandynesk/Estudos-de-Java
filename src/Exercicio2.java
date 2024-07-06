import java.util.Scanner;
import java.util.Arrays;
//Exercicio basicamente sobre como somar os indices de 2 arays e inverter ela, e dar o valor invertido

//Desc detalhada: Você recebe duas listas vinculadas não vazias que representam dois números inteiros não negativos. Os dígitos são armazenados em ordem inversa
//e cada um de seus nós contém um único dígito. Adicione os dois números e retorne a soma como uma lista vinculada.
//Você pode assumir que os dois números não contêm nenhum zero à esquerda, exceto o próprio número 0.
public class Exercicio2 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        int[] numeros = new int[3];
        int[] numeros2 = new int[3]; 
       
        System.out.println("Insira 3 numeros nas listas abaixo");

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o numero " + (i + 1) + " da lista 1: ");
            numeros[i] = scanner.nextInt();
        }

        for (int i = 0; i < numeros2.length; i++) {
            System.out.print("Digite o numero " + (i + 1) + " da lista 2: ");
            numeros2[i] = scanner.nextInt();
        }

        // Inverter os arrays
        inverterArray(numeros);
        inverterArray(numeros2);

        // Exibir arrays invertidos
        System.out.println("Lista 1 invertida: " + Arrays.toString(numeros));
        System.out.println("Lista 2 invertida: " + Arrays.toString(numeros2));

        // Fechar o scanner
        scanner.close();

       
        // Calcular a soma dos valores correspondentes dos índices
        int[] somaArray = new int[numeros.length];
        for (int i = 0; i < numeros.length; i++) {
            somaArray[i] = numeros[i] + numeros2[i];

        }
        System.out.println("A soma dos valores correspondentes dos índices é: " + Arrays.toString(somaArray));

    }

    // Método para inverter um array
    //O método inverterArray é definido fora do método main, mas dentro da classe Exercicio2. Isso permite que ele seja chamado de qualquer lugar dentro da classe Exercicio2.

    public static void inverterArray(int[] array) {
        int n = array.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = array[i];
            array[i] = array[n - 1 - i];
            array[n - 1 - i] = temp;
        }
    }
}
