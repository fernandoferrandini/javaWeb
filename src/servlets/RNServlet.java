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
@WebServlet("/rnserletadiciona")
public class RNServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//PrintWriter out = response.getWriter();
		ClienteDAO dao = new ClienteDAO();
		Cliente cliente = new Cliente();
		
		String nome = request.getParameter("nome");
		String email = request.getParameter("email");
		String endereco = request.getParameter("endereco");
		
		
		cliente.setNome(nome);
		cliente.setEmail(email);
		cliente.setEndereco(endereco);
		
		try {
			dao.inserir(cliente);
			RequestDispatcher rd = request.getRequestDispatcher("insertclienteok.jsp");
			rd.forward(request, response);
			//out.println("<html><body><h1>Cliente inserido</h1><table><tr><td>Nome:</td><td>"+nome+"</td></tr><tr><td>Email:</td><td>"+email+"</td></tr><tr><td>Endereco:</td><td>"+endereco+"</td></tr></table></body></html>");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			//out.println("<html><body><h1>Erro ao adicionar cliente </h1></body></html>");
			e.printStackTrace();
		}
		
		
		
		

		
		
				
		
		
		
		
	}
	
	
}
