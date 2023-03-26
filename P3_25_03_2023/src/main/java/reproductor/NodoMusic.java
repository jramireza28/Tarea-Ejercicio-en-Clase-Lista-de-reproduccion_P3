/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reproductor;
import com.mycompany.p3_25_03_2023.nodo;
import reproductor.Cancion;

/**
 *
 * @author Jairo Fernando
 */
public class NodoMusic {
Cancion dato;

    NodoMusic enlace;

    public NodoMusic (Cancion x){
    dato = x;
    enlace=null;
    }

    public NodoMusic(Cancion x, NodoMusic n){
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
}
