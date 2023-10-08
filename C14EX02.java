package C14;

import java.util.Scanner;

public class C14EX02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcao;
        double area, base, altura, raio;
        System.out.print("\n=============================================================================================="
                +"\nOla, Seja bem vindo ao C.D.F (Calculos de Figuras) "
                +"\n=============================================================================================="
                + "\nSelecione umas das opcoes para calcular as seguintes figuras disponiveis. Para sair do programa digite (9)"
                + "\n(1) Para calcular a Area de um Quadrado"
                + "\n(2) Para calcular a Area de um Retangulo"
                + "\n(3) Para calcular a Area de um Triangulo Retangulo"
                + "\n(4) Para calcular a Area de um Circulo"
                + "\nDigite uma opcao para comecar: ");
        opcao = teclado.nextInt();

        if (opcao == 9) {
            System.out.println("Obrigado por usar o nosso progrma.." +
                    "\nFinalzado com Exito");
        }
            else if (opcao < 0 || opcao > 4) {
                System.out.println("Ops.. Opcao invalida, reinicie o programa e tente novamente.");
            }


        while (opcao > 0 && opcao < 5) {


            switch (opcao) {
                case 1:
                    System.out.print("De o valor de uma Area");
                    area = teclado.nextDouble();
                    System.out.println("O valor Final do calculo dfeito e de: " + MODII.AreaQuadrado(area));
                    break;
                case 2:
                    System.out.print("De o valor de uma base");
                    altura = teclado.nextDouble();
                    System.out.print("De o valor de uma altura");
                    base = teclado.nextDouble();

                    System.out.println("O valor Final do calculo dfeito e de: " + MODII.AreaRetangulo(altura, base));
                    break;
                case 3:
                    System.out.print("De o valor de uma base");
                    altura = teclado.nextDouble();
                    System.out.print("De o valor de uma altura");
                    base = teclado.nextDouble();

                    System.out.println("O valor Final do calculo dfeito e de: " + MODII.AreaTranguloRetangulo(altura, base));
                    break;
                case 4:
                    System.out.print("De o valor do raio");
                    raio = teclado.nextDouble();
                    System.out.println("O valor Final do calculo dfeito e de: " + MODII.AreaCirculo(raio));
                    break;

            }

        }
     teclado.close();   }
    }
