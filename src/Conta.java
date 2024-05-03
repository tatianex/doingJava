/*6) Utilizar Classes Abstratas:
Crie uma classe abstrata Conta com métodos sacar e depositar e com as propriedades numeroConta,
nomeTitular e saldo. Em seguida, crie as subclasses ContaCorrente e ContaPoupanca
que estendem Conta e implementam esses métodos de acordo com as regras de cada tipo de conta.
Na classe contaCorrente, crie um atributo chamado limite, que define o quanto saldo pode ficar negativo.
Por exemplo, se o limite for 200, o saldo pode ficar até -200 reais.
O método sacar, na classe ContaCorrente, deve impedir que o saldo fique menor que o limite.
Na classe ContaPoupanca, o método sacar deve impedir que o saldo fique menor que zero.*/
public abstract class Conta {
	String numeroConta;
	public String getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	String nomeTitular;
	double saldo;

	public abstract void sacar(double value);

	public abstract void depositar(double value);
}

class ContaCorrente extends Conta {
	double limite = 5000;

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	@Override
	public void sacar(double value) {
		if (saldo - value >= -limite) {
			saldo -= value;
			System.out.println("Saque de " + value + " realizado com sucesso");
		} else {
			System.out.println("Saldo insuficiente ou excedido o limite do saque");
		}
	}

	@Override
	public void depositar(double value) {
		saldo += value;
		System.out.println("Depósito de " + value + " realizado com sucesso");
	}
}

class ContaPoupanca extends Conta {

	@Override
	public void sacar(double value) {
		if (saldo - value >= 0) {
			saldo -= value;
			System.out.println("Saque de " + value + " realizado com sucesso");
		} else {
			System.out.println("Saldo insuficiente para o saque");
		}
	}

	@Override
	public void depositar(double value) {
		saldo += value;
		System.out.println("Depósito de " + value + " realizado com sucesso");
	}
}
