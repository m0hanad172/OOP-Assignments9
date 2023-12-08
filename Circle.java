/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab92;

class Circle extends Shape2D{
    
    public Circle(double radius){
        super(radius);
    }
    
    @Override
    public double getArea(){
        return PI*super.radius*super.radius;
    }
    
}