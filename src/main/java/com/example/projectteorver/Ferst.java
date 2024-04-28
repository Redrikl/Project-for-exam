package com.example.projectteorver;

public class Ferst extends Namber{

    Ferst(int seed) {
        super(seed);
    }
    public String get(){
        vsego = rand(4,30);
        chast = rand(2,vsego/2);;
        return ". На сортировочном пункте в ожидании подачи на\n"+
                " подъездной путь стоят " + vsego +" вагонов для разных направлений.\n"+
                " Найти вероятность того, что в нужном порядке стоят:\n"+
                "а) все вагоны;\n" +
                "б) первые "+ chast+" вагона.";
    };

    public String aswer() {
        return "a) 1/("+vsego+"!)"+" b) "+ chast+"!/"+vsego+"!/";
    }
}
