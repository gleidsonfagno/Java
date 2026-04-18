package zona_fit.dto;

import zona_fit.domain.Client;

import java.util.List;

public interface IClientDto {
    List<ClientDTO> ListClients();
    boolean getClientsForId(Client client);
    boolean addClient(Client client);
    boolean updateClient(Client client);
    boolean deleteClient(Client client);
}
