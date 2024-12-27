
package br.com.luana.service;

import java.util.List;

import br.com.luana.domain.Produto;
import br.com.luana.services.generic.IGenericService;


public interface IProdutoService extends IGenericService<Produto, String> {

	List<Produto> filtrarProdutos(String query);

}