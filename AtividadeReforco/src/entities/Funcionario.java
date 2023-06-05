package entities;

public class Funcionario {
	
	public String nome; // Atributos para armazenar o nome, cargo e salario do funcionário
    public String cargo;
    public double salario;

    // Construtor da classe Funcionario
    public Funcionario(String nome, String cargo, double salario) {
        this.nome = nome; // Inicializa o atributo nome, cargo e salario com o valor recebido como parâmetro
        this.cargo  = cargo; 
        this.salario = salario; 
    }

    // Método para verificar o salário e o cargo do funcionário
    public void verificarSalarioECargo() {
        double salarioAtualizado = salario; // Variável para armazenar o salário bruto atualizado do funcionário

        // Verifica se o cargo é "gerente" e o salário é menor que 5000
        if (cargo.equalsIgnoreCase("gerente") && salario < 5000) {
            double bonus = salario * 0.015; // Calcula o valor do bônus (1.5% do salário base)
            salarioAtualizado += bonus; // Adiciona o bônus ao salário bruto atualizado
        }
        // Verifica se o cargo é "funcionário" e o salário é menor que 1500
        else if (cargo.equalsIgnoreCase("funcionário") && salario < 1500) {
            double bonus = salario * 0.02; // Calcula o valor do bônus (2% do salário base)
            salarioAtualizado += bonus; // Adiciona o bônus ao salário bruto atualizado
        }

        // Chama o método para mostrar os dados do funcionário, passando o salário bruto atualizado como parâmetro
        mostrarDadosFuncionario(salarioAtualizado);
    }

    // Método public para mostrar os dados do funcionário
    public void mostrarDadosFuncionario(double salarioAtualizado) {
        System.out.println("Dados do funcionário:");
        System.out.println("Nome: " + nome);
        System.out.println("Cargo: " + cargo);
        System.out.println("Salário Bruto Atualizado: R$" + salarioAtualizado);
    }

}
