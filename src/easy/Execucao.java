package easy;

public class Execucao {
    public static void main(String[] args) {
        // Exercicio02 exercicio02 = new Exercicio02();
        // System.out.println(exercicio02.retornaPalavraDigitada("Teste QA Academy"));

        // Exercicio03 exercicio03 = new Exercicio03();
        // System.out.println(exercicio03.exibeValoresTrocados(10, 20));

        // Exercicio04 exercicio04 = new Exercicio04();
        // System.out.println("O dobro do numero enviado: "+ 10 +" Será:
        // "+exercicio04.calcularDobro(10));

        // Exercicio05 exercicio05 = new Exercicio05();

        // System.out.println("A soma dos números digitados é: " +
        // exercicio05.calcularSoma(10, 20, 30));
        // System.out.println("A subtração dos números digitados é: " +
        // exercicio05.calcularSubtracao(10, 20, 30));
        // System.out.println("A multiplicacao dos números digitados é: " +
        // exercicio05.calcularMultiplicacao(10, 20, 30));
        // System.out.println("A media dos números digitados é: " +
        // exercicio05.calcularMedia(10, 20, 30));

        // Exercicio06 exercicio06 = new Exercicio06();
        // System.out.println(exercicio06.verificarAprovacao(5, 5));

        // System.out.println("O Inss a ser pago será:
        // "+exercicio07.calcularInss(1045.00));

        // Exercicio07 exercicio07 = new Exercicio07();
        // Exercicio08 exercicio08 = new Exercicio08();
        // double salario = 5000.00;
        // double impostoRenda = exercicio08.calcularImpostoDeRenda(2000.00);
        // double valorInss = exercicio07.calcularInss(salario);
        // System.out.println("O Valor do Imposto de renda será: " + impostoRenda);
        // System.out.println("O Valor do Salario Bruto será: " + salario);
        // System.out.println(
        // "O Valor do salario liquido será " +
        // exercicio08.calcularSalarioLiquido(salario, impostoRenda, valorInss));

        Exercicio09 exercicio09 = new Exercicio09();
        int[] vetorTabuada = exercicio09.calcularTabuada(10);
        exibirVetor(vetorTabuada);
    }

    public static void exibirVetor(int[] vetorParaImprimir) {
        int i = 0;
        while (i < vetorParaImprimir.length) {
            System.out.println(vetorParaImprimir[i]);
            i++;
        }
    }
}