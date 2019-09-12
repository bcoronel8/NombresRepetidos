package ejercicio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;
import java.util.TreeSet;

public class NiñosExploradores {

	private HashMap<String, Integer> nombresFrecuentes;
	private int frecuencia;
	private TreeMap<Integer, String> rankingFrecuencia;
	
	
	public NiñosExploradores() {
		
		this.rankingFrecuencia= new TreeMap<Integer, String>(Collections.reverseOrder()); // Con esta linea se genera que el TreeMap
		this.nombresFrecuentes = new HashMap<String, Integer>();				// Ordene inversamente, para tener el ranking 
		this.frecuencia= 0;														///En orden descendente y tener las mayores frecuencias
	}
	
	public void realizarRanking() {
		
		for(String key : this.nombresFrecuentes.keySet()) {
			
			this.rankingFrecuencia.put(this.nombresFrecuentes.get(key), key); /// Se inserta en un TreeMap las repeticiones como Key, y los nombres como
																			///// Atributos, para asi ordenar facilmente el ranking.
		}
		
	}
	


	public HashMap<String, Integer> getNombresFrecuentes() {
		return nombresFrecuentes;
	}


	public void setNombresFrecuentes(HashMap<String, Integer> nombresFrecuentes) {
		this.nombresFrecuentes = nombresFrecuentes;
	}


	public int getFrecuencia() {
		return frecuencia;
	}


	public void setFrecuencia(int frecuencia) {
		this.frecuencia = frecuencia;
	}


	public TreeMap<Integer, String> getRankingFrecuencia() {
		return rankingFrecuencia;
	}

	public void setRankingFrecuencia(TreeMap<Integer, String> rankingFrecuencia) {
		this.rankingFrecuencia = rankingFrecuencia;
	}
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombresFrecuentes == null) ? 0 : nombresFrecuentes.hashCode());
		result = prime * result + ((rankingFrecuencia == null) ? 0 : rankingFrecuencia.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NiñosExploradores other = (NiñosExploradores) obj;
		if (nombresFrecuentes == null) {
			if (other.nombresFrecuentes != null)
				return false;
		} else if (!nombresFrecuentes.equals(other.nombresFrecuentes))
			return false;
		if (rankingFrecuencia == null) {
			if (other.rankingFrecuencia != null)
				return false;
		} else if (!rankingFrecuencia.equals(other.rankingFrecuencia))
			return false;
		return true;
	}

	public void mostrar() {
		for (Integer name: rankingFrecuencia.keySet()){
            String key = name.toString();
            String value = rankingFrecuencia.get(name).toString();  
            System.out.println(key + " " + value);  
} 
		
	}

	
	
}
