package br.com.newgo.caixa.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AlteraClient")
public class AlteraClient extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		System.out.println("Atualizando dados do Cliente!");
		String nomeClient = request.getParameter("nome");
		String phoneClient = request.getParameter("phone");
		String enderecoClient = request.getParameter("endereco");
		String cpfClient = request.getParameter("cpf");
		String cartaoClient = request.getParameter("cartao");
		String senhaClient = request.getParameter("senha");
		String idClient = request.getParameter("id");
		Integer id = Integer.valueOf(idClient);
		
		System.out.println(id);
		
		/*
		 * Banco banco = new Banco(); Client client = banco.buscaClient(id);
		 * 
		 * client.setNome(nomeClient); client.setPhone(phoneClient);
		 * client.setEndereco(enderecoClient); client.setCpf(cpfClient);
		 * client.setCartao(cartaoClient); client.setSenha(senhaClient);
		 */
		
		response.sendRedirect("ListClients");
		
		
	}

}
