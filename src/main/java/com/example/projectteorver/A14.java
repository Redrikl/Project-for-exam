package com.example.projectteorver;

public class A14 extends Namber{
    double x1;
    double x2;
    double x3;
    double y1;
    double y2;
    double p1;
    double p2;
    double p3;
    double p4;
    A14(int seed) {
        super(seed);
      x1=rand(-3,7);
      x2=rand(-3,7);
      x3=rand(-3,7);
      y1=rand(-3,7);
      y2=rand(-3,7);
      p1=(double) rand(-3,7)/10;
      p2=(double) rand(-3,7)/10;
      p3=(double) rand(-3,7)/10;
      p4=(double) rand(-3,7)/10;
    }
    public String get(){
        return ". Независимые случайные величины X  и  Y заданы таб\n" +
                "лицами распределений.\n" +
                "Найти:\n" +
                "1) M(X), M(Y), D(X), D(Y);\n"+
                "2) таблицы распределения случайных величин Z1 =\n" +
                "= 2X + Y , Z2 = X Y;\n" +
                "3) M (Z1), M (Z2), D(Z1), D(Z2) непосредственно по таб-\n" +
                "лицам распределений и на основании свойств математи-\n" +
                "ческого ожидания и дисперсии."+
        "                                                                                                                                                                                                                                       xi      "+x1+"       "+x2+"     "+x3+"       yi       "+y1+"      "+y2+"                                                                                                                                                                                                                                           pi       p         "+p1+"     "+p2+"      pi       "+p3+"      "+p4;
    };
    public String aswer(){
        return "";
    }
}
