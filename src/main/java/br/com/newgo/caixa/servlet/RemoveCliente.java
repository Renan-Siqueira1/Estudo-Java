package br.com.newgo.caixa.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RemoveCliente")
public class RemoveCliente extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String paramId = request.getParameter("id");
		Integer id = Integer.valueOf(paramId);

		conexao con = new conexao();
		String sql = "DELETE FROM cliente WHERE id = 9";

		int res = con.apagaClient(sql);
		if (res > 0) {
			System.out.println("Cadastrado com sucesso!");
		} else {
			System.out.println("Falha no cadastro.");
		}

		response.sendRedirect("ListClients");
	}

}
