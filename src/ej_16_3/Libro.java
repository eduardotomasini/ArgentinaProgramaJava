
package ej_16_3;

public class Libro {
    
    // Atributos
    String titulo;
    String autor;
    int anio;
    int cantPalabras;
    int cantPag;
    final int ANIO_ACTUAL =2023;
    final int  HOJAS = 250;
    

    public Libro() {
    }

    public Libro(String titulo, String autor, int anio, int cantPalabras, int cantPag) {
        this.titulo = titulo;
        this.autor = autor;
        this.anio = anio;
        this.cantPalabras = cantPalabras;
        this.cantPag = cantPag;
    }
    
    // getters y setters

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getCantPalabras() {
        return cantPalabras;
    }

    public void setCantPalabras(int cantPalabras) {
        this.cantPalabras = cantPalabras;
    }

    public int getCantPag() {
        return cantPag;
    }

    public void setCantPag(int cantPag) {
        this.cantPag = cantPag;
    }
    
    // Metodos
    
    public int calcularAntiguedad (int anio){
        int difAnio = ANIO_ACTUAL-anio;
        if (difAnio>50) {
            System.out.println("Es un libro Antiguo");   
        } else {
            System.out.println("el libro no es tan vejo");
        }
        
        return anio;
    }
    
    public int calcularPaginas (int cantPalabras){
        cantPag = cantPalabras/HOJAS;
        
        return cantPag;
    }
    
}

//Crear una clase "Libro" con atributos como título, autor, año de publicación y número
//de páginas. Luego, crea métodos para mostrar la información del libro, para verificar si
//el libro es antiguo (publicado hace más de 50 años) y para calcular el número de
//palabras totales en el libro (asumiendo que hay un promedio de 250 palabras por
//página), y usa objetos de esa clase para realizar cálculos