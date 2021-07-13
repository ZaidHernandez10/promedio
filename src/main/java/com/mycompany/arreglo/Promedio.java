package com.mycompany.arreglo;

import java.util.Scanner;

public class Promedio {
    
    public static void main (String[]args){
        Scanner s=new Scanner(System.in);
        int calificaciones[]=new int[5];
        int suma=0;
        float promedio=0;
        String nombre;
        String calificacion;
        
        System.out.println("Por favor ingresa tu nombre");
        nombre=s.nextLine();
        
        System.out.println("\n"+"Por favor ingresa tus calificaiones");
        
        System.out.println("Materia 1:");
        calificaciones[0]=s.nextInt();
        
        System.out.println("Materia 2:");
        calificaciones[1]=s.nextInt();
        
        System.out.println("Materia 3:");
        calificaciones[2]=s.nextInt();
        
        System.out.println("Materia 4:");
        calificaciones[3]=s.nextInt();
        
        System.out.println("Materia 5:");
        calificaciones[4]=s.nextInt();
        
        System.out.println("\n");
    
        for(int i=0; i<calificaciones.length; i++){
            suma= suma + calificaciones[i];
            
        promedio= suma / calificaciones.length;
        
            
        }  
        
        System.out.println("Alumno:"+nombre+"\n");
        System.out.println("Calificacion 1:"+calificaciones[0]);
        System.out.println("Calificacion 2:"+calificaciones[1]);
        System.out.println("Calificacion 3:"+calificaciones[2]);
        System.out.println("Calificacion 4:"+calificaciones[3]);
        System.out.println("Calificacion 5:"+calificaciones[4]+"\n");
        System.out.println("Tu promedio es:"+promedio+"\n");
        
    
        if (promedio <= 50)
            System.out.println("Calificacion: F");
        
        if (promedio >=51 && promedio <=60)
            System.out.println("Calificacion: E"); 
        
        if (promedio >=61 && promedio <=70)
            System.out.println("Calificacion: D"); 
        
        if (promedio >=71 && promedio <=80)
            System.out.println("Calificacion: C");
        
        if (promedio >=81 && promedio <=90)
            System.out.println("Calificacion: B");
        
        if (promedio >=91 && promedio <=100)
            System.out.println("Calificacion: A");
        
        if (promedio >=100)
            System.out.println("Felicidades "+nombre+", obtuviste una calificacion perfecta.");
    }
        
}    




    

