package ma.cigma.pfe.dao;

import ma.cigma.pfe.dao.ICLIENTDAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import cigma.pfe.models.Client;


public  class CLIENTDAOIMPL  implements ICLIENTDAO{
	
	EntityManagerFactory emf= Persistence.createEntityManagerFactory("unit_clients");
			EntityManager em=emf.createEntityManager();
	
	private ICLIENTDAO dao;
	public void setDao(ICLIENTDAO dao) {
	this.dao = dao;
	}
	@Override
	public Client save(Client c) {
	return dao.save(c);
	}
	@Override

	public Client modify(Client c) {
		return dao.update(c);
		}
	
	@Override
	public void deleteById(long idClient) {
	em.getTransaction().begin();
	Client clientInDataBase = em.find(Client.class,idClient);
	em.remove(clientInDataBase);
	em.getTransaction().commit();
	}
	
	@Override
	public Client findById(long idClient) {
	return em.find(Client.class,idClient);
	}
	
	

}
