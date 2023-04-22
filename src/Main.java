import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar ao usuário a quantidade de idades a serem inseridas
        System.out.print("\nDigite a quantidade de idades: ");
        int quantidade = scanner.nextInt();

        // Criar um array para armazenar as idades
        int[] idades = new int[quantidade];

        // Solicitar ao usuário as idades e armazená-las no array
        for (int i = 0; i < quantidade; i++) {
            System.out.print("Digite a idade #" + (i + 1) + ": ");
            idades[i] = scanner.nextInt();
        }

        System.out.println("\nIdades antes da ordenação:");
        for (int idade : idades) {
            System.out.print(idade + " ");
        }

        // Utilizar o algoritmo de bubble sort para ordenar as idades
        for (int i = 0; i < quantidade - 1; i++) {
            for (int j = 0; j < quantidade - i - 1; j++) {
                if (idades[j] > idades[j + 1]) {
                    // Trocar os elementos de posição caso o próximo seja menor
                    int temp = idades[j];
                    idades[j] = idades[j + 1];
                    idades[j + 1] = temp;
                }
            }
        }

        // Exibir a lista de idades ordenada
        System.out.println("\nIdades depois da ordenação:");
        for (int idade : idades) {
            System.out.print(idade + " ");
        }

        scanner.close();
    }
}
