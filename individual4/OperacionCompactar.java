package aed.individual4;

import java.util.Iterator;

import es.upm.aedlib.Position;
import es.upm.aedlib.positionlist.NodePositionList;
import es.upm.aedlib.positionlist.PositionList;

public class OperacionCompactar {	
	/**
	 * Metodo que reduce los elementos iguales consecutivos de una lista a una 
	 * unica repeticion
	 * @param lista Lista de entrada
	 * @return Lista nueva compactada sin elementos iguales consecutivos
	 */

	public <E> PositionList<E> compactar (Iterable<E> lista) {

		if(lista == null) {
			throw new IllegalArgumentException();
		}

		PositionList<E> Lista = new NodePositionList<E>(); //  Creo lista nueva		
		Iterator<E> it = lista.iterator(); //cursor en lista iterator
		E e; // aqui vamos a guardar los elementos del iterador

		if (!it.hasNext()) return Lista; // si lista es vacia

		e = it.next();// avanzo y guardo el valor en e
		Lista.addLast(e);// meto siempre el primer elemento en la nueva lista
		Position<E> cursor = Lista.last();// Creo cursor y lo pongo en la ultima posicion de la lista

		while (it.hasNext()){
			e = it.next();
			if(!eqNull(e,cursor.element())){
				Lista.addLast(e);
				cursor = Lista.last();
			}
		}
		return Lista;
	}

	public static boolean eqNull (Object o1, Object o2) {
		return (o1 == null && o2 == null) || (o1 != null && o1.equals(o2));
	}
}
