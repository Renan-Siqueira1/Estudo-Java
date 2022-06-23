package br.com.newgo.caixa.servlet;

public class TesteConexao {

	public static void main(String[] args, Client client) {

		// DELETE

		/*
		 * conexao con = new conexao(); String sql =
		 * "DELETE FROM cliente WHERE id = 8, 10, 11, 12, 13, 14, 15, 16, 17";
		 * 
		 * int res = con.cadastraClient(client); if (res > 0) {
		 * System.out.println("Cadastrado com sucesso!"); } else {
		 * System.out.println("Falha no cadastro."); }
		 */

		// UPDATE

		/*
		 * conexao con = new conexao(); String sql = "UPDATE cliente " +
		 * "SET saldo = '30.000' " + "WHERE id = 10";
		 * 
		 * 
		 * int res = con.execultaSQL(sql); if(res > 0) {
		 * System.out.println("Cadastrado com sucesso!"); }else {
		 * System.out.println("Falha no cadastro."); }
		 */

		// ADD

		/*
		 * conexao con = new conexao(); String sql =
		 * "INSERT into cliente (id, nome, phone, endereco, cpf, cartao, senha, saldo)"
		 * +
		 * " values (default, 'Cauan Oliveira', '(12)999999999', 'Rua Oloco', '123.456.789-63', '12345678901234567', '1234', '2.200')"
		 * ;
		 * 
		 * int res = con.execultaSQL(sql); if(res > 0) {
		 * System.out.println("Cadastrado com sucesso!"); }else {
		 * System.out.println("Falha no cadastro."); }
		 */

		// BUSCA

		/*
		 * conexao con = new conexao(); String sql =
		 * "Select * from cliente WHERE id = 6"; ResultSet rs = con.executaBusca(sql);
		 * 
		 * try { while (rs.next()) { int id = rs.getInt("id"); String nome =
		 * rs.getString("nome"); String phone = rs.getString("phone"); String endereco =
		 * rs.getString("endereco"); String cpf = rs.getString("cpf"); String cartao =
		 * rs.getString("cartao"); String senha = rs.getString("senha"); String saldo =
		 * rs.getString("saldo");
		 * 
		 * System.out.println(id + " - " + nome + " - " + phone + " - " + endereco +
		 * " - " + cpf + " - " + cartao + " - " + senha + " - " + saldo); } } catch
		 * (Exception e) { e.printStackTrace(); }
		 */

	}

}
