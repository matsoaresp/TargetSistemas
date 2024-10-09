public class FaturamentoDistribuidora {
    public static void main(String[] args) {
        
        double sp = 67836.43;
        double rj = 36678.66;
        double mg = 29229.88;
        double es = 27165.48;
        double outros = 19849.53;

        
        double totalFaturamento = sp + rj + mg + es + outros;

        
        System.out.printf("Faturamento Mensal por Estado:%n");
        System.out.printf("SP: R$ %.2f (%.2f%% do total)%n", sp, (sp / totalFaturamento) * 100);
        System.out.printf("RJ: R$ %.2f (%.2f%% do total)%n", rj, (rj / totalFaturamento) * 100);
        System.out.printf("MG: R$ %.2f (%.2f%% do total)%n", mg, (mg / totalFaturamento) * 100);
        System.out.printf("ES: R$ %.2f (%.2f%% do total)%n", es, (es / totalFaturamento) * 100);
        System.out.printf("Outros: R$ %.2f (%.2f%% do total)%n", outros, (outros / totalFaturamento) * 100);
        System.out.printf("Faturamento Total: R$ %.2f%n", totalFaturamento);
    }
}
