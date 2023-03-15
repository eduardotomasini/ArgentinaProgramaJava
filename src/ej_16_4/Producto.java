
package ej_16_4;

public class Producto {
    
    String nombre;
    String descripcion;
    float precio;

    public Producto() {
    }

    public Producto(String nombre, String descripcion, float precio) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
    
    
    void calcularDescuento (){
        if (precio>1000) {
            System.out.println("obtuvo un descuento del 10% "
                    + "nuevo precio= " + precio*0.9);
        }
        
        precio = (float) (precio*0.9);
    
    }
    
    void verificarCosto (){
        if (precio>100) {
            System.out.println("el producto es caro");
        }
    }
    
    void mostrarInfo() {
        System.out.println("info del producto"
                + "\nnombre: " + nombre
                + "\nprecio: " + precio
                + "\ndescripcion: " + descripcion);
    }

}

//Crear una clase "Producto" con atributos como nombre, descripción y precio. Luego,
//crea métodos para calcular el precio con descuento (por ejemplo, con un descuento
//del 10%), para verificar si el producto es caro (con un precio mayor a $100), y para
//mostrar la información del producto, y usa objetos de esa clase para realizar cálculos.