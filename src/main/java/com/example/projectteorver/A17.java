package com.example.projectteorver;

public class A17 extends Namber{
    A17(int seed) {
        super(seed);
        vero=(double) rand(3,5)/100;
    }
    public String get(){
        return ". Исследуется район массовой гибели судов в войне\n" +
                "1939–1945 гг. Вероятность обнаружения затонувшего суд\n" +
                "на за время поиска t задается формулой: Р(t) = 1 – e^(–"+vero+"t).\n" +
                "Пусть случайная величина T — время, необходимое для\n" +
                "обнаружения очередного судна (в часах). Найти среднее\n" +
                "значение T.\n";
    }
    public String aswer(){
        return ". Среднее значение времени T="+getOcruk(1/vero,100);
    }
}
