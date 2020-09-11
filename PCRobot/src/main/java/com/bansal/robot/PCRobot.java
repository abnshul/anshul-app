package com.bansal.robot;

import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PCRobot {
    private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS z");
    private static Date d = new Date();
    private static int wheelTurnTime = 300; // in seconds

    public static void main(String argsp[]) throws AWTException, InterruptedException {
        Robot r = new Robot();
        mouseWheel();
    }

    public static void mouseWheel() throws AWTException {
        Robot robot = new Robot();
        System.out.println("User will need to manually kill this.");
        System.out.println("Started at "+sdf.format(d)+" , scrolling 1 unit every " + wheelTurnTime + " seconds");
        System.out.println("Running... ");
        while (true){
            robot.delay(wheelTurnTime * 100);
            robot.mouseWheel(1);
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
