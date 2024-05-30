package com.example.projectteorver;

public class A10 extends Namber{
    A10(int seed){
        super(seed);
        vero=(double) rand(3,6)/1000;
    }
    public String get(){
        return ". По каналу связи передается 1000 знаков. Каждый\n" +
                "знак может быть искажен независимо от остальных с ве" +
                "роятностью "+vero+". Найти вероятность того, что будет ис" +
                "кажено не более трех знаков.\n";
    };
    public String aswer(){
        double a=1000*vero;
        double roundedNumber = Math.round((double) (Math.exp(-a)*Math.pow(a,3)/Namber.getFactorial(3)+Math.exp(-a)*a*a/2+Math.exp(-a)*a) * 100.0) / 100.0;
        //System.out.println(roundedNumber);
        return ". "+ roundedNumber;
    }
}
