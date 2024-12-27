
package br.com.luana.dao;

import java.util.List;

import br.com.luana.dao.generic.IGenericDAO;
import br.com.luana.domain.Produto;


public interface IProdutoDAO extends IGenericDAO<Produto, String>{

	List<Produto> filtrarProdutos(String query);

}