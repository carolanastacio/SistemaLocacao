package Mapa51;
import javax.swing.JOptionPane;

public class Locacao {

    private Locatario locatario;
    private Quadra quadra;
    private int tempoMinuto;
    private char necessitaEquipamento;

    public Locacao() {
        this.locatario = locatario;
        this.quadra = quadra;
    }

    public Locatario getLocatario() {
        return locatario;
    }

    public void setLocatario(Locatario locatario) {
        this.locatario = locatario;
    }

    public Quadra getQuadra() {
        return quadra;
    }

    public void setQuadra(Quadra quadra) {
        this.quadra = quadra;
    }

    public int getTempoMinuto() {
        return tempoMinuto;
    }

    public void setTempoMinuto(int tempoMinuto) {
        this.tempoMinuto = tempoMinuto;
    }

    public char getNecessitaEquipamento() {
        return necessitaEquipamento;
    }

    public void setNecessitaEquipamento(char necessitaEquipamento) {
        this.necessitaEquipamento = necessitaEquipamento;
    }

    public void cadastrarLocacao(int parseInt, char charAt) {
        if (!verificarMaiorIdade()) {
            JOptionPane.showMessageDialog(null, "Locatário é menor de idade");
            return;
        }
        this.tempoMinuto = Integer.parseInt(JOptionPane.showInputDialog("Digite o tempo em minutos da locação: "));
        this.necessitaEquipamento = JOptionPane.showInputDialog("Necessita de equipamento? (S/N)").toUpperCase().charAt(0);
        mostrarResumoLocacao();
    }

    public boolean verificarMaiorIdade() {
        int idade = 2023 - this.locatario.getAnoNascimento();
        return idade >= 18;
    }

    public double calcularLocacao() {
        double valorLocacao = this.tempoMinuto * this.quadra.getValorMinuto();
        if (this.tempoMinuto >= 120) {
            valorLocacao *= 0.9;
        }
        return valorLocacao;
    }

    public void mostrarResumoLocacao() {
        JOptionPane.showMessageDialog(null, "Resumo da Locação: \n" 
                + "Locatário: " + this.locatario.getNome() + "\n"
                + "Quadra: " + this.quadra.getNome() + "\n"
                + "Tempo da Locação (minutos): " + this.tempoMinuto + "\n"
                + "Valor Total da Locação: R$" + calcularLocacao());
    }

}
