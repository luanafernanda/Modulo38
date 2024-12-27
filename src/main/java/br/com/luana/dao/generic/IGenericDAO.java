
package br.com.luana.dao.generic;

import java.io.Serializable;
import java.util.Collection;

import br.com.luana.domain.Persistente;
import br.com.luana.exceptions.DAOException;
import br.com.luana.exceptions.MaisDeUmRegistroException;
import br.com.luana.exceptions.TableException;
import br.com.luana.exceptions.TipoChaveNaoEncontradaException;


public interface IGenericDAO <T extends Persistente, E extends Serializable> {

	

    public T cadastrar(T entity) throws TipoChaveNaoEncontradaException, DAOException;

    
    public void excluir(T entity) throws DAOException;

    
    public T alterar(T entity) throws TipoChaveNaoEncontradaException, DAOException;

    
    public T consultar(E id) throws MaisDeUmRegistroException, TableException, DAOException;

    
    public Collection<T> buscarTodos() throws DAOException;
}