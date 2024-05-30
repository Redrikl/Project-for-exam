package com.example.projectteorver;

public class B3 extends Namber {

    double a, b;
    
    B3(int seed) {
        super(seed);
        a = (double) rand(3,8) / 10;
        b = (double) rand(3, 7) / 10;
    }

    public String get() {
        return "Два скрипача участвуют в конкурсе им. Паганини.\n" +
                "Вероятность стать лауреатом конкурса для первого музы&\n" +
                "канта равна " + a + ", для второго — " + b + ". Какова вероятность\n" +
                "того, что:\n" +
                "а) хотя бы один из них станет лауреатом;\n" +
                "б) станет лауреатом только первый скрипач;\n" +
                "в) лауреатами станут оба скрипача?";
    }

    public String aswer() {
        
        return ". а)б)в)";
    }
}
