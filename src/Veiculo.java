/* 1) Criar uma Hierarquia de Classes:
Crie uma classe abstrata Veiculo com os seguintes atributos:
marca, modelo, ano e cor.
Crie métodos abstratos como acelerar() e frear().
Em seguida, crie as subclasses Carro, Moto e Onibus que estendem Veiculo e implementam esses métodos.
Na classe Carro adicione as propriedades numeroPortas e tipoCarroceria.
Na classe Moto adicione a propriedade tamanhoGuidao e o método empinar.
Na classe Onibus adicione as propriedades qtdePassageirosEmPe e qtdePassageirosSentados. */

abstract class Veiculo {
	String marca;
	String modelo;
	int ano;
	String cor;
	
	public Veiculo(String marca, String modelo, int ano, String cor) {
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.cor = cor;
	}
	
	abstract void acelerar();
	abstract void frear();
}

class Carro extends Veiculo {
	int numeroDePortas;
	String tipoCarroceria;
	
	public Carro(String marca, String modelo, int ano, String cor, int numeroDePortas, String tipoCarroceria) {
		super(marca, modelo, ano, cor);
		this.numeroDePortas = numeroDePortas;
		this.tipoCarroceria = tipoCarroceria;
	}
	
	public int getNumeroDePortas() {
		return numeroDePortas;
	}

	public void setNumeroDePortas(int numeroDePortas) {
		this.numeroDePortas = numeroDePortas;
	}
	
	public String getTipoCarroceria() {
		return tipoCarroceria;
	}

	public void setTipoCarroceria(String tipoCarroceria) {
		this.tipoCarroceria = tipoCarroceria;
	}
	
	public 
	
	@Override
	void acelerar() {
		System.out.println("Acelerando o carro");
	}
	
	@Override
	void frear() {
		System.out.println("Freando o carro");
	}
}


class Moto extends Veiculo {
	public Moto(String marca, String modelo, int ano, String cor, int tamanhoGuidao) {
		super(marca, modelo, ano, cor);
		this.tamanhoGuidao = tamanhoGuidao;
	}

	public int getTamanhoGuidao() {
		return tamanhoGuidao;
	}

	public void setTamanhoGuidao(int tamanhoGuidao) {
		this.tamanhoGuidao = tamanhoGuidao;
	}

	int tamanhoGuidao;
	
	@Override
    void acelerar() {
        System.out.println("Acelerando a moto");
    }

    @Override
    void frear() {
        System.out.println("Freando a moto");
    }

    void empinar() {
        System.out.println("Empinando a moto");
    }
}


class Onibus extends Veiculo {
    int qtdePassageirosEmPe;
	int qtdePassageirosSentados;

    
    public int getQtdePassageirosEmPe() {
		return qtdePassageirosEmPe;
	}

	public void setQtdePassageirosEmPe(int qtdePassageirosEmPe) {
		this.qtdePassageirosEmPe = qtdePassageirosEmPe;
	}


    public int getQtdePassageirosSentados() {
		return qtdePassageirosSentados;
	}

	public void setQtdePassageirosSentados(int qtdePassageirosSentados) {
		this.qtdePassageirosSentados = qtdePassageirosSentados;
	}

	public Onibus(String marca, String modelo, int ano, String cor, int qtdePassageirosEmPe, int qtdePassageirosSentados) {
        super(marca, modelo, ano, cor);
        this.qtdePassageirosEmPe = qtdePassageirosEmPe;
        this.qtdePassageirosSentados = qtdePassageirosSentados;
    }

    @Override
    void acelerar() {
        System.out.println("Acelerando o ônibus");
    }

    @Override
    void frear() {
        System.out.println("Freando o ônibus");
    }
}