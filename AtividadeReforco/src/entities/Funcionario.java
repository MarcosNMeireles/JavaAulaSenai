package entities;

public class Funcionario {
	
	public String nome; // Atributos para armazenar o nome, cargo e salario do funcion�rio
    public String cargo;
    public double salario;

    // Construtor da classe Funcionario
    public Funcionario(String nome, String cargo, double salario) {
        this.nome = nome; // Inicializa o atributo nome, cargo e salario com o valor recebido como par�metro
        this.cargo  = cargo; 
        this.salario = salario; 
    }

    // M�todo para verificar o sal�rio e o cargo do funcion�rio
    public void verificarSalarioECargo() {
        double salarioAtualizado = salario; // Vari�vel para armazenar o sal�rio bruto atualizado do funcion�rio

        // Verifica se o cargo � "gerente" e o sal�rio � menor que 5000
        if (cargo.equalsIgnoreCase("gerente") && salario < 5000) {
            double bonus = salario * 0.015; // Calcula o valor do b�nus (1.5% do sal�rio base)
            salarioAtualizado += bonus; // Adiciona o b�nus ao sal�rio bruto atualizado
        }
        // Verifica se o cargo � "funcion�rio" e o sal�rio � menor que 1500
        else if (cargo.equalsIgnoreCase("funcion�rio") && salario < 1500) {
            double bonus = salario * 0.02; // Calcula o valor do b�nus (2% do sal�rio base)
            salarioAtualizado += bonus; // Adiciona o b�nus ao sal�rio bruto atualizado
        }

        // Chama o m�todo para mostrar os dados do funcion�rio, passando o sal�rio bruto atualizado como par�metro
        mostrarDadosFuncionario(salarioAtualizado);
    }

    // M�todo public para mostrar os dados do funcion�rio
    public void mostrarDadosFuncionario(double salarioAtualizado) {
        System.out.println("Dados do funcion�rio:");
        System.out.println("Nome: " + nome);
        System.out.println("Cargo: " + cargo);
        System.out.println("Sal�rio Bruto Atualizado: R$" + salarioAtualizado);
    }

}
