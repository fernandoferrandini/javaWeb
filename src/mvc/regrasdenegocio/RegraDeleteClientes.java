package mvc.regrasdenegocio;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ClienteDAO;
import modelo.Cliente;

public class RegraDeleteClientes implements Regra {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		Long id = Long.parseLong(request.getParameter("id"));
		ClienteDAO dao = new ClienteDAO();
		Cliente cliente = dao.obter(id);
		if(cliente != null) {
			dao.deleta(cliente);
			System.out.println("Cliente Id: " + cliente.getId().toString() + " deletado!");
			return "clientedeletado.jsp";
		}else return "clientenaoencontrado.jsp";
		
	}

	
}
