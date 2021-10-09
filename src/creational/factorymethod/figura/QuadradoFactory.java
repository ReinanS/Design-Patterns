package creational.factorymethod.figura;

public class QuadradoFactory extends FiguraFactory {

	@Override
	FiguraIF criarFigura() {
		// TODO Auto-generated method stub
		return new Quadrado();
	}

}
