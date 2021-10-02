package factorymethod.figura;

class TrEquilatero implements Figura {
	private String nome;
	
	TrEquilatero() {
		this.nome = "Triangulo Equilatero";
	}
	
	@Override
	public void descricao() {
		System.out.println(nome);
	}

}
