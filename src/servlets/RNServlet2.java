package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ClienteDAO;
import modelo.Cliente;

@SuppressWarnings("serial")
@WebServlet("/rnserletadiciona2")
public class RNServlet2 extends HttpServlet{

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String action = request.getParameter("regra");
		
		ClienteDAO dao = new ClienteDAO();
		
		RequestDispatcher rd = null;
		
		if(action.equals("InsertCliente")) {
			Cliente cliente = new Cliente();
			cliente.setNome(request.getParameter("nome"));
			cliente.setEmail(request.getParameter("email"));
			cliente.setEndereco(request.getParameter("endereco"));
			try {
				dao.inserir(cliente);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				rd = request.getRequestDispatcher("/erro.html");		
				e.printStackTrace();
			}
			rd = request.getRequestDispatcher("/insertclienteok.jsp");
		}else if(action.equals("GetClientes")) {
			//implementacao getclientes
		}else if(action.equals("DeleteCliente")) {
			//implementacao deletecliente
		}
			
		
		rd.forward(request, response);
				
	}
	
	
}
