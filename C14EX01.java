package C14;

import java.util.Scanner;

public class C14EX01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int opcao = 0;

        System.out.print("Bem vindo a selecao de programas " +
                "\nSelecione as seguintes opcoes para executar os seguintes programas e digite (9) para fechar o programa " +
                "\n(1) Para calcular o IMC (Indice de Massa corporal)" +
                "\n(2) Para calcular o valor a ser Retido de Imposto de Renda de um empregado" +
                "\n(3) Para converter temperatura em Celcius para Kelvin e Fahrenheit" +
                "\n(4) Para canverter o tempo de duracao de um evento em Horas, Minutos e Segundos  " +
                "\n(5) Para calcular o Percentual Liquido de um empregado");

        System.out.print("\n Digite uma Opcao: ");
        opcao = teclado.nextInt();

        if (opcao == 9) {
            System.out.println("Obrigado por usar o nosso progrma.." +
                    "\nFinalzado com Exito");
        } else if (opcao < 0 || opcao > 5){
            System.out.println("Ops.. Opcao invalida, reinicie o programa e tente novamente.");
         }

        while (opcao > 0 && opcao < 6 || opcao == 9) {


            switch (opcao) {
                case 1: //C6EX8
                    double peso, altura, imc;
                    String nome;

                    System.out.print("\nInforme o seu nome: ");
                    nome = teclado.nextLine();
                    teclado.nextLine();

                    System.out.print("\nInforme a sua altura: ");
                    altura = teclado.nextDouble();

                    System.out.print("\ninforme o seu peso: ");
                    peso = teclado.nextDouble();

                    if (MODI.IMC_Calculo(peso, altura) < 20)
                        System.out.println(nome + ", Voce esta abaixo do peso." +
                                "\nIMC = " + MODI.IMC_Calculo(peso, altura));
                    else if (MODI.IMC_Calculo(peso, altura) < 25) {
                        System.out.println(nome + ", Voce esta no peso ideal." +
                                "\nIMC = " + MODI.IMC_Calculo(peso, altura));

                    } else if (MODI.IMC_Calculo(peso, altura) > 25) {
                        System.out.println(nome + ", Voce esta acima do peso." +
                                "\nIMC = " + MODI.IMC_Calculo(peso, altura));
                    }
                    break;

                case 2:
                    double liquido, ir, salario;
                    int dependentes;

                    System.out.print("Informe seu salário: ");
                    salario = teclado.nextDouble();

                    System.out.print("Inforem o numero de dependentes: ");
                    dependentes = teclado.nextInt();

                    System.out.println();
                    System.out.println("Imposto de renda = R$" + MODI.IR_calculo(salario, dependentes));

                    break;

                case 3:
                    double cel;

                    System.out.print("Informe a temperatura(Celsius) para conversão: ");
                    cel = teclado.nextDouble();
                    System.out.println();
                    System.out.println("Celsius: " + cel + "\nKelvin: " + MODI.KelConver(cel) + "\nFahrenheit: " + MODI.FahConver(cel));
                    break;

                case 4:
                    int secIn;

                    System.out.print("Informe o numero de segundos: ");
                    secIn = teclado.nextInt();

                    System.out.println("Horas = " + MODI.ConvHr(secIn) + ", Minutos = " + MODI.ConvMin(secIn) + ", Segundos = " + MODI.ConvSeg(secIn));
                    break;

                case 5:
                    double plBruto, irl, plLiquido, salarioE;

                    System.out.print("\nInforme o valor do salário do empregado: ");
                    salarioE = teclado.nextDouble();

                    System.out.println(MODI.SalarioLiquido(salarioE));

                    break;


// exercicio 7 mod 6

            }
            while (true) ;
        }
        teclado.close();
    }
}

