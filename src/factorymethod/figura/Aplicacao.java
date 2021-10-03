package factorymethod.figura;

public class Aplicacao {
	
	public static void main(String[] args) {
		FiguraIF figura = FiguraFactory.getFigura("Triangulo");
		figura.descricao();
		
		FiguraFactory.sequenciaFiguras();
	}
}
