public class OperacoesAritmeticas {

    public static void main(String[] args) {
        // Exemplo de soma
        int resultadoSoma = somar(5, 3);
        System.out.println("Soma: " + resultadoSoma);

        // Exemplo de subtração
        int resultadoSubtracao = subtrair(10, 4);
        System.out.println("Subtração: " + resultadoSubtracao);

        // Exemplo de multiplicação
        int resultadoMultiplicacao = multiplicar(6, 7);
        System.out.println("Multiplicação: " + resultadoMultiplicacao);

        // Exemplo de divisão
        double resultadoDivisao = dividir(15, 3);
        System.out.println("Divisão: " + resultadoDivisao);
    }

    // Função para realizar a soma
    public static int somar(int a, int b) {
        return a + b;
    }

    // Função para realizar a subtração
    public static int subtrair(int a, int b) {
        return a - b;
    }
    // Função para realizar a multiplicação
    public static int multiplicar(int a, int b) {
        return a * b;
    }

    // Função para realizar a divisão
    public static double dividir(int a, int b) {
        if (b != 0) {
            return (double) a / b;
        } else {
            System.out.println("Erro: Divisão por zero não permitida.");
            return Double.NaN;
        }
    }
}
