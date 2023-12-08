/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab92;

public class Square extends Shape2D {
    
    public Square(double width){
        super(0, width );
    }
    
    @Override
    public double getArea(){
        return super.getWidth()*super.getWidth();
    }
}

