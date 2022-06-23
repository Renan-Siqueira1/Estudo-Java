package br.com.newgo.caixa.servlet;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/NovoClient")
public class NovoClient extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Object connection;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("Novo cliente cadastrado!");
		String nomeClient = request.getParameter("nome");
		String phoneClient = request.getParameter("phone");
		String enderecoClient = request.getParameter("endereco");
		String cpfClient = request.getParameter("cpf");
		String cartaoClient = request.getParameter("cartao");
		String senhaClient = request.getParameter("senha");

		Client client = new Client();
		client.setNome(nomeClient);
		client.setPhone(phoneClient);
		client.setEndereco(enderecoClient);
		client.setCpf(cpfClient);
		client.setCartao(cartaoClient);
		client.setSenha(senhaClient);
		client.setSaldo("0.0");

		conexao con = new conexao();		
		
		int res = con.cadastraClient(client);
		if (res > 0) {
			System.out.println("Cadastrado com sucesso!");
		} else {
			System.out.println("Falha no cadastro.");
		}

		response.sendRedirect("ListClients");

	}

}
