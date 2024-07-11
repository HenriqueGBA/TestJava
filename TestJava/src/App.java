import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
//first question 1. Given a list of strings, write a method that returns a list of all strings that start with the letter ‘a’
// (lower case) and have exactly 3 letters. TIP: Use Java Lambdas and Streams API’s.
        ListaFiltro listaFiltro = new ListaFiltro();
        
        List<String> strings = List.of("abelha", "ado", "abc", "cca", "ace");

        List<String> listaFiltrada = listaFiltro.filtro(strings);
        System.out.println("Resultado:");
        System.out.println(listaFiltrada);
//second question Write a Java program to remove all white spaces from a string without using replace().
        RemoverEspacoBranco removerEspacoBranco = new RemoverEspacoBranco();
        
        String palavra = "Ola mundo meu nome e henrique";

        String palavraSemEspaco = removerEspacoBranco.removerEspacos(palavra);
        System.out.println("Resultado:");
        System.out.println(palavra);
        System.out.println(palavraSemEspaco);
    }
}
