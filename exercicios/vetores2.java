
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Main{
    public static void main(String[] args){

        int[] numeros = new int[10];

        Random gerador = new Random();


        for (int i = 0;i <10; i++){
            numeros[i] = gerador.nextInt(100);
            
        }

        // ordenando array

        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = 0; j < numeros.length - 1 - i; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    int temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                }
            }
        }

        for(int i = 0;i <10;i++){
            System.out.println(numeros[i]);
        }

    }


}

