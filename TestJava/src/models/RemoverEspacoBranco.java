public class RemoverEspacoBranco {
    public static String removerEspacos(String input){
        StringBuilder result = new StringBuilder();

        for(char c : input.toCharArray()){
            if(c != ' '){
                result.append(c);
            }
        }
        return result.toString();
    }
}   
