public class Funcionario extends PessoaFisica {

    private Double salarioBruto;
    private Double salarioLiquido;

    public Funcionario(){

    }

    public Funcionario(Integer id,String nome,String endereco,String telefone,String cpf,
                       String RG,String sexo,Double salarioBruto, Double salarioLiquido) {
        this.setID(id);
        this.setNome(nome);
        this.setEndereco(endereco);
        this.setTelefone(telefone);
        this.setCPF(cpf);
        this.setRG(RG);
        this.setSexo(sexo);
        this.salarioBruto = salarioBruto;
        this.salarioLiquido = salarioLiquido;

    }

    public Double aplicaDissidio(Double dissidio){

      Double dissidio1 = salarioBruto + (salarioBruto * dissidio);

      return dissidio1;
    }
    public Double getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(Double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public Double getSalarioLiquido() {
        return salarioLiquido;
    }

    public void setSalarioLiquido(Double salarioLiquido) {
        this.salarioLiquido = salarioLiquido;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "salarioBruto=" + salarioBruto +
                ", salarioLiquido=" + salarioLiquido +
                '}';
    }
}
