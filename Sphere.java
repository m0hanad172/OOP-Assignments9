/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab92;

public class Sphere  extends Shape3D{
    
    public Sphere(int depth,double radius){
        super(depth,radius);
    }
    
    @Override
    public double getVolume (){
        return 4/3 *PI*super.radius*super.radius*super.radius;
    }
    
    @Override
    public double getArea(){
        return 4*PI*super.radius*super.radius;
    }
}
