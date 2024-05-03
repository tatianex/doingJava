/*2) Implementar uma Interface:
Crie uma interface Animal com um método emitirSom() e um método andar().
Em seguida, implemente essa interface nas classes Pessoa, Gato e Passaro,
cada uma com sua própria implementação de emitirSom() e andar().*/

public interface Animal {
	public void emitirSom();
	public void andar();
}

class Pessoa implements Animal {
	@Override
	public void emitirSom() {
		System.out.println("Pessoa falando");
	}

	@Override
	public void andar() {
		System.out.println("Andando com duas pernas");
	}
}

class Gato implements Animal {
	@Override
	public void emitirSom() {
		System.out.println("Gato miando");
	}

	@Override
	public void andar() {
		System.out.println("Andando com quatro patas");
	}
}

class Passaro implements Animal {
	@Override
	public void emitirSom() {
		System.out.println("Passaro cantando");
	}

	@Override
	public void andar() {
		System.out.println("Pulandinho duas patas");
	}
	
	public void voar() {
		System.out.println("Voando");
	}
}