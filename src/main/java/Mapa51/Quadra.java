
package Mapa51;
import javax.swing.JOptionPane;


public class Quadra {
    private String nome;
    private String tipoDaQuadra;
    private double valorMinuto;

    public Quadra(String nome, double valorMinuto) {
        this.nome = nome;
        this.tipoDaQuadra = tipoDaQuadra;
        this.valorMinuto = valorMinuto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipoDaQuadra() {
        return tipoDaQuadra;
    }

    public void setTipoDaQuadra(String tipoDaQuadra) {
        this.tipoDaQuadra = tipoDaQuadra;
    }

    public double getValorMinuto() {
        return valorMinuto;
    }

    public void setValorMinuto(double valorMinuto) {
        this.valorMinuto = valorMinuto;
    }

    public void cadastrarQuadra() {
        String nome = JOptionPane.showInputDialog("Informe o nome da quadra:");
        String tipoDaQuadra = JOptionPane.showInputDialog("Informe o tipo da quadra:");
        double valorMinuto = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor por minuto da quadra:"));
        this.nome = nome;
        this.tipoDaQuadra = tipoDaQuadra;
        this.valorMinuto = valorMinuto;
    }
}

