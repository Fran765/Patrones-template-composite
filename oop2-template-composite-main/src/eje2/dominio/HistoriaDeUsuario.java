package eje2.dominio;

import java.util.ArrayList;
import java.util.List;

public class HistoriaDeUsuario extends ItemDeTrabajo {

	private List<ItemDeTrabajo> listaDeItems;

	public HistoriaDeUsuario(String nombre) {
		super(nombre);
		this.listaDeItems = new ArrayList<ItemDeTrabajo>();
	}

	public void agregarItem(ItemDeTrabajo item) {
		this.listaDeItems.add(item);
	}

	@Override
	public Integer tiempoNecesario() {
		Integer tiempoRequerido = 0;
		for (ItemDeTrabajo item : listaDeItems) {
			tiempoRequerido += item.tiempoNecesario();
		}
		return tiempoRequerido;
	}

}
