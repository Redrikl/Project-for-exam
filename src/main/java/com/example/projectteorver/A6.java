package com.example.projectteorver;

public class A6 extends Namber{
    double vero1;
    double vero2;
    double vero3;
    double vero4;
    A6(int seed) {
        super(seed);
        vsego = rand(4,7);
        vero1=(double) rand(4,8)/10;
        vero2=(double) rand(4,8)/10;
        vero3=(double) rand(4,8)/10;
        vero4=(double) rand(4,8)/10;
    }


    @Override
    public String get(){
        return ". В лаборатории три подопытных кролика. Для искус" +
                "ственного стимулирования иммунитета первому ввели" +
                " вакцину, второму — сыворотку, третьему — гамма-глобу" +
                "лин. После этого каждому кролику сделали инъекцию со" +
                "ответствующего болезнетворного вируса. Условия экспе" +
                "римента таковы, что вакцина защищает от заболевания с " +
                "вероятностью "+vero1+", сыворотка — "+vero2+" и гамма-глобулин —" +
                vero3+". Какова вероятность того, что наугад взятый из клет" +
                "ки кролик окажется здоровым?";
    };
    public String aswer() {
        return ". "+getOcruk(((vero1/3)+(vero2/3)+(vero3/3)),100)+"\n";
    }
}