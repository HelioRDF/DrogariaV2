package br.com.drogaria.test;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import br.com.drogaria.dao.FabricanteDAO;
import br.com.drogaria.domain.Fabricante;

public class FabricanteDAOTest {

	@Test
	@Ignore
	public void salvar() {

		FabricanteDAO dao = new FabricanteDAO();

		Fabricante f1 = new Fabricante();
		f1.setDescricao("Descrição f1");
		dao.salvar(f1);

		Fabricante f2 = new Fabricante();
		f2.setDescricao("Descrição f2");
		dao.salvar(f2);

		Fabricante f3 = new Fabricante();
		f3.setDescricao("Descrição f3");
		dao.salvar(f3);

	}

	@SuppressWarnings("unused")
	@Test
	@Ignore
	public void listar() {

		FabricanteDAO dao = new FabricanteDAO();
		List<Fabricante> fabricantes = dao.listar();

		for (Fabricante fabricante : fabricantes) {

			System.out.println(fabricante.toString());

		}

	}

	@Test
	public void buscarPorCodigo() {
		
		FabricanteDAO dao = new FabricanteDAO();
		
		Fabricante f1 = dao.buscarPorCodigo(3l);
		Fabricante f2 = dao.buscarPorCodigo(5l);
		
		System.out.println("F1"+f1);

		System.out.println("F2"+f2);

	}

}
