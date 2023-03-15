/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase16;

import java.util.Scanner;

/**
 *
 * @author eduar
 */
public class Triangulo {
    Scanner leer = new Scanner(System.in);
    
    // Atributos
    
    double ladoA;
    double ladoB;
    double ladoC;
    double s;
    double perimetro;
    double area;


    // Constructorores

    public Triangulo() {
    }

    public Triangulo(double ladoA, double ladoB, double ladoC, double s, double perimetro, double area) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
        this.s = s;
        this.perimetro = perimetro;
        this.area = area;
    }
    
    // Getters y Setters

    public double getLadoA() {
        return ladoA;
    }

    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }

    public double getLadoB() {
        return ladoB;
    }

    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }

    public double getLadoC() {
        return ladoC;
    }

    public void setLadoC(double ladoC) {
        this.ladoC = ladoC;
    }

    public double getS() {
        return s;
    }

    public void setS(double s) {
        this.s = s;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    
    // Metodos
    
    public void calcularPerimetro (){
        System.out.println("ingrese los tres lados");
        ladoA = leer.nextDouble();
        ladoB = leer.nextDouble();
        ladoC = leer.nextDouble();
        
        perimetro = ladoA+ladoB+ladoC;
        
        System.out.println("el Perimetro del Triangulo es: "
                + "" + perimetro);
    }
    
    
    public void calcularArea(){
        
        System.out.println("ingrese los lados del triangulo para "
                + "calcular el Area.");
   
        ladoA = leer.nextDouble();
        ladoB = leer.nextDouble();
        ladoC = leer.nextDouble();

        s = (ladoA + ladoB +ladoC)/2;
        
        area =(s*(s-ladoA)*(s-ladoB)*(s-ladoC));
        
        double a = (double) (Math.sqrt(area));
        System.out.println("el area de un triangulo es: " + a);
        
        
    }
    
}


//Crear una clase "Triángulo" con atributos como la longitud de cada lado. Luego crear
//un método para calcular el perímetro y otro para calcular el área del triángulo, y usa
//objetos de esa clase para realizar cálculos