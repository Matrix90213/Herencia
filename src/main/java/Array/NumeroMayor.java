package Array;
import java.util.Scanner;
public class NumeroMayor {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        Scanner sc=new Scanner(System.in);
        int mayor=0;
        int menor;

        System.out.println("Escribe 10 numeros enteros mayores que 0");
        //read zoo animal
        for (int i = 0; i < 10; i++) {
            System.out.println("Dame el numero "+(i+1));
            numeros[i] = sc.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            if (numeros[i]>mayor){
                mayor = numeros[i];
            }
        }
        menor=numeros[0];
        for (int i = 0; i < 10; i++) {
            if (numeros[i]<menor){
                menor = numeros[i];
            }
        }
        System.out.println("El numero mayor es "+mayor);
        System.out.println("El numero menor es "+menor);    }
}
