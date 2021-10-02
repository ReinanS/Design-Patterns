package factorymethod.figura;

class Quadrado implements Figura {
	private String nome;
	
	Quadrado() {
		this.nome = "Quadrado";
	}

	@Override
	public void descricao() {
		System.out.println(nome);
	}

}
