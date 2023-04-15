public class Cliente extends PessoaFisica {

    private Double limiteCrediario;
    private Double limiteUtilizado;

    public Cliente(){

    }

    public Cliente(Integer id,String nome,String endereco,String telefone,String cpf,
                   String RG,String sexo ,Double limiteCrediario, Double limiteUtilizado) {

        this.setID(id);
        this.setNome(nome);
        this.setEndereco(endereco);
        this.setTelefone(telefone);
        this.setCPF(cpf);
        this.setRG(RG);
        this.setSexo(sexo);
        this.limiteCrediario = limiteCrediario;
        this.limiteUtilizado = limiteUtilizado;
    }
        public Double aumentalimite(Double aumento){
        Double aumento1 = limiteCrediario +  aumento;

        return aumento1;
    }
        public Double abaixaLimite(Double reducao){

        Double reducao1 = limiteCrediario  - reducao;

        return reducao1;
        }
    public Double getLimiteCrediario() {
        return limiteCrediario;
    }

    public void setLimiteCrediario(Double limiteCrediario) {
        this.limiteCrediario = limiteCrediario;
    }

    public Double getLimiteUtilizado() {
        return limiteUtilizado;
    }

    public void setLimiteUtilizado(Double limiteUtilizado) {
        this.limiteUtilizado = limiteUtilizado;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "limiteCrediario=" + limiteCrediario +
                ", limiteUtilizado=" + limiteUtilizado +
                '}';
    }
}
