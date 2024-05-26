package com.example.projectteorver;

import java.util.Random;
public class A15 extends Namber {
    Random rand = new Random();
    double[] X1 = {Math.PI/3, Math.PI/2}, X2 = {0.0, Math.PI/8, Math.PI/6};
    double x1, x2;
    A15(int seed) {
        super(seed);
        x1 = X1[rand.nextInt(X1.length)];
        x2 = X2[rand.nextInt(X2.length)];
    }
    public String get() {
        return
                ". Дана функция распределения F(x) непрерывной случайной величины X. Требуется: " +
                "1) найти плотность вероятности f(x); 2) найти M(X), D(X), σ(Х); 3) найти Р(α< X < β) " +
                        "для данных α, β. α = 0, β = PI";
    }
    public String aswer() {
        double mx, mx2, dx;
        mx = (x1 * Math.sin(3 * x1) + Math.cos(3 * x1) / 3) - (x2 * Math.sin(3 * x2) + Math.cos(3 * x2) / 3);
        mx2 = (x1 * x1 * Math.sin(3 * x1) + 2 * x1 * Math.cos(3 * x1) / 3 - 2 * Math.sin(3 * x1) / 9) -
                (x2 * x2 * Math.sin(3 * x2) + 2 * x2 * Math.cos(3 * x2) / 3 - 2 * Math.sin(3 * x2) / 9);
        dx = mx * mx - mx2;
        return String.format("M(X) = %.1f, D(X) = %.1f, σ(Х) = %.1f, P = 1", mx, dx, Math.sqrt(dx));
    }
}
