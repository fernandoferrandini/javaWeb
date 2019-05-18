package testes;

import java.sql.SQLException;

import dao.ClienteDAO;
import modelo.Cliente;

public class TesteEditaDao {
	public static void main(String[] args) throws SQLException {
		
		ClienteDAO dao = new ClienteDAO();
		
		
		
		try {
			
			Cliente cliente = dao.obter((long) 4);
			
			if(cliente != null) {
				/*dados simulados de um form web*/
				cliente.setNome("NomeNovoCliente");
				cliente.setEmail("email@novo.com");
				cliente.setEndereco("novo endere�o");
				//'
				dao.edita(cliente);
				
				System.out.println("Cliente alterado com sucesso!");
				
			}else {
				System.out.println("Cliente n�o encontrado!");
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			dao.close();
			
		}
		
		
	}
}
