package factorymethod.figura;

 class Circulo implements FiguraIF {
	private String nome;
	
	Circulo() {
		this.nome = "Circulo";
	}

	@Override
	public void descricao() {
		System.out.println(nome);
	}

	
}
