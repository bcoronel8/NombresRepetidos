package ejercicio;

import java.io.FileNotFoundException;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		
		NiñosExploradores exploradores = new NiñosExploradores();
		ProcesadorArchivo archivo = new ProcesadorArchivo();
		archivo.leerListaDeNombres("nombres.in", exploradores);
		exploradores.realizarRanking();
		archivo.escribirRankingFinal("nombres.out", exploradores);
		
	}

}
