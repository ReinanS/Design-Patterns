package factorymethod.figura;

class TrEquilateroFactory extends FiguraFactory {

	@Override
	FiguraIF criarFigura() {
		// TODO Auto-generated method stub
		return new TrEquilatero();
	}

}
