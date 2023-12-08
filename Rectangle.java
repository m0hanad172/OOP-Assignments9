/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab92;

public class Rectangle extends Shape2D {
    
    public Rectangle(double height , double width){
        super(height,width);
    }
    
    @Override
    public double getArea(){
        return super.height*super.getWidth();
    } 
}
