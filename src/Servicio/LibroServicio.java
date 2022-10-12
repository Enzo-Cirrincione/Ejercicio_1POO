/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Libro;
import java.util.Scanner;

/**
 *
 * @author LAURA
 */
public class LibroServicio {

    public Libro infoLibro() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        Libro ll = new Libro();
        System.out.println("Ingrese el ISBN del libro :");
        ll.setIsbn(leer.nextInt());
        System.out.println("Ingrese el autor de libro:");
        ll.setAutor(leer.next());
        System.out.println("Ingrese el titulo :");
        ll.setTitulo(leer.next());
        System.out.println("Ingrese el  número de páginas del libro :");
        ll.setNumPaginas(leer.nextInt());
        return ll;
    }
    
    public void datosLibro(Libro ll){
        System.out.println("El ISBN del libre es :" + ll.getIsbn());
        System.out.println("El autor del libro es "+ ll.getAutor());
        System.out.println("El título del libro es :"+ ll.getTitulo());
        System.out.println("El libro tiene un total de : "+ ll.getNumPaginas()+" páginas");
        
    }
}
