/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab92;

public abstract  class Shape2D {
    
    final double PI = 3.14d;
    protected double height ;
    protected double radius ;
    private double width ;
    
    public Shape2D(double radius ){
        this.radius= radius;
    }
    
    public Shape2D(double height , double width ){
        this.height= height ;
        this.width=width ;
        
    }
    
    public abstract double getArea();

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    
    

    @Override
    public String toString() {
        return "Shape2D{" + "PI=" + PI + ", height=" + height + ", radius=" + radius + ", width=" + width + '}';
    }
    
}

