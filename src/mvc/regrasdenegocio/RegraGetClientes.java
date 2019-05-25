package mvc.regrasdenegocio;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ClienteDAO;

public class RegraGetClientes implements Regra{

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		request.setAttribute("clientes", new ClienteDAO().getClientes());
		
		//return "testjstl2.jsp";
		return "/WEB-INF/pages/testjstl2.jsp";
	}

}
