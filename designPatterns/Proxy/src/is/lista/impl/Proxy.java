package is.lista.impl;

import is.lista.Lista;
import is.lista.sicurezza.PermessiUtente;
public class Proxy<E> implements Lista<E>
{
    protected PermessiUtente e;
    protected ListaSuArray<E> lista;
    public Proxy(Lista<E> l, int numLetture, int numScritture)
    {
        if(l == null)
            throw new IllegalArgumentException();
        this.lista = (ListaSuArray<E>) l;
        e = new PermessiUtente(numLetture, numScritture);
    }
    @Override
    public int size() {
        if(lista == null)
            return 0;
        return lista.size();
    }

    @Override
    public boolean contiene(E dato)
    {
        if(e.getNumeroLetture() == 0)
            throw new RuntimeException();
        return false; //continua dopo
    }

    @Override
    public void aggiungi(int index, E dato) throws IndexOutOfBoundsException {

    }

    @Override
    public void aggiungi(E dato) {

    }

    @Override
    public void rimuovi(int index) throws IndexOutOfBoundsException {

    }

    @Override
    public boolean rimuovi(E dato) {
        return false;
    }

    @Override
    public E dammiElemento(int index) throws IndexOutOfBoundsException {
        return null;
    }

    @Override
    public Lista<E> copia() {
        return null;
    }
}
