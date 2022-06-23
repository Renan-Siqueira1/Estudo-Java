package br.com.newgo.caixa.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MostraCliente")
public class MostraCliente extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String paramId = request.getParameter("id");
		Integer id = Integer.valueOf(paramId);
		
		conexao con = new conexao();	
		Client client = con.buscaClient(id);
		
		System.out.println(client.getNome());
		
		request.setAttribute("client", client);
		
		RequestDispatcher rd = request.getRequestDispatcher("/atualizarDadosClientes.jsp");
		
		rd.forward(request, response);
	}

}
