public class PessoaFisica extends Pessoa {
    private String CPF;
    private String RG;
    private String sexo;

    public PessoaFisica(){

    }

    public PessoaFisica(String CPF, String RG, String sexo) {
        this.CPF = CPF;
        this.RG = RG;
        this.sexo = sexo;
    }

    @Override
    public String getDocumentoPrincipal() {
        return getCPF();
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "PessoaFisica{" +
                "CPF='" + CPF + '\'' +
                ", RG='" + RG + '\'' +
                ", sexo='" + sexo + '\'' +
                '}';
    }
}

