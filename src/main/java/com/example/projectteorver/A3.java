package com.example.projectteorver;

public class A3 extends Namber{
    A3(int seed) {
        super(seed);
    }
    String s;
    @Override
    public String get(){
        vsego = rand(1,7);
        if(rand(1,2)==1)s="первый";
        else s="второй";
        vero=(double) vsego/10;
        return ". Вероятность того, что наугад выбранный компьютер не будет работать, равна "+vero+". Оператор включил два\n" +
                "компьютера. Какова вероятность того, что:\n" +
                "а) хотя бы один из них будет работать;\n" +
                "б) оба компьютера будут исправны;\n" +
                "в) работать будет только "+s+" компьютер?";
    };
    public String aswer() {
        return ". "+"a) "+getOcruk((1-(1-vero)*(1-vero)),100)+"!)"+" b) "+ getOcruk(vero*vero,100)+" c) "+getOcruk(vero*(1-vero),100)+"\n";
    }
}
