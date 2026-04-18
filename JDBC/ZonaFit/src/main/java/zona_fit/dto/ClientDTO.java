package zona_fit.dto;

import zona_fit.domain.Client;

import java.util.List;

public class ClientDTO implements IClientDto {

    @Override
    public List<ClientDTO> ListClients() {
        return List.of();
    }

    @Override
    public boolean getClientsForId(Client client) {
        return false;
    }

    @Override
    public boolean addClient(Client client) {
        return false;
    }

    @Override
    public boolean updateClient(Client client) {
        return false;
    }

    @Override
    public boolean deleteClient(Client client) {
        return false;
    }
}
