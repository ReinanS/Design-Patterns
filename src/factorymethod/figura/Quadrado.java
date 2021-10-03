package factorymethod.figura;

class Quadrado implements FiguraIF {
	private String nome;
	
	Quadrado() {
		this.nome = "Quadrado";
	}

	@Override
	 public void descricao() {
		System.out.println(nome);
	}

}
