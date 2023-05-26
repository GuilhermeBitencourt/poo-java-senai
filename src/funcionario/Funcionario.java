package funcionario;

/**
 *
 * @Kauã C Dias
 */
public class Funcionario {
    private int id;
    private String nome;
    private double salario;
    private EnumSetor setor;
    private EnumGenero genero;
    private int idade;

    public Funcionario(int id, String nome, double salario, EnumSetor setor, EnumGenero genero, int idade) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
        this.setor = setor;
        this.genero = genero;
        this.idade = idade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public EnumSetor getSetor() {
        return setor;
    }

    public void setSetor(EnumSetor setor) {
        this.setor = setor;
    }

    public EnumGenero getGenero() {
        return genero;
    }

    public void setGenero(EnumGenero genero) {
        this.genero = genero;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "" + " " + id + " Nome = " + nome + ", Salario = " + salario + ", Setor = " + setor + ", Genero = " + genero + ", Idade = " + idade;
    }
    
}
