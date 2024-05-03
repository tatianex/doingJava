/*
5) Implementar Classes e Interfaces:
Crie uma interface Autenticavel com um método autenticar().
Em seguida, crie classes como Usuario e Administrador que implementam essa interface.
Cada classe deve fornecer sua própria implementação de autenticar().*/

public interface Autenticavel {
	public void autenticar();
}

class Usuario implements Autenticavel {

	@Override
	public void autenticar() {
		System.out.println("autenticando o usuario");
	}
	
}

class Administrador implements Autenticavel {

	@Override
	public void autenticar() {
		System.out.println("autenticando o admin");
	}
	
}