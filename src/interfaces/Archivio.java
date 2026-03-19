package interfaces;

import java.util.TreeSet;

public interface Archivio<T, K> {
	void aggiungi(T elem);
	boolean rimuovi(T elem);
	boolean aggiorna(T elem);
	TreeSet<T> trovaTutti();
	T trovaSingolo(String stringa);

}
