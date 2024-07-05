import java.util.Scanner;
// Exercicio de leitor de listas
public class App {
    public static void main(String[] args) throws Exception {
        // Importar a classe Scanner
        Scanner scanner = new Scanner(System.in);
        
        // Declarar e criar um array de inteiros com 5 elementos
        int[] numeros = new int[5];
        int[] numeros2 = new int[2]; // Alterei para ter 2 elementos, como parece ser a intenção

        // Mensagem para o usuário
        System.out.println("Por favor, insira 5 números:");

        // Usar um loop para preencher o array 'numeros' com entradas do usuário
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        // Fala mais dois números ai bobão
        System.out.println("Por favor, insira 2 índices (0 a 4) para somar os valores correspondentes:");
        for (int i = 0; i < numeros2.length; i++) {
            System.out.print("Índice " + (i + 1) + ": ");
            numeros2[i] = scanner.nextInt();
        }

        // Fechar o scanner
        scanner.close();

        // Exibir os números inseridos
        System.out.println("Os números inseridos são:");
        for (int numero : numeros) {
            System.out.println(numero);
        }

        // Somar os valores dos índices especificados por 'numeros2'
        int soma = 0;
        for (int i = 0; i < numeros2.length; i++) {
            int indice = numeros2[i];
            if (indice >= 0 && indice < numeros.length) {
                soma += numeros[indice];
            } else {
                System.out.println("Índice inválido: " + indice);
            }
        }

        // Exibir a soma dos valores
        System.out.println("A soma dos valores nos índices especificados é: " + soma);
    }
}
