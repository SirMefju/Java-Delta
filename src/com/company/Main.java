package com.company;

import java.util.Scanner;
import static java.lang.Math.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("gimme 'a'");
        double a = in.nextDouble();
        System.out.println("gimme 'b'");
        double b = in.nextDouble();
        System.out.println("gimme 'c'");
        double c = in.nextDouble();
        double delta = b*b-4*a*c;
        System.out.println("Delta = "+delta);
        double elementDelta = pow(delta,0.5);
        System.out.println("Element of Delta = "+elementDelta);
        if (delta>0)
        {
            double xi = ((-b-elementDelta)/2*a);
            double xii = ((-b+elementDelta)/2*a);
            System.out.println("Solution I = "+xi);
            System.out.println("Solution II = "+xii);
        }
        else if (delta == 0)
        {
            double xo = -b/(2*a);
            System.out.println("Because Delta = 0, u have only one solution = "+xo);
        }
        else
            System.out.println("You don't have real solutions.");
    }
}