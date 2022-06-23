package br.com.newgo.caixa.servlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class conexao {
	private String url;
	private String usuario;
	private String senha;
	public Connection con;
	
	
	
	conexao() {
		url = "jdbc:postgresql://localhost:5432/caixa_eletro";
		usuario = "postgres";
		senha = "30276776";		
		
		try {
			
			Class.forName("org.postgresql.Driver");
			con = DriverManager.getConnection(url, usuario, senha);
			System.out.println("Nem acredito que deu certo!!");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	public int cadastraClient(Client client) {
		try {
			String sql = "INSERT into cliente (id, nome, phone, endereco, cpf, cartao, senha, saldo)"
					+ " values (default, ?, ?, ?, ?, ?, ?, ?)";
			
			Statement stm = con.createStatement();
			PreparedStatement prepareStatement = con.prepareStatement(sql);
			prepareStatement.setString(1, client.getNome());
			prepareStatement.setString(2, client.getPhone());
			prepareStatement.setString(3, client.getEndereco());
			prepareStatement.setString(4, client.getCpf());
			prepareStatement.setString(5, client.getCartao());
			prepareStatement.setString(6, client.getSenha());
			prepareStatement.setString(7, client.getSaldo());
			prepareStatement.executeUpdate();
			//int res = stm.executeUpdate(sql);
			con.close();
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}
	
	public int apagaClient(Client client) {
		try {
			String sql = "DELETE FROM cliente WHERE id = ?";
			
			Statement stm = con.createStatement();
			PreparedStatement prepareStatement = con.prepareStatement(sql);
			prepareStatement.setInt(1, client.getId());
			prepareStatement.executeUpdate();
			con.close();
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}
	
	public ResultSet executaBusca(String sql) {
		try {
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery(sql);
			con.close();
			return rs;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	}
	
