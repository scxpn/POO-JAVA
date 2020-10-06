package entitels;

public class util {

	public String nome;
	public String sobreNome;
	public double salarioMensal;
	public double gratificacao;
	public double salary;

	public double getGratificacao() {

		return gratificacao;
	}

	public String getName() {

		return nome;
	}

	public String getlastName() {

		return sobreNome;
	}

	public double getsalarioMensal() {

		return salarioMensal;
	}

	public double getSalary() {

		salary = ((gratificacao / 100) * salarioMensal) + salarioMensal;

		return salary;
	}

	public void setSalaryEqualsZero() {

		this.salarioMensal = 0.0;

	}

	public void setAumento(double aumento) {

		this.gratificacao = this.gratificacao + aumento;

	}

}
