package com.BinhAn;

import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.PathIterator;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

public class Main {

    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);


        shape = new Shape("red", false);
        System.out.println(shape);

    }
}
