package com.example.projectteorver;

import java.util.*;

public class A14 extends Namber{
    int[] x = new int[3];
    int[] y = new int[2];
    double[] px = new double[3];
    double[] py = new double[2];
    A14(int seed) {
        super(seed);
        x[0] = rand(-3,-1);
        x[1] = rand(1,3);
        x[2] = rand(4,6);
        y[0] = rand(1,3);
        y[1] = rand(4,7);
        px[0] = (double) rand(1,4)/10;
        px[1] = (double) rand(1,3)/10;
        px[2] = 1 - px[0] - px[1];
        py[0] = (double) rand(1,8)/10;
        py[1] = 1 - py[0];
    }

    public int[] getX() {
        return x;
    }

    public int[] getY() {
        return y;
    }

    public double[] getPX() {
        return px;
    }

    public double[] getPY() {
        return py;
    }

    public String get(){
        return ". Независимые случайные величины X  и  Y заданы таблицами распределений. " +
                "Найти: 1) M(X), M(Y), D(X), D(Y); 2) таблицы распределения случайных величин " +
                "Z1 = 2X + Y , Z2 = X Y; 3) M(Z1), M(Z2), D(Z1), D(Z2) непосредственно по таблицам распределений " +
                "и на основании свойств математического ожидания и дисперсии.";
    }
    public String aswer() {
        double mx = 0.0, my = 0.0, mx2 = 0.0, my2 = 0.0, dx = 0.0, dy = 0.0;
        for (int i = 0; i < 3; i++)
            mx += (double) x[i]*px[i];
        for (int i = 0; i < 2; i++)
            my += (double) y[i]*py[i];
        for (int i = 0; i < 3; i++)
            mx2 += (double) x[i]*x[i]*px[i];
        for (int i = 0; i < 2; i++)
            my2 += (double) y[i]*y[i]*py[i];
        dx = mx2 - mx*mx;
        dy = my2 - my*my;


//        Если нужны таблицы
//        Map<Integer, Double> z1 = new HashMap<>();
//        for (int i = 0; i < 3; i++)
//            for (int j = 0; j < 2; j++) {
//                int tmpZ = 2 * x[i] + y[j];
//                double tmpP = px[i] * py[j];
//                if ( !z1.containsKey(tmpZ) )
//                    z1.put(tmpZ, tmpP);
//                else
//                    z1.put(tmpZ, tmpP + z1.get(tmpZ));
//            }
//
        Map<Integer, Double> z2 = new HashMap<>();
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 2; j++) {
                int tmpZ = x[i] * y[j];
                double tmpP = px[i] * py[j];
                if ( !z2.containsKey(tmpZ) )
                    z2.put(tmpZ, tmpP);
                else
                    z2.put(tmpZ, tmpP + z2.get(tmpZ));
            }


        double mz1 = 0.0, mz2 = 0.0, mz22 = 0.0, dz1 = 0.0, dz2 = 0.0;
        mz1 = 2 * mx + my;
        mz2 = mx * my;
        dz1 = 4 * dx + dy;
        for (Integer key : z2.keySet())
            mz22 += key * key * z2.get(key);
        dz2 = mz22 - mz2 * mz2;
        return String.format(
                ". M(X) = %.1f, M(Y) = %.1f, D(X) = %.1f, D(Y) = %.1f" +
                "M(Z1) = %.1f, M(Z2) = %.1f, D(Z1) = %.1f, D(Z2) = %.1f", mx, my, dx, dy, mz1, mz2, dz1, dz2
        );
    }
}
