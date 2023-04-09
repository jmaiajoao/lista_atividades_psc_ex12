





// programa de soluções computacionais.
// Lista 2 ( atividade 12, segunda lista)
//Aluno: João Victor Maia Leite
//RA: 323124931




import java.util.Scanner;

public class atividade12 {
    public static void main(String[] args) throws Exception {
        



                final double LITROS_POR_METRO_QUADRADO = 1.0 / 6.0;
                final int LITROS_POR_LATA = 18;
                final int LITROS_POR_GALAO = 3;
                final double PRECO_LATA = 80.0;
                final double PRECO_GALAO = 25.0;
        
                Scanner input = new Scanner(System.in);
                System.out.print("Digite o tamanho em metros quadrados da área a ser pintada: ");
                int tamanhoArea = input.nextInt();
        
                // Considera 10% de folga e arredonda o resultado para cima
                int litrosNecessarios = (int) Math.ceil(tamanhoArea * LITROS_POR_METRO_QUADRADO * 1.1);
        
                // Compra apenas latas de 18 litros
                int latas = litrosNecessarios / LITROS_POR_LATA;
                int litrosRestantes = litrosNecessarios % LITROS_POR_LATA;
                double precoLatas = latas * PRECO_LATA;
                if (litrosRestantes > 0) {
                    latas++;
                    precoLatas += PRECO_LATA;
                }
        
                // Compra apenas galões de 3,6 litros
                int galoes = litrosNecessarios / LITROS_POR_GALAO;
                litrosRestantes = litrosNecessarios % LITROS_POR_GALAO;
                double precoGaloes = galoes * PRECO_GALAO;
                if (litrosRestantes > 0) {
                    galoes++;
                    precoGaloes += PRECO_GALAO;
                }
        
                // Mistura latas e galões
                int latasMisturadas = litrosNecessarios / LITROS_POR_LATA;
                litrosRestantes = litrosNecessarios % LITROS_POR_LATA;
                int galoesMisturados = litrosRestantes / LITROS_POR_GALAO;
                int litrosRestantesMisturados = litrosRestantes % LITROS_POR_GALAO;
                double precoMistura = latasMisturadas * PRECO_LATA;
                precoMistura += galoesMisturados * PRECO_GALAO;
                if (litrosRestantesMisturados > 0) {
                    galoesMisturados++;
                    precoMistura += PRECO_GALAO;
                }
                if (galoesMisturados == 5) {
                    latasMisturadas++;
                    galoesMisturados = 0;
                }
                precoMistura += latasMisturadas * PRECO_LATA;
        
                // Exibe os resultados
                System.out.printf("Para pintar %d metros quadrados serão necessários:\n", tamanhoArea);
                System.out.printf("Comprando apenas latas de 18 litros: %d latas por R$ %.2f\n", latas, precoLatas);
                System.out.printf("Comprando apenas galões de 3,6 litros: %d galões por R$ %.2f\n", galoes, precoGaloes);
                System.out.printf("Você precisará de %d galão(es) de tinta, que custará(ão) R$ %.2f.", galoes, precoMistura);











    }
}
