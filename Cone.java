/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab92;

class Cone extends Shape3D {
    
    public Cone(double height , double radius ){
        super(height , radius);
    }
    
    @Override
    public double getVolume(){
        
        return (PI*super.radius*super.radius*super.depth)/3;
    }
    
    @Override
    public double getArea (){
        
        return PI * super.radius*super.depth;
    }
}
    

