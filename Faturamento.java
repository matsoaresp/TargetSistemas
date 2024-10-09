import java.util.ArrayList;
import java.util.List;

public class Faturamento {
    public static void main(String[] args) {
        
        int[] dias = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 
                      11, 12, 13, 14, 15, 16, 17, 18, 
                      19, 20, 21, 22, 23, 24, 25, 26, 
                      27, 28, 29, 30};
        
        double[] valores = {31490.7866, 37277.9400, 37708.4303, 0.0000, 0.0000,
                            17934.2269, 0.0000, 6965.1262, 24390.9374, 14279.6481,
                            0.0000, 0.0000, 39807.6622, 27261.6304, 39775.6434,
                            29797.6232, 17216.5017, 0.0000, 0.0000, 12974.2000,
                            28490.9861, 8748.0937, 8889.0023, 17767.5583, 0.0000,
                            0.0000, 3071.3283, 48275.2994, 10299.6761, 39874.1073};

       
        List<Double> valoresValidos = new ArrayList<>();
        
        
        double menorFaturamento = Double.MAX_VALUE;
        double maiorFaturamento = Double.MIN_VALUE;
        double somaFaturamento = 0.0;

        
        for (int i = 0; i < dias.length; i++) {
            double valor = valores[i];

            
            if (valor > 0) {
                valoresValidos.add(valor);
                somaFaturamento += valor;
                
                if (valor < menorFaturamento) {
                    menorFaturamento = valor;
                }
                
                if (valor > maiorFaturamento) {
                    maiorFaturamento = valor;
                }
            }
        }

        double mediaFaturamento = somaFaturamento / valoresValidos.size();
        
        
        long diasAcimaDaMedia = valoresValidos.stream().filter(valor -> valor > mediaFaturamento).count();

        
        System.out.printf("Menor valor de faturamento: R$ %.2f%n", menorFaturamento);
        System.out.printf("Maior valor de faturamento: R$ %.2f%n", maiorFaturamento);
        System.out.printf("Número de dias com faturamento acima da média: %d%n", diasAcimaDaMedia);
    }
}
