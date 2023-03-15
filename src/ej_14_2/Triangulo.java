package ej_14_2;

import java.util.Scanner;

public class Triangulo {

    Scanner leer = new Scanner(System.in);
    double l1;
    double l2;
    double l3;

    public Triangulo() {
    }

    public Triangulo(double l1, double l2, double l3) {
        this.l1 = l1;
        this.l2 = l2;
        this.l3 = l3;
    }

    public double getL1() {
        return l1;
    }

    public void setL1(double l1) {
        this.l1 = l1;
    }

    public double getL2() {
        return l2;
    }

    public void setL2(double l2) {
        this.l2 = l2;
    }

    public double getL3() {
        return l3;
    }

    public void setL3(double l3) {
        this.l3 = l3;
    }

    // metodos
    void determinarTriangulo() {
        
        do {
            System.out.println("determine los lados del triangulo");
            l1 = leer.nextDouble();
            l2 = leer.nextDouble();
            l3 = leer.nextDouble();
            
            if (l1>0 && l2>0 && l3>0) {
                if (l1 == l2 && l2 == l3) {
                System.out.println("Equilatero");
            } else if (l1 == l2 || l2 == l3) {
                System.out.println("isocelos");
            } else if (l1 != l2 && l2 != l3) {
                System.out.println("escaleno");
            }
            }
            
        } while (l1 != 0 && l2 != 0 && l3 != 0);

    }
}

// Dado un conjunto de triángulos representados por sus lados L1, L2 y L3
// que finaliza con un triángulo con un lado nulo, determinar e imprimir 
// la cantidad de triángulos equiláteros, isósceles y escalenos
