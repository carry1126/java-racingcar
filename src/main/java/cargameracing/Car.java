package cargameracing;

import java.util.Random;

/**
 * Car Object
 * @author minji
 */
public class Car {
    Random random = new Random();
    private int junjin;

    public void junjinUp(int random) {
        int num = random;
        if (num >= 4) {
            ++junjin;
        }
    }

    public int getJunjin() {
        return junjin;
    }
}
