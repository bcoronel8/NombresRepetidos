package ejercicio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;
import java.util.TreeMap;

public class ProcesadorArchivo {

	void leerListaDeNombres (String pathFile, NiñosExploradores exploradores) throws FileNotFoundException {
		
		Scanner scanner = new Scanner(new File(pathFile));
		scanner.useLocale(Locale.ENGLISH);
		int cantidadNombres = scanner.nextInt();
		exploradores.setFrecuencia(scanner.nextInt());
		String nombre;
		
		for(int i=0; i< cantidadNombres; i++) {
			
			nombre= scanner.next();
			if(exploradores.getNombresFrecuentes().containsKey(nombre)) {
				exploradores.getNombresFrecuentes().put(nombre, (exploradores.getNombresFrecuentes().get(nombre))+1);
			}else {
				exploradores.getNombresFrecuentes().put(nombre, 1);
			}
		
			
		}
		
		scanner.close();
		
		
	}

	void escribirRankingFinal (String pathFile, NiñosExploradores exploradores) throws FileNotFoundException {
		
		PrintWriter salida = new PrintWriter(pathFile);
		TreeMap<String, Integer> arbolTemporal = new TreeMap<String, Integer>();
		Integer key;
		
		for(int i= 0; i< exploradores.getFrecuencia(); i++) {
			key= exploradores.getRankingFrecuencia().firstKey();
			arbolTemporal.put(exploradores.getRankingFrecuencia().get(key) ,key);
			exploradores.getRankingFrecuencia().remove(key);
		}
		
		for(String keyArbolTemporal : arbolTemporal.keySet()) {
			
			salida.println(keyArbolTemporal + " " + arbolTemporal.get(keyArbolTemporal));
		}
		
		salida.close();
	}

}
