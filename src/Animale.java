/*4) Herança e Polimorfismo:
Crie uma classe abstrata Animal com métodos como emitirSom() e mover().
Em seguida, crie subclasses como Cachorro e Gato que estendem Animal e implementam esses métodos.
Teste o polimorfismo chamando os métodos com objetos das subclasses.*/
abstract class Animale {
	public abstract void emitirSom();
	public abstract void mover();
}

class Cachorro extends Animale {
	
	@Override
	public void emitirSom() {
		System.out.println("latindo");
	}

	@Override
	public void mover() {
		System.out.println("correndo em quatro patas");		
	}
	
}

class Gate extends Animale {

	@Override
	public void emitirSom() {
		System.out.println("miando");
	}

	@Override
	public void mover() {
		System.out.println("pulando no telhado");
	}
	
}