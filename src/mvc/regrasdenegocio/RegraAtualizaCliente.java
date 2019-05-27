package mvc.regrasdenegocio;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ClienteDAO;
import modelo.Cliente;

public class RegraAtualizaCliente implements Regra{

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		
		
		Cliente cliente = new Cliente();
		
		cliente.setId(Long.parseLong(request.getParameter("id")));		
		cliente.setNome(request.getParameter("nome"));
		cliente.setEmail(request.getParameter("email"));
		cliente.setEndereco(request.getParameter("endereco"));

		ClienteDAO dao = new ClienteDAO();
		
		dao.edita(cliente);
		
		
		return "/mvc?regra=RegraGetClientes";
	}

}
