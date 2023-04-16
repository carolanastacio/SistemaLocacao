package Mapa51;
import javax.swing.JOptionPane;

public class LocacaoQuadra {

    public static void main(String[] args) {
        
        // Criação do objeto locacao
        Locacao locacao = new Locacao();
        
        // Cadastro do locatário
        String nomeLocatario = JOptionPane.showInputDialog("Digite o nome do locatário:");
        String anoNascimentoLocatario = JOptionPane.showInputDialog("Digite o ano de nascimento do locatário:");
        Locatario locatario = new Locatario(nomeLocatario, Integer.parseInt(anoNascimentoLocatario));
        locacao.setLocatario(locatario);
        
        // Cadastro da quadra
        String nomeQuadra = JOptionPane.showInputDialog("Digite o nome da quadra:");
        String valorMinutoQuadra = JOptionPane.showInputDialog("Digite o valor por minuto da quadra:");
        Quadra quadra = new Quadra(nomeQuadra, Double.parseDouble(valorMinutoQuadra));
        locacao.setQuadra(quadra);
        
        // Cadastro da locação
        String tempoMinutoLocacao = JOptionPane.showInputDialog("Digite o tempo em minutos da locação:");
        String necessitaEquipamentoLocacao = JOptionPane.showInputDialog("O locatário necessita de equipamentos? (S/N):");
        locacao.cadastrarLocacao(Integer.parseInt(tempoMinutoLocacao), necessitaEquipamentoLocacao.charAt(0));
        
        // Exibição do resumo da locação e cálculo do valor
        locacao.mostrarResumoLocacao();
        locacao.calcularLocacao();
    }

}
