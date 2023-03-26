/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.p3_25_03_2023;
import java.util.Scanner;
/**
 *
 * @author Jairo Fernando
 */
public class Lista {
public nodo primero;

    public Lista(){
    primero=null;
    }


    private int leerEntero(){
    System.out.println("Ingrese valor, -1 para terminar");
    return Integer.parseInt(new Scanner(System.in).nextLine());    
    }

    public Lista crearLista(){
    int x=0;
    primero = null;
    do{
        x=leerEntero();
        if(x !=-1){
        primero= new nodo (x,primero);
        }
    }while (x !=-1);
    return this;
    }

    public Lista insertarCabeza(int entrada){
    nodo nuevo;
    nuevo= new nodo(entrada);
    nuevo.enlace = primero;
    primero = nuevo;
    return this;
    }

    public void visualizar(){
    nodo n;
    int k= 0;
    n=primero;
     while(n!=null){
     System.out.println(n.dato+" ");
     n=n.enlace;
     k++;
     System.out.println(k%15 !=0 ? "": "\n"  );
     }
    }

    public nodo buscarPosicion (int posicion){
    nodo indice;
    int i;
    if(posicion<0){
    return null;
    }

    indice = primero;
    for(i=1;(i<posicion)&&(indice!=null);i++){
    indice=indice.enlace;
    }
    return indice;
    }

    public Lista InsertaUltimo(nodo ultimo, int entrada){
    ultimo.enlace= new nodo(entrada);
    ultimo=ultimo.enlace;
    return this;
    }

    public nodo buscarLista(int destino){
    nodo indice;
    for (indice= primero; indice !=null; indice = indice.enlace){
    if(destino==indice.dato){
    return indice;
     }
    }
    return null;
   }

    public Lista insertarLista(int testigo, int entrada){//testigo= valor buscar al de la lista
    nodo nuevo, anterior;
    anterior=buscarLista(testigo);
    if(anterior != null){
        nuevo=new nodo(entrada);
        nuevo.enlace= anterior.enlace;
        anterior.enlace=nuevo;

      }
    return this;
    }       
}
