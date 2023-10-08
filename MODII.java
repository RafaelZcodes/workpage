package C14;

public class MODII { public static double areaFinal, pi=3.1416;

    static double AreaQuadrado(double area){

areaFinal= area + area;
return areaFinal;
    }

    static double AreaRetangulo(double base, double altura){
areaFinal = base*altura;
return areaFinal;

    }

    static double AreaTranguloRetangulo(double base, double altura){
        areaFinal = (base * altura)/2;
        return areaFinal;
    }

    static double AreaCirculo(double raio){
        areaFinal = pi * Math.pow(raio,2);
        return areaFinal;
    }
}
