

public class InverterString {
    public static void main(String[] args) {
        
        String nome = "Mateus Soares Prado"; 

        
        
        String strInvertida = inverter(nome);
        
        System.out.println("Nome original: " + nome);
        System.out.println("Nome invertido: " + strInvertida);
        
        
    }

    public static String inverter(String str) {
        String resultado = ""; 
        
       
        for (int i = str.length() - 1; i >= 0; i--) {
            resultado += str.charAt(i); 
        }
        
        return resultado; 
    }
}
