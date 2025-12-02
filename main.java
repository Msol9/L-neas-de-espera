//Lineas de espera
import java.util.Scanner;

public class Main{
    public static void main(String []args){
        Scanner lector=new Scanner(System.in);
        byte opcion=0;
        double μ, λ, p, Lq, Wq, W, c, a, termino1, termino2, sumatoria=0.0, p0, pEspera, L;
        do{
            System.out.println ("\nMENU DE LINEAS DE ESPERA");
            System.out.println("1. Modelo M/M/1");
            System.out.println("2. Modelo M/M/c");
            System.out.println("3. Modelo M/M/1/k");
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
                System.out.println("\n Ingresa el numero promedio de llegadas: ");
                λ=lector.nextDouble();
                System.out.println("Ingresa el numero promedio de servicio: ");
                μ=lector.nextDouble();
                System.out.println("Ingresa el numero de servidores: ");
                c=lector.nextDouble();

                System.out.println("\nLos resultados de la politica son: ");
                a=λ/μ;
                p=a/c;
                    for (int n = 0; n <= c-1; n++) {
                        sumatoria += Math.pow(a,n)/(factorial(n));
                }
                termino1=Math.pow(a, c)/factorial(c);
                termino2=1/(1-p);
                p0=1/(sumatoria+termino1*termino2);
                System.out.println("Probabilidad de que no haya nadie en el sistema: "+ p0);
                pEspera= (Math.pow(a, c)/(factorial(c)*(1-p)))*p0;
                System.out.println("Probabilidad de que un cliente tenga que esperar: " + pEspera);
                Lq=pEspera*p/ (1-p);
                System.out.println("Longitud promedio en cola: " + Lq);
                Wq= Lq/λ;
                System.out.println("Tiempo promedio de espera en la cola: " + Wq);
                W=Wq+(1/μ);
                System.out.println("Tiempo total en el sistema: " + W);
                L=λ*W;
                System.out.println("Numero promedio en el sistema: " + L);
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
    public static double factorial (double numero){
        if(numero == 0 || numero ==1){
            return 1;
        }else{
            return numero * factorial (numero - 1);
            
        }
    }
}