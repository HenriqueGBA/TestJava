import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ListaFiltro {
    
    public static List<String> filtro(List<String> strings){
        return strings.stream().filter(s -> s.startsWith("a") && s.length() == 3)
        .collect(Collectors.toList());

    }


}
