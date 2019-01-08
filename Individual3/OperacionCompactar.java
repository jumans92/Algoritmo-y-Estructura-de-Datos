package aed.Individual3;

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
	public <E> PositionList<E> compactar (PositionList<E> lista) {
		
		if(lista == null) {
			throw new IllegalArgumentException();
			} //Si lista es null
		
		PositionList<E> res = new NodePositionList<E>(); //  Creo lista nueva
		
		if (lista.size() == 0) {
			return res;// si lista {} 
		}
		
		Position<E> c1 = lista.first();
		Position<E> c2 = lista.next(c1);
		
		res.addLast(c1.element());//añadimos a la lista el elemento que tiene cursor

		while(c2 != null) {
			if(!eqNull(c1.element(),c2.element())) {
				res.addLast(c2.element());
				}//Fin if	
					c1 = lista.next(c1);
					c2 = lista.next(c2);	
			}//FIN WHILE
		return res;
		}//FIN COMPACTAR
	
	private static boolean eqNull (Object o1, Object o2) {
		return (o1 == null && o2 == null) || (o1!=null && o1.equals(o2)); // si la lista puede tener nulos
		
	}
}


