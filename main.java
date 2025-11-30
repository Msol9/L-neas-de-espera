//Lineas de espera
import java.util.Scanner;

public class Main{
    public static void main(String []args){
        Scanner lector=new Scanner(System.in);
        byte opcion=0;

        do{
            System.out.println ("\nMENU DE LINEAS DE ESPERA");
            System.out.println("1. Modelo m/m/1");
            System.out.println("2. Modelo m/m/s");
            System.out.println("3. Salir");
            opcion=lector.nextByte();

            switch(opcion){
                case 1 ->{

                }
                case 2 ->{

                }
                case 3->{
                    System.out.println("Saliendo");
                }
                default->{
                    System.out.println("Opcion no valida. Intente de nuevo");
                }
            }
        }while (opcion!=3);
    }
}