package org.WalkerCC_CompSci;

public class Main {

    public static void main(String[] args) {

        //Create a point
        Point a = new Point(3,5);
        //Create another point
        Point b = new Point(-2, 7);

        double x_coordinate = a.getX();
        double y_coordinate = a.getY();

        b.FlipVertical();

        System.out.println("Point b's new x-coordinate is " + b.getX());
        System.out.println("Point b's new y-coordinate is " + b.getY());

        b.FlipHoritzontal();

        System.out.println("Point b's new x-coordinate is " + b.getX());
        System.out.println("Point b's new y-coordinate is " + b.getY());



    }
}
