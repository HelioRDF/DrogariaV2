package br.com.drogaria.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import br.com.drogaria.domain.Fabricante;
import br.com.drogaria.util.HibernateUtil;

public class FabricanteDAO {

	public void salvar(Fabricante fabricante) {

		Session sessao = HibernateUtil.getSessionFactory().openSession();
		Transaction transacao = null;

		try {
			transacao = sessao.beginTransaction();
			sessao.save(fabricante);
			transacao.commit(); // Confirma transa��o.
			
		} catch (RuntimeException ex) {

			if (transacao != null) {
				transacao.rollback(); // Desfaz a transa��o caso entre no catch
			}
		
		} finally {
			sessao.close();
		}

	}

}
