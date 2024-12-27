
package br.com.luana.service;

import java.util.List;

import br.com.luana.domain.Cliente;
import br.com.luana.exceptions.DAOException;
import br.com.luana.services.generic.IGenericService;


public interface IClienteService extends IGenericService<Cliente, Long> {

	Cliente buscarPorCPF(Long cpf) throws DAOException;

	List<Cliente> filtrarClientes(String query);

}