package com.example.projectteorver;

public class A11 extends Namber{
    double vero1;
    double vero2;
    A11(int seed) {
        super(seed);
        vero=(double) rand(5,8)/10;
        vero1=(double) rand(5,8)/10;
        vero2=(double) rand(5,8)/10;
        //vero=0.7;
        //vero1=0.7;
        //vero2=0.8;
    }
    public String get(){
        return ". Рабочий обслуживает три станка. Вероятность того,\n" +
                "что в течение определенного промежутка времени отка\n" +
                "жет первый станок, равна "+vero+"; второй — "+vero1+"; третий — "+vero2+".\n" +
                "Составить ряд распределения числа станков, которые от\n" +
                "кажут в течение определенного промежутка времени. Най\n" +
                "ти М(Х), D(X), σ(X), F(X) этой случайной величины. По\n" +
                "строить график F(X).\n";
    }
    public String aswer(){
        double p0=(1-vero)*(1-vero1)*(1-vero2);
        double p1=(vero*(1-vero1)*(1-vero2)+(1-vero)*vero1*(1-vero2)+(1-vero)*(1-vero1)*vero2);
        double p2=(vero*vero1*(1-vero2)+(1-vero)*vero1*vero2+vero*(1-vero1)*vero2);
        double p3=vero*vero1*vero2;
        double m =(p1+2*p2+3*p3);
        double d =((0-m)*(0-m)*p0+(1-m)*(1-m)*p1+(2-m)*(2-m)*p2+(3-m)*(3-m)*p3);
        return ". Ряд распределения числа станков таков P(X=0):"+getOcruk(p0,1000)+" P(X=1):"+getOcruk(p1,1000)+" P(X=2):"+getOcruk(p2,1000)+" P(X=3):"+getOcruk(p3,1000)+" M(X):"+getOcruk(m,1000)+" D(X):"+getOcruk(d,1000)+" σ(X):"+getOcruk(Math.sqrt(d),1000)+
                " F(X<0)="+getOcruk(p0,1000)+"F(X<1)="+getOcruk(p0+p1,1000)+"F(X<2)="+getOcruk(p0+p1+p2,1000)+"F(X<3)="+getOcruk(p0+p1+p2+p3,1000);
    }
}
