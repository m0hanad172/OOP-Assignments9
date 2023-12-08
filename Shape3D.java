/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab92;

public abstract class Shape3D extends Shape2D {
    protected double depth ;
    
    public Shape3D(double depth , double height , double width ){
        super(height,width);
        this.depth=depth;
    }
    
    public Shape3D(double height,double radius){
        super(radius);
        depth=height;
    }
    
    public abstract double getVolume();

    @Override
    public String toString() {
        return "Shape3D{" +"radius="+super.radius +"depth=" + depth +"height= "+super.height+"width="+super.getWidth() +'}';
    }
} 