package com.kp.operationquestion;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);
        double x = in.nextDouble();
        System.out.println(x>=3 && x<=8 ? "True" : "False");

    }
}
