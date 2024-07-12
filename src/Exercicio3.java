import java.util.Scanner;

// 3. Criar um programa que calcule a média de salários de uma empresa, pedindo ao usuário a grade de funcionários e os salários, e devolvendo a média salarial.   

// A média é a soma de todos os salários dividido pela quantidade de funcionários.

public class JavaSandynesk {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos funcionários tem na empresa?\n");
        int numFuncionarios = scanner.nextInt();

        double[] salarios = new double[numFuncionarios];

        // Solicitar os salários de cada funcionário
        for (int i = 0; i < numFuncionarios; i++) {
            System.out.print("Digite o salário do funcionário " + (i + 1) + ": ");
            salarios[i] = scanner.nextDouble();
        }

        // Calcular a média salarial
        double soma = 0;
        for (double salario : salarios) {
            soma += salario;
        }
        double mediaSalarial = soma / numFuncionarios;

        // Exibir a média salarial da empresa
        System.out.println("A média salarial da empresa é: " + mediaSalarial);

        // Fechar o scanner
        scanner.close();
    }
}
