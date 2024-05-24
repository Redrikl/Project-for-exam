package com.example.projectteorver;

public class A4 extends Namber{
    double vero1;
    double vero2;
    double vero3;
    double vero4;
    public A4(int seed) {
        super(seed);
        vsego = rand(4,7);
        vero1=(double) rand(4,8)/10;
        vero2=(double) rand(4,8)/10;
        vero3=(double) rand(4,8)/10;
        vero4=(double) rand(4,8)/10;
    }


    @Override
    public String get(){
        return ". Для студента Петрова вероятность сдать на «отлично» экзамен по высшей математике равна "+vero1+", а по физике — "+vero2+". Для студента Васильева эти вероятности равны\n" +
                vero3+" и "+vero4+" соответственно. Какова вероятность, что после\n" +
                "сдачи двух экзаменов количество отличных оценок у этих\n" +
                "студентов будет одинаковым?";
    };
    public String aswer() {
        return ". "+(vero1*vero2*vero3*vero4+(1-vero1)*(1-vero2)*(1-vero3)*(1-vero4)+(vero1*(1-vero2)+vero2*(1-vero1))*(vero3*(1-vero4)+vero4*(1-vero3)))+"\n";
    }
}
