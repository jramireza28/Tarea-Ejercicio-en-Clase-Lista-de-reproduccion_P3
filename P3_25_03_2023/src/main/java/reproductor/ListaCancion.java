/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reproductor;
import com.mycompany.p3_25_03_2023.Lista;
import com.mycompany.p3_25_03_2023.nodo;
import java.util.Scanner;
/**
 *
 * @author Jairo Fernando
 */
public class ListaCancion {
 public nodo primero;

    private int leerEntero(){
    System.out.println("Ingrese valor, -1 para terminar");
    return Integer.parseInt(new Scanner(System.in).nextLine());    
    }

    public Lista CancionLista(){
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
}
