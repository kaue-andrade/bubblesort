import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("\n#-# Sistema IFBA #-#");

        System.out.print("\nDigite a quantidade de idades: ");
        int quantidade = ler.nextInt();

        int[] idades = new int[quantidade];

        System.out.println();

        for (int i = 0; i < quantidade; i++){
            System.out.print("Digite a idade " + (i + 1) + ": ");
            idades[i] = ler.nextInt();
        }

        System.out.println("\nIdades ANTES da ordenação: ");

        System.out.println();

        for (int idade : idades) {
            System.out.print(idade + " ");
        }

        System.out.println();

        for(int i = 0; i < quantidade-1; i++) {
            for (int j = 0; j < quantidade-i-1; j++) {
                if (idades[j] > idades[j+1]){
                    int tempVar = idades[j];
                    idades[j] = idades[j+1];
                    idades[j+1] = tempVar;
                }
            }
        }

        System.out.println("\nIdades DEPOIS da ordenação: ");

        System.out.println();

        for (int idade : idades) {
            System.out.print(idade + " ");
        }

        System.out.println();
    }
}
