/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab92;

/**
 *
 * @author USER
 */
public class Lab92 {

    public static void main(String[] args) {
        
        Shape2D s1 = new Circle(2);
        Shape2D s2= new Square(3);
        Shape2D s3= new Rectangle(1, 2);
        
        Shape2D shape[]=new Shape2D[]{s1,s2,s3};
        
        for(Shape2D e:shape){
            System.out.println("Area shape2D ="+e.getArea());
        }
        
        Shape3D s4 = new Cylinder(2,3);
        Shape3D s5= new Sphere(3,4.5);
        Shape3D s6= new Pyramid(1, 2,3);
        Shape3D s7= new Cone(1.5, 2.6);
        
        Shape3D shape2[]=new Shape3D[]{s4,s5,s6,s7};
        
        for(Shape3D e:shape2){
            System.out.println("Area shape3D="+e.getArea()+" "+"volume Shape3D ="+e.getVolume());
        }
    }
}
