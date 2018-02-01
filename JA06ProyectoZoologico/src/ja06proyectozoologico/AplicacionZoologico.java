/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ja06proyectozoologico;

import java.util.Scanner;


public class AplicacionZoologico {

    static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        Animal a1=null;
        String nom;
        String po;
        double peso;
        int edad;
        int pos;
        Zoologico zoologico = new Zoologico();
        
        
        int elec;
        do {
            verMenu();
            elec = teclado.nextInt();
            
            switch (elec) {
                case 1:
                    System.out.println("Digame las siguientes caracteristicas del animal:");
                    System.out.print("1- Nombre: ");
                    nom=teclado.next();
                    System.out.print("2- Pais de origen: ");
                    po=teclado.next();
                    System.out.print("3- Peso del animal (en Kg): ");
                    peso=teclado.nextDouble();
                    System.out.print("4- Edad del animal: ");
                    edad=teclado.nextInt();
                    a1=new Animal(nom, po, peso, edad);
                    zoologico.añadirAnimal(a1);
                    break;
                case 2:
                    System.out.println("De que pais desea buscar el animal?");
                    po=teclado.next();
                    if(zoologico.existeAnimaldelPais(po)){
                        System.out.println("El animal se encuentra en el zoologico.");
                    }else{
                        System.out.println("El animal no se encuentra en el zoologico.");
                    }
                    break;
                case 3:
                    System.out.println(zoologico.edadPromedio()+" es la edad promedio del zoologico.");
                    break;
                case 4:
                    System.out.println("Dime el pais de los animales que quieres eliminar");
                    po=teclado.next();
                    zoologico.eliminaAnimalesDe(po);
                    break;
                case 5:
                    System.out.println("Dime la cantidad de Kg que desea comparar");
                    peso=teclado.nextDouble();
                    System.out.println(zoologico.cuantosPesanMas(peso)+"animales pesan mas o igual que "+peso+" Kg");
                    break;
                case 6:
                    System.out.println("Que animal desea buscar?");
                    nom=teclado.next();
                    if(zoologico.siEsta(nom)){
                        System.out.println("El animal se encuentra dentro del zoologico");
                    }else{
                        System.out.println("El animal no se encuentra en el zoologico");
                    }
                    break;
                case 7:
                    System.out.println("La edad del primer animal ingresado en el zoologico es de: "+zoologico.edadDelPrimero()+" años.");
                    break;
                case 8:
                    System.out.println("El peso del ultimo animal ingresado en el zoologico es de: "+zoologico.pesoDelUltimo()+" Kg.");
                    break;
                case 9:
                    System.out.println("Escriba las nuevas caracteristicas del animal:");
                    System.out.print("1- Nombre: ");
                    nom=teclado.next();
                    System.out.print("2- Pais de origen: ");
                    po=teclado.next();
                    System.out.print("3- Peso del animal (en Kg): ");
                    peso=teclado.nextDouble();
                    System.out.print("4- Edad del animal: ");
                    edad=teclado.nextInt();
                    System.out.println("Escriba la posicion donde desea remplazar el animal");
                    pos=teclado.nextInt();
                    a1=new Animal(nom, po, peso, edad);
                    zoologico.remplazoAnimal(a1, pos);
                    break;
                case 10:
                    System.out.println("En que posicion esta el animal desea eliminar?");
                    pos=teclado.nextInt();
                    zoologico.eliminaAnimal(pos);
                    break;
                case 11:
                    System.out.println("Escriba las caracteristicas del animal:");
                    System.out.print("1- Nombre: ");
                    nom=teclado.next();
                    System.out.print("2- Pais de origen: ");
                    po=teclado.next();
                    System.out.print("3- Peso del animal (en Kg): ");
                    peso=teclado.nextDouble();
                    System.out.print("4- Edad del animal: ");
                    edad=teclado.nextInt();
                    System.out.println("En que posicion desea colocar el animal?");
                    pos=teclado.nextInt();
                    a1=new Animal(nom, po, peso, edad);
                    zoologico.insertaAnimal(a1, pos);
                    break;
                case 12:
                    zoologico.clausuraZoologico();
                    break;
                case 13:
                    if(zoologico.zoologicoClausurado()){
                        System.out.println("El zoologico esta clausurado.");
                    }else{
                        System.out.println("El zoologico no esta clausurado.");
                    }
                    break;
                case 14:
                    zoologico.verZoologico();
                    break;
                default:
                    if (elec == 0) {
                        System.out.println("Gracias por usar la aplicacion");
                    } else {
                        System.out.println("Por favor, elija una opcion de las mostradas en el menu");
                    }
                    break;
            }
        } while (elec != 0);


    }
    public static void verMenu() {
        System.out.println("***************MENU PRINCIPAL********************");
        System.out.println("1. Añadir animal.");
        System.out.println("2. Exixte animal del pais 'X'.");
        System.out.println("3. Edad promedio de los animales del zoologico.");
        System.out.println("4. Eliminar animales del pais 'X'.");
        System.out.println("5. Cuantos animales son mas pesados.");
        System.out.println("6. El animal se encuentra en el zoologico?");
        System.out.println("7. Cual es la edad del primer animal que entro al zoologico?");
        System.out.println("8. Cual es el peso del ultimo animal que entro al zoologico?");
        System.out.println("9. Reemplazar animal en una posicion.");
        System.out.println("10. Eliminar animal del zoologico.");
        System.out.println("11. Insertar animal en una posicion especifica.");
        System.out.println("12. Clausurar el zoologico.");
        System.out.println("13. El zoologico esta clausurado?");
        System.out.println("14. Obsevar zoologico.");
        System.out.println("0. Salir.");
        System.out.println("*************************************************");
    }
    
    
}
