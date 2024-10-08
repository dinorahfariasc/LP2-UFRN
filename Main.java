//exercicios

// import java.util.Scanner;

// public class Main {
//     // lado do triangulo, recebe 3 lados e diz se é isoceles, equilatero, escaleno
    
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
        
//         System.out.println("Digite o lado a do triangulo: ");
//         int a = sc.nextInt();
//         System.out.println("Digite o lado b do triangulo: ");
//         int b = sc.nextInt();
//         System.out.println("Digite o lado c do triangulo: ");
//         int c = sc.nextInt();
        
//         if(a == b && b == c){
//             System.out.println("Equilatero");
        
//         }else if(a == b || b == c || a == c){
//             System.out.println("Isoceles");
        
//         }else{
//             System.out.println("Escaleno");
//         }
//     }
// }
    
//=========================================================================================================

// public class Main {
//     // escolhe entre soma, subtração, multiplicação, divisão e exponenciação.

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
        
//         System.out.println("Digite o primeiro número: ");
//         int a = sc.nextInt();
//         System.out.println("Digite o segundo número: ");
//         int b = sc.nextInt();
        
//         System.out.println("Digite a operação desejada: ");
//         String operacao = sc.next();
        
//         switch (operacao) {
//             case "1" -> System.out.println("Soma: " + (a + b));
//             case "2" -> System.out.println("Subtração: " + (a - b));
//             case "3" -> System.out.println("Multiplicação: " + (a * b));
//             case "4" -> System.out.println("Divisão: " + (a / b));
//             case "5" -> System.out.println("Exponenciação: " + (Math.pow(a, b)));
            
//             default -> {
//             }
//         }
//     }
    
// }
//=========================================================================================
// public class Main{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Digite um numero: ");
//         int num = sc.nextInt();

//         while (num != 0) {
//             if(num % 2 != 0){
//                 System.out.println("É par!");
//             }
//             else{
//                 System.out.println("É ímpar!");
//             }
//             System.out.println("Digite um numero: ");
//             num = sc.nextInt();
//         } 

//     }


// }


