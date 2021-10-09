package creational.factorymethod.figura;

class CirculoFactory extends FiguraFactory {

	@Override
	FiguraIF criarFigura() {
		// TODO Auto-generated method stub
		return new Circulo();
	}

}
