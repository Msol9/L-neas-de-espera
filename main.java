//Lineas de espera
import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class Main{
    public static void main(String []args){
        Scanner lector=new Scanner(System.in);
        byte opcion=0;
        double μ, λ, p, Lq, Wq, W, c, a, p0, pEspera, L;
        do{
            System.out.println ("\nMENU DE LINEAS DE ESPERA");
            System.out.println("1. Modelo M/M/1");
            System.out.println("2. Modelo M/M/c");
            System.out.println("3. Modelo M/M/1/k")
            System.out.println("4. Salir");
            opcion=lector.nextByte();

            switch(opcion){
                case 1 ->{
                System.out.println("\nResolucion de politica con el modelo M/M/1");
                System.out.println("\nIngresa el numero promedio de llegadas (λ): ");
                λ=lector.nextDouble();
                System.out.println("Ingresa el numero promedio de servicio (μ): ");
                μ=lector.nextDouble();
                
                System.out.println("\nLos resultados de la politica son:");
                p= λ/μ;
                System.out.println("\nUtilizacion del sistema: " + p*100 + "% de utilizacion");
                Lq=Math.pow(λ, 2)/(μ*(μ-λ));
                System.out.println("Numero promedio de clientes en la cola: " + Lq + "clientes");
                Wq=Lq/λ;
                System.out.println("Tiempo promedio de espera en la cola: " + Wq + "horas o" + Wq*60 + "minutos");
                W=Wq+(1/μ);
                System.out.println("Tiempo total en el sistema: " + W + "horas o "+ W*60 + "minutos" );
                }
                case 2 ->{
                System.out.println("\n Resolucion de politica con el modelo m/m/c");
                System.out.println("\n Ingresa el numero promedio de llegadas (λ): ");
                λ=lector.nextDouble();
                System.out.println("Ingresa el numero promedio de servicio (μ): ");
                μ=lector.nextDouble();
                System.out.println("Ingresa el numero de servidores (c): ");
                c=lector.nextDouble();

                System.out.println("\nLos resultados de la politica son: ");
                
                }
                case 3->{

                }
                case 4->{
                    System.out.println("Saliendo");    
                }
                default->{
                    System.out.println("Opcion no valida. Intente de nuevo");
                }
            }
        }while (opcion!=4);
    }
}