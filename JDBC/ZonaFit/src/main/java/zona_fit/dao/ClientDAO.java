package zona_fit.dao;

import zona_fit.connection.Connect;
import zona_fit.domain.Client;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ClientDAO implements IClientDAO {

    @Override
    public List<Client> ListClients() {
        List<Client> clients = new ArrayList<>();

        PreparedStatement ps;
        ResultSet rs;
        Connection con = Connect.getConnection();

        var sql = "SELECT * FROM cliente ORDER BY id";

        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
               var client = new Client();
               client.setId(rs.getInt("id"));
               client.setName(rs.getString("name"));
               client.setSurname(rs.getString("surname"));
               client.setMembership(rs.getInt("membership"));
               clients.add(client);
            }


        } catch (Exception e) {
            System.out.println("Error listing clients:" + e);
        }
        finally {
            try {
                con.close();
            }catch (Exception e){
                System.out.println("Error close connection: " + e);
            }
        }
        return clients;
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

    public static void main(String[] args) {
        // List clients
        System.out.println("*** Listing Clients...");
        IClientDAO clientDAO = new ClientDAO();
        var clients  = clientDAO.ListClients();
        clients.forEach(System.out::println);
    }
}
