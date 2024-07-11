import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc =  new Scanner(System.in);
//first question 1. Given a list of strings, write a method that returns a list of all strings that start with the letter ‘a’
// (lower case) and have exactly 3 letters. TIP: Use Java Lambdas and Streams API’s.
        ListaFiltro listaFiltro = new ListaFiltro();
        
        List<String> strings = List.of("abelha", "ado", "abc", "cca", "ace");

        List<String> listaFiltrada = listaFiltro.filtro(strings);
        System.out.println("Resultado:");
        System.out.println(listaFiltrada);
        RemoverEspacoBranco removerEspacoBranco = new RemoverEspacoBranco();
//second question Write a Java program to remove all white spaces from a string without using replace().  
        String palavra = "Ola mundo meu nome e henrique";

        String palavraSemEspaco = removerEspacoBranco.removerEspacos(palavra);
        System.out.println("Resultado:");
        System.out.println(palavra);
        System.out.println(palavraSemEspaco);
//Write a Java program to swap two numbers without using the third variable.
        System.out.println("Digite o primeiro numero:");
        int num1 = sc.nextInt();

        
        System.out.println("Digite o segundo numero:");
        int num2 = sc.nextInt();

        System.out.println("sem trocar");
        System.out.printf("Este e o numero 1: "+ num1 + "\n"); 
        System.out.printf("Este e o numero 2: "+ num2); 
        
        num1 += num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        System.out.println("\nTrocando:");
        System.out.printf("Este e o numero 1: " + num1 + "\n"); 
        System.out.printf("Este e o numero 2: " + num2); 
    }
}
