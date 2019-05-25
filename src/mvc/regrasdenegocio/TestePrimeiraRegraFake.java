package mvc.regrasdenegocio;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestePrimeiraRegraFake implements Regra{

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Executando a Regra de Negocio Fake");
		return "testeprimeiraregrafake.jsp";
	}

}
