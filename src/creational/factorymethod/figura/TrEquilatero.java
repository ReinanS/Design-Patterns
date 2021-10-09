package creational.factorymethod.figura;

class TrEquilatero implements FiguraIF {
	private String nome;
	
	TrEquilatero() {
		this.nome = "Triangulo Equilatero";
	}
	
	@Override
	public void descricao() {
		System.out.println(nome);
	}

}
