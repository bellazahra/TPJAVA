package cigma.pfe.services;

import cigma.pfe.models.Client;
import cigma.pfe.repositories.ClientRepository;
import cigma.pfe.repositories.ClientRepositoryImpl;
import ma.cigma.pfe.dao.ICLIENTDAO;

public class ClientServiceImpl  implements ClientService{
	
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
	public void removeById(long id) {
	dao.deleteById(id);
	}
	
	@Override
	public Client getById(long id) {
	return dao.findById(id);
	}
}
