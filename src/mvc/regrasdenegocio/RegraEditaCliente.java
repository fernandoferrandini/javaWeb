package mvc.regrasdenegocio;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ClienteDAO;

public class RegraEditaCliente implements Regra{

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		
		Long id = Long.parseLong(request.getParameter("id"));
		
		request.setAttribute("cliente", new ClienteDAO().obter(id));
		
		return "editacliente.jsp";
	}

}
