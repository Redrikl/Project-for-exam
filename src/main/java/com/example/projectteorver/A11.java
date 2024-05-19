package com.example.projectteorver;

public class A11 extends Namber{
    double vero1;
    double vero2;
    A11(int seed) {
        super(seed);
        vero=(double) rand(5,8)/10;
        vero1=(double) rand(5,8)/10;
        vero2=(double) rand(5,8)/10;
    }
    public String get(){
        return ". Рабочий обслуживает три станка. Вероятность того,\n" +
                "что в течение определенного промежутка времени отка-\n" +
                "жет первый станок, равна "+vero+"; второй — "+vero1+"; третий — "+vero2+".\n" +
                "Составить ряд распределения числа станков, которые от-\n" +
                "кажут в течение определенного промежутка времени. Най-\n" +
                "ти М(Х), D(X), 2(X), F(X) этой случайной величины. По-\n" +
                "строить график F(X).\n";
    }
    public String aswer(){
        double a=1000*vero;
        double roundedNumber = Math.round((Math.exp(-a)*Math.pow(a,3)/Namber.getFactorial(3)+Math.exp(-a)*a*a/2+Math.exp(-a)*a) * 100.0) / 100.0;
        System.out.println(roundedNumber);
        return ""+ roundedNumber;
    }
}
