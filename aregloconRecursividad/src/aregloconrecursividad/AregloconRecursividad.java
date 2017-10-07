/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aregloconrecursividad;

/**
 *
 * @author GATEWAY
 */
public class AregloconRecursividad {
public static int n = 0, p = 1, a = 0; 
public static int[][] areglo = new int[4][9]; 

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
             /// int mayorAmenor,aa;
        //int areglo
       a
        (areglo, n, a); 
    ko(); 
}

public static void a(int matriz
 [][], int e, int r){
    
    if(r > areglo.length -1){
        e++;
        r=0;
        p++;
    }
    if(e <areglo.length){ 

        if
                (e==(p-1) && r>= (p-1)){ 
            if
                    (e==0)
                areglo[e][r] = matriz[e][r]=p;
            else
                areglo[e][r] = matriz[e][e-1]*2;
            a(areglo, e, r+1);
        }
        else{ 
            if(r==0)
                areglo[e][r] = r+1;
            else
                areglo[e][r] = areglo[e-1][r];
            a(areglo, e, r+1);
        
        }
    }
}
public static void ko(){ 

    for(
      int e=0; e< areglo.length; e++){
        for
        (int r=0; r< areglo.length; r++){
            System.out.print(areglo[e][r] + " ");
   // TODO code application logic here
    }
    
}
