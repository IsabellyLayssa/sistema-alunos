import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantidade de alunos: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] nomes = new String[n];
        double[][] notas = new double[n][5];
        double[] frequencias = new double[n];
        double[] medias = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nAluno " + (i + 1) + ":");

            System.out.print("Nome: ");
            nomes[i] = sc.nextLine();

            double soma = 0;

            for (int j = 0; j < 5; j++) {
                System.out.print("Nota " + (j + 1) + ": ");
                notas[i][j] = sc.nextDouble();
                soma += notas[i][j];
            }

            medias[i] = soma / 5;

            System.out.print("Frequência (%): ");
            frequencias[i] = sc.nextDouble();
            sc.nextLine();
        }

        double[] mediaDisciplinas = new double[5];

        for (int j = 0; j < 5; j++) {
            double soma = 0;

            for (int i = 0; i < n; i++) {
                soma += notas[i][j];
            }

            mediaDisciplinas[j] = soma / n;
        }

        double mediaTurma = 0;

        for (int i = 0; i < n; i++) {
            mediaTurma += medias[i];
        }

        mediaTurma /= n;

        for (int i = 0; i < n; i++) {
            System.out.print(nomes[i] + " ");

            for (int j = 0; j < 5; j++) {
                System.out.print((int) notas[i][j] + " ");
            }

            System.out.println((int) frequencias[i] + "%");
        }

        for (int j = 0; j < 5; j++) {
            System.out.print((int) mediaDisciplinas[j] + " ");
        }
        System.out.println();

        boolean encontrou = false;
        for (int i = 0; i < n; i++) {
            if (medias[i] > mediaTurma) {
                System.out.println(nomes[i]);
                encontrou = true;
            }
        }
        if (!encontrou) 
            System.out.println();

        encontrou = false;
        for (int i = 0; i < n; i++) {
            if (frequencias[i] < 75) {
                System.out.println(nomes[i]);
                encontrou = true;
            }
        }
        if (!encontrou) 
            System.out.println();

        sc.close();
    }
}