public class Main {
    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa(1,"joão","rua dos alfeneiros","34378101");
        PessoaFisica pessoaFisica1 = new PessoaFisica("23445678980","5124555","masculino");
        PessoaJuridica pessoaJuridica1 = new PessoaJuridica("2344543-0001-21","1922929292","comidas");
        Cliente cliente1 = new Cliente();
        cliente1.setLimiteCrediario(3600.00);
        cliente1.setLimiteUtilizado(2600.00);
        Funcionario funcionario1 = new Funcionario();
        funcionario1.setSalarioBruto(4500.00);
        funcionario1.setSalarioLiquido(3900.00);
        Fornecedor fornecedor1 = new Fornecedor();
        fornecedor1.setResponsavel("irineu ");
        fornecedor1.setObservacao("você não sabe nem eu ");

        System.out.println(pessoa1);

        System.out.println(pessoaFisica1);

        System.out.println(pessoaJuridica1);

        System.out.println("get documento principal cnpj: "+pessoaJuridica1.getDocumentoPrincipal());

        System.out.println("get documento principal cpf: "+pessoaFisica1.getDocumentoPrincipal());

        System.out.println(cliente1);

        System.out.println("aumenta limite crediario: " + cliente1.aumentalimite(100.00));

        System.out.println("abaixa limite crediario: " + cliente1.abaixaLimite(50.00));


        System.out.println(funcionario1);

        System.out.println("salario novo com dissidio: " + funcionario1.aplicaDissidio(8.5/100.00));

        System.out.println(funcionario1);

        System.out.println(fornecedor1);
    }
}