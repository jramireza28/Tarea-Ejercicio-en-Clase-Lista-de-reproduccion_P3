/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.p3_25_03_2023;

/**
 *
 * @author Jairo Fernando
 */
public class nodo {
    
int dato;

    nodo enlace;

    public nodo (int x){
    dato = x;
    enlace=null;
    }

    public nodo(int x, nodo n){
    dato=x;
    enlace=n;
    }

    public int GetDato(){
    return dato;
    }

    public nodo GetEnlace(){
    return enlace;
    }

    public void setEnlace (nodo n){
    this.enlace =n;
    }

    public void setDato(int x){
    this.dato = x;
    }
}//fin/////////
