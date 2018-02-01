/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ja06proyectozoologico;

import java.util.ArrayList;

/**
 *
 * @author Bienvenidos
 */
public class Zoologico {

    ArrayList<Animal> listaAnimal;

    Zoologico() {
        this.listaAnimal = new ArrayList<Animal>();
    }

    public void añadirAnimal(Animal a) {
        listaAnimal.add(a);
    }

    public boolean existeAnimaldelPais(String p) {
        for(int i=0; i<listaAnimal.size(); i++){
            if(listaAnimal.get(i).paisOrigen.equals(p)){
                return true;
            }
        }
        return false;
    }

    public double edadPromedio() {
        double promedio = 0;
        for (int i = 0; i < listaAnimal.size(); i++) {
            promedio += (double)listaAnimal.get(i).edad;

        }
        promedio/=listaAnimal.size();

        return promedio;

    }

    public void eliminaAnimalesDe(String p) {
        for (int i = 0; i < listaAnimal.size(); i++) {
            if (listaAnimal.get(i).paisOrigen.equals(p)) {
                listaAnimal.remove(i);
                i--;
            }
        }
    }

    public int cuantosPesanMas(double p) {
        int cont = 0;
        for (int i = 0; i < listaAnimal.size(); i++) {
            if (listaAnimal.get(i).peso >= p) {
                cont++;
            }
        }

        return cont;
    }

    public boolean siEsta(String a) {
        for(int i =0; i<listaAnimal.size(); i++){
            if(listaAnimal.get(i).nombre.equals(a)){
                return true;
            }
        }
        return false;
    }

    public int edadDelPrimero() {

        return listaAnimal.get(0).edad;
    }

    public double pesoDelUltimo() {
        double peso = 0;

        peso = listaAnimal.get(listaAnimal.size() - 1).getPeso();

        return peso;
    }

    public void remplazoAnimal(Animal a, int pos) {
        for (int i = 0; i < listaAnimal.size(); i++) {
            if (pos == (i+1)) {
                listaAnimal.remove(i+1);
                listaAnimal.add(i, a);
            }
            }
        }
    
    public void eliminaAnimal(int pos){
        for (int i=0; i<listaAnimal.size(); i++){
            if(pos == (i+1)){
                listaAnimal.remove(i);
            }
        }
    }
    
    public void insertaAnimal(Animal a, int pos){
        for(int i=0; i<listaAnimal.size(); i++){
            if(pos == (i+1)){
                listaAnimal.add(i, a);
            }
        }
    }
    
    public void clausuraZoologico(){
        listaAnimal.clear();
    }
    
    public boolean zoologicoClausurado(){
        if(listaAnimal.isEmpty()){
            return true;
        }
        return false;
    }
    
    public void verZoologico(){
        for (int i=0; i<listaAnimal.size(); i++){
            listaAnimal.get(i).imprimeAnimal();
        }
    }

    }
