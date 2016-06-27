package br.com.drogaria.test;

import org.junit.Test;

import br.com.drogaria.dao.FabricanteDAO;
import br.com.drogaria.domain.Fabricante;

public class FabricanteDAOTest {

	@Test
	public void salvar() {
		
		
		FabricanteDAO dao = new FabricanteDAO();
		
		Fabricante f1 = new Fabricante();
		f1.setDescricao("Descri��o f1");
		dao.salvar(f1);

		Fabricante f2 = new Fabricante();
		f2.setDescricao("Descri��o f2");
		dao.salvar(f2);

		Fabricante f3 = new Fabricante();
		f3.setDescricao("Descri��o f3");
		dao.salvar(f3);


		
		
		
		
		
		
		
	}
}
