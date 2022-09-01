package company;

import java.util.Scanner;
import java.io.IOException;
public class TEC1 {
    public static void main (String[] args){

        int num;
        Scanner leer = new Scanner(System.in);
        System.out.println("Teclear numero ");
        num = leer.nextInt();
        String palabra;
        Scanner read = new Scanner(System.in);
        System.out.println("Teclear palabra: ");
        palabra = read.next();
        System.out.println("El numero es: " + num);
        System.out.println("La palabra es: " + palabra);

       try{
           int longitud;
           longitud = palabra.length();
        if (num <= longitud){
            System.out.println("El caracter en la posicion " + num + " es " + palabra.charAt(num));

        }else{
        throw new Exception("La palabra " + palabra + " No tiene caracteres en la posicion " + num);

        }
       }catch (Exception e){
           System.out.println(e.toString());

       }

    }
}


