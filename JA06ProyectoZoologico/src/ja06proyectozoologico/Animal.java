/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ja06proyectozoologico;

/**
 *
 * @author Bienvenidos
 */
public class Animal {
    String nombre=null;
    String paisOrigen=null;
    double peso;
    int edad;
    String nombreCientifico= null;
    
    
    Animal(String nombre, String paisOrigen, double peso, int edad, String nombreCientifico){
        this.nombre=  nombre;
        this.paisOrigen= paisOrigen;
        this.peso= peso;
        this.edad= edad;
        this.nombreCientifico= nombreCientifico;
    }
    
    void imprimeAnimal(){
        System.out.println("-------Animal-------");
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Pais de origen: "+this.paisOrigen);
        System.out.println("Peso: "+this.peso);
        System.out.println("Edad: "+this.edad);
        System.out.println("Nombre cientifico: "+this.nombreCientifico);
        System.out.println("--------------------");
    }

    public String getNombre() {
        return nombre;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public double getPeso() {
        return peso;
    }
    public int getEdad() {
        return edad;
    }
    
    public String getNombreCientifico(){
        return nombreCientifico;
    }
    
    
}
