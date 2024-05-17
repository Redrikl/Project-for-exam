package com.example.projectteorver;
import java.lang.Math;
public class A9 extends Namber{
    double vero;
    int chast1;
    int n;
    double a;
    double b=0.1;
    double c=1;
    A9(int seed) {
        super(seed);
        vero=(double) rand(1,4)/10;
        vsego = rand(20,40);
        chast = rand(20,vsego-5);
        chast1 = rand(2,4)*10;

        for(int i=chast;i<=vsego;i++){
            a+=Math.pow(vero,i)+Math.pow(1-vero,100-i);;
        }
        b/=(vero*(1-vero));
    }
    public String get(){
        return ". Вероятность выхода из строя конденсатора за время\n" +
                "Т равна "+vero+". Определить вероятность того, что за время Т\n" +
                "из 100 конденсаторов, работающих независимо, выйдут из\n" +
                "строя:\n" +
                "а) от "+chast+" до "+vsego+" конденсаторов;\n" +
                "б) ровно "+chast1+" конденсаторов.";
    };
    public String aswer() {
        return "a) "+a+"b) "+b+"\n";
    }
}
