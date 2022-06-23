package br.com.newgo.caixa.servlet;

import java.io.IOException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ListClients")
public class ListClients extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		conexao con = new conexao();
		String sql = "Select * from cliente ";
		ResultSet rs = con.executaBusca(sql);

		List<Client> clientes = new ArrayList<>();
		try {
			
			while (rs.next()) {
				Client cliente = new Client();
				cliente.setId(rs.getInt("id"));
				cliente.setNome(rs.getString("nome"));
				cliente.setPhone(rs.getString("phone"));
				cliente.setEndereco(rs.getString("endereco"));
				cliente.setCpf(rs.getString("cpf"));
				cliente.setCartao(rs.getString("cartao"));
				cliente.setSenha(rs.getString("senha"));
				cliente.setSaldo(rs.getString("saldo"));
				clientes.add(cliente);

			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		RequestDispatcher rd = request.getRequestDispatcher("/listClients.jsp");
		request.setAttribute("clientes", clientes);
		rd.forward(request, response);

	}

}
