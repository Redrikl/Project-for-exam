package com.example.projectteorver;

public class Three extends Namber{
    Three(int seed) {
        super(seed);
    }
    String s;
    @Override
    public String get(){
        vsego = rand(1,7);
        if(rand(1,2)==1)s="первый";
        else s="второй";
        return ". Вероятность того, что наугад выбранный компью-\n" +
                "тер не будет работать, равна 0,"+vsego+". Оператор включил два\n" +
                "компьютера. Какова вероятность того, что:\n" +
                "а) хотя бы один из них будет работать;\n" +
                "б) оба компьютера будут исправны;\n" +
                "в) работать будет только "+s+" компьютер?";
    };
    public String aswer() {
        return "a) 1/("+vsego+"!)"+" b) "+ chast+"!/"+vsego+"!/";
    }
}
