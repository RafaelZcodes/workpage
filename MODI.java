package C14;

import java.util.Scanner;

public class MODI {
    public static double imc, peso, altura;

    static double IMC_Calculo(double peso, double altura) {
        if (peso > 1 && altura > 1) {
            do {
                imc = peso / Math.pow(altura, 2.0);
                return imc;
            } while (true);

        } else
            return 0;
    }
    // exercicio 8 mod 6
    //===================================================================================
    public static double liq, ir;

    static double IR_calculo(double sal, double dep) {
        liq = sal - (dep * 60.0);
        ir = liq * (15.0 / 100);
        return ir;
    }
    //exercicio 3 mod 5
    //===================================================================================
    public static double cel, fah, kel;
    static double KelConver(double cel1) {

        kel = cel1 + 273.00;
        return kel;
    }
    static double FahConver(double cel) {


        fah = (cel * 9 / 5) + 32.0;
        return fah;

    }
    //exercicio 5 mod 5
    //===================================================================================

    public static int segundos, segundosOut, min, hr, fullout;

    static double ConvHr(int segundos) {
        hr = segundos / 3600;
        return hr;

    }

    static double ConvMin(int segundos) {
        min = (segundos / 60) % 60;
        return min;

    }

    static double ConvSeg(int segundos) {
        segundosOut = segundos % 60;
        return segundosOut;
    }
    //exercicio 12 mod 5
    //===================================================================================
    public static double plBruto, plLiquido;
    static double SalarioLiquido(double salario) {

        if (salario <= 300.00)
            plBruto = (500 + (salario * 0.7));
        else if (salario <= 1000.00) {
            plBruto = (200 + (salario * 0.5));
        } else {
            plBruto = salario * 0.3;

        }
        ir =plBruto *0.25;
        plLiquido =plBruto -ir;
        return plLiquido;
    }
}
//exercicio 7 mod 6

