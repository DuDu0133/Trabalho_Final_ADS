public class OperacoesAritmeticas {

    public static void main(String[] args) {
        // Exemplo de soma
        int resultadoSoma = somar(5, 3);
        System.out.println("Soma: " + resultadoSoma);

        // Exemplo de subtração
        int resultadoSubtracao = subtrair(10, 4);
        System.out.println("Subtração: " + resultadoSubtracao);
    }

    // Função para realizar a soma
    public static int somar(int a, int b) {
        return a + b;
    }

    // Função para realizar a subtração
    public static int subtrair(int a, int b) {
        return a - b;
    }
}