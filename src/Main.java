import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        calculadora();
    }

    public static void calculadora() {
        int num = 0, operador;

        do {

            float n1, n2, resultado = 0;
            System.out.print("Digite o primeiro numero: ");
            n1 = scanner.nextFloat();

            do {
                System.out.print("Digite:\n1 para +\n2 para -\n3 para /\n4 para x\n");
                operador = scanner.nextInt();

                if (operador < 1 || operador > 4) {
                    System.out.printf("O numero %d nao é valido\n", operador);
                }
            } while (operador < 1 || operador > 4);

            System.out.println("Digite o segundo numero: ");
            n2 = scanner.nextFloat();


            switch (operador) {
                case 1: {
                    resultado = n1 + n2;
                    break;
                }
                case 2: {
                    resultado = n1 - n2;
                    break;
                }
                case 3: {
                    if (n2 == 0) {
                        System.out.println("Não é possivel dividir por 0");
                        continue;
                    }
                    resultado = n1 / n2;
                    break;
                }
                case 4: {
                    resultado = n1 * n2;
                    break;
                }

                default: {
                    System.out.println("Ocorreu um erro, tente novamente");
                    break;
                }
            }

            System.out.printf("%.2f %s %.2f = %.2f\n", n1, (operador == 1 ? "+" : operador == 2 ? "-" : operador == 3 ? "/" : "X"), n2, resultado);

            System.out.println("Digite 1 para continuar e 2 para parar!: ");
            num = scanner.nextInt();
        } while (num != 2);
    }
}