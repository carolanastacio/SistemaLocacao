package Mapa51;
import javax.swing.JOptionPane;
import java.time.LocalDate;



public class Locatario {
    private String nome;
    private String cpf;
    private String telefone;
    private int anoNascimento;

    public Locatario(String nomeLocatario, int parseInt) {}

    public Locatario(String nome, String cpf, String telefone, int anoNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.anoNascimento = anoNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public void verificarMaiorIdade() {
        LocalDate dataAtual = LocalDate.now();
        int idade = dataAtual.getYear() - this.anoNascimento;
        if (idade < 18) {
            JOptionPane.showMessageDialog(null, "Locatário é menor de idade!");
            System.exit(0);
        }
    }

    public void cadastrarLocatario() {
        this.setNome(JOptionPane.showInputDialog("Nome do Locatário:"));
        this.setCpf(JOptionPane.showInputDialog("CPF do Locatário:"));
        this.setTelefone(JOptionPane.showInputDialog("Telefone do Locatário:"));
        this.setAnoNascimento(Integer.parseInt(JOptionPane.showInputDialog("Ano de Nascimento do Locatário:")));
    }
}

