
package br.com.luana.dao;

import java.util.List;

import br.com.luana.dao.generic.IGenericDAO;
import br.com.luana.domain.Cliente;


public interface IClienteDAO extends IGenericDAO<Cliente, Long>{

	List<Cliente> filtrarClientes(String query);

}