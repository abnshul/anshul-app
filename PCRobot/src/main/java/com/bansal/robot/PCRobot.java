package com.bansal.robot;

import java.awt.*;

public class PCRobot {
    public static void main(String argsp[]) throws AWTException, InterruptedException {
        Robot r = new Robot();
        int rad = 350, i = 700, j = 400;
        int t = 0;
        int max = 50;//00000;//*1000000000;
        while(t<max) {
            for (int x = 0; x <= rad + i; x++) {
                for (int y = 0; y <= rad + j; y++) {

                    if (meetsCircle(x, y, i, j, rad)) {
                        Thread.sleep(10);
                        r.mouseMove(x, y);
                    }
                }
            }
            t++;
        }


    }

    public static boolean meetsCircle(int x, int y,int i, int j, int r){
        int a = (x - i)*(x - i) + (y - j)*(y - j);
        int rad = r*r;
        //System.out.println(x+" | "+y+" | "+a+" | "+rad);
        if(a == rad) {
            System.out.println(x+" | "+y);
            return true;
        }
        return false;
    }
}
