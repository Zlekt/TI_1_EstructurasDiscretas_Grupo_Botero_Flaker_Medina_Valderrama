package model;

import java.util.Arrays;
import java.util.Collections;
import java.util.Hashtable;

public class Edificio {

	private Hashtable<Integer, String> edificio;

	public Edificio() {
		edificio = new Hashtable<>();

	}

	public String ascensor(Persona p, int oficinas) {

		if (p.getOficina() > oficinas) {
			return "La oficina no se encontro en el edificio, " + p.getNombre()
					+ " se quedo encerrado, llamen a los bomberos";
		} else if (edificio.containsKey(p.getOficina())) {
			return p.toString2();
		} else if (!edificio.containsKey(p.getOficina())) {
			edificio.put(p.getOficina(), p.getNombre());
			return p.toString();
		}
		return "";
	}

	public String print(int c) {
		String out = "[";
		for (int i = 0; i <= c; i++) {
			if (edificio.containsKey(i)) {
				out += " " + edificio.get(i);
				if (c > 1 && i < c) {
					out += ",";
				}
			}

		}
		return out + " ]";
	}
	

}
