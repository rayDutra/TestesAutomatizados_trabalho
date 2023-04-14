package Empresa;

public class Funcionario {
	private String nome;
	private int horasTrabalhadas;
	private double valorHora;

	public Funcionario(String nome, int horasTrabalhadas, double valorHora) {
		this.nome = nome;
		this.horasTrabalhadas = validaHorasTrabalhadas(horasTrabalhadas);
		this.valorHora = validaValorHorasTrabalhadas(valorHora);
	}

	public double calcularPagamento() {
		double pagamento = valorHora * horasTrabalhadas;
		if (pagamento < 1320.00) {
			pagamento = 1320.00;
		}
		return pagamento;
	}

	// Getters e Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public void setHorasTrabalhadas(int horasTrabalhadas) {
		this.horasTrabalhadas = validaHorasTrabalhadas(horasTrabalhadas);
	}

	public double getValorHora() {
		return valorHora;
	}

	public void setValorHora(double valorHora) {
		this.valorHora = validaValorHorasTrabalhadas(valorHora);
	}
	private int validaHorasTrabalhadas(int horasTrabalhadas) {
		if (horasTrabalhadas > 40) {
			throw new IllegalArgumentException(
					"O número de horas trabalhadas por funcionários próprios deve ser menor ou igual a 40.");
		}
		return horasTrabalhadas;
	}
	private double validaValorHorasTrabalhadas(double valorHora) throws IllegalArgumentException{
		double salarioMinimo= 1320.00;
		double valorMininimoHora = salarioMinimo * 0.04;
		double valorMaximoHora = salarioMinimo * 0.10;
		if(valorHora < valorMininimoHora | valorHora < valorMaximoHora) {
			throw new IllegalArgumentException(
					"O valor por hora precisa estr enre 4% e 10% do salário minimo.");
		}
		return valorHora;
	}
	
}