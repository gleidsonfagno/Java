package zona_fit.dao;

import zona_fit.domain.Client;

import java.util.List;

public interface IClientDAO {
    List<Client> ListClients();
    boolean getClientsForId(Client client);
    boolean addClient(Client client);
    boolean updateClient(Client client);
    boolean deleteClient(Client client);
}
