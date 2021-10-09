package creational.factorymethod.figura;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

 abstract class FiguraFactory {
	abstract FiguraIF criarFigura();
	private int sentinela = 0;
	
	FiguraFactory() {
		sentinela++;
	}
	
	private static HashMap<String, FiguraFactory> colecaoFiguras() {
		HashMap<String, FiguraFactory> figuras = new HashMap<String, FiguraFactory>();
		figuras.put("Circulo", new CirculoFactory());
		figuras.put("Quadrado", new QuadradoFactory());
		figuras.put("Triangulo", new TrEquilateroFactory());
		
		return figuras;
	}
	
	public static FiguraIF getFigura(String nome) {
		HashMap<String, FiguraFactory> figuras = colecaoFiguras();
		
		if(figuras == null) {
			return null;
		}
		
		FiguraIF figura = figuras.get(nome).criarFigura();
		return figura;
	}
	
	public static FiguraIF nextFigura() {
		HashMap<String, FiguraFactory> figuras = colecaoFiguras();		
		return figuras.get("Quadrado").criarFigura();
		
	}
	
	public static ArrayList<FiguraIF> sequenciaFiguras() {
		HashMap<String, FiguraFactory> figuras = colecaoFiguras();
		
		if(figuras == null) {
			return null;
		}
		
		ArrayList<FiguraIF> sequencia = new ArrayList<FiguraIF>();
		
		for (String key : figuras.keySet()) {
			System.out.println(key);
			sequencia.add(FiguraFactory.getFigura(key));
		}
		
		return sequencia;
		
	}
	
	
}
