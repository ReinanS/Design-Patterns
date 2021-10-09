package creational.factorymethod.figura;

public class Aplicacao {
	
	public static void main(String[] args) {
		FiguraIF figura = FiguraFactory.getFigura("Triangulo");
		figura.descricao();
		
		FiguraIF figura2 = FiguraFactory.nextFigura();
		figura2.descricao();
		
	}
}
