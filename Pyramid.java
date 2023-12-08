/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab92;


    
public class Pyramid  extends Shape3D{
    
    public Pyramid(int depth,int height , int width){
        super(depth,height,width);
    }
    
    @Override
    public double getVolume (){
        return (super.getWidth()*super.height*super.depth)/3 ;
    }
    
    @Override
    public double getArea(){
        
        return super.getWidth()*super.depth;
    }
}
