package com.example.projectteorver;

public class B17 extends Namber {
    B17(int seed) { super(seed); }
    public String get() {
        return "Вероятность выхода из строя трансформатора за вре;\n" +
                "мя эксплуатации t задается формулой: Р(t)=1– e–0,002t\n" +
                ".\n" +
                "Случайная величина T — время безотказной работы транс;\n" +
                "форматора. Найти математическое ожидание и дисперсию\n" +
                "T, если величина T измеряется в часах.";
    }
    public String aswer() {
        return "";
    }
}
