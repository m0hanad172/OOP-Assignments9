/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab92;

public class Cylinder  extends Shape3D {
    
    public Cylinder(double height,double radius){
        super(height,radius);
    }
    @Override
    public double getVolume(){
        return PI*super.radius*super.radius*super.height;
    }
    @Override
    public double getArea(){
        return 2*PI*super.radius*(super.radius+super.height);
    }
}
