package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Factory.Conexao;
import model.Cliente;

public class ClienteDAO {
    private Connection con;
    
    public ClienteDAO() {
    	Conexao c = new Conexao();
    	con = c.getConexao();
    } 
    
    public String salvar(Cliente c) {
    	String sql = "INSERT INTO cliente(nome,cpf,email, telefone, celular, option, cep, uf, cidade, rua, numero,  bairro)" +
                      "VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";
    	try {
			PreparedStatement cs = con.prepareStatement(sql);
			cs.setString(1, c.getNome());
			cs.setString(2, c.getCpf());
			cs.setString(3, c.getEmail());
			cs.setString(4, c.getTelefone());
			cs.setString(5, c.getCelular());
			cs.setString(6, c.getOption());
			cs.setInt(7, c.getCep());
			cs.setString(8, c.getUf());
			cs.setString(9, c.getCidade());
			cs.setString(10, c.getRua());
			cs.setString(11, c.getNumero());
			cs.setString(12, c.getBairro());
			cs.execute();
			cs.close();
			return "Cliente salvo com �xito";
		} catch (SQLException e) {
			e.printStackTrace();
			return"Houve um erro! Tente novamente"+ e.getMessage();
		}
    }
    
    public List<Cliente> listarTodos(){
    	
    	List<Cliente> listaClientes = new ArrayList<>();
    	String sql = "SELECT * FROM cliente";
    	try {
    		
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				
				Cliente c = new Cliente();
				c.setCodigo(rs.getInt("codigo"));
				c.setNome(rs.getString("nome"));
				c.setCpf(rs.getString("cpf"));
				c.setEmail(rs.getString("email"));
				c.setTelefone(rs.getString("telefone"));
				c.setCelular(rs.getString("celular"));
				c.setOption(rs.getString("option"));
				c.setCep(rs.getInt("cep"));
				c.setUf(rs.getString("uf"));
				c.setCidade(rs.getString("cidade"));
				c.setRua(rs.getString("rua"));
				c.setNumero(rs.getString("numero"));
				c.setBairro(rs.getString("bairro"));

				listaClientes.add(c);
				
			}
			ps.close();
			return listaClientes;
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
			return null;
			
		}
    	
    }
    
    public Cliente getClientePorCodigo(int codigo) {
    	String sql = " SELECT * FROM cliente " + " WHERE codigo = ?";
    	Cliente c = new Cliente();
    	try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, codigo);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				c.setCodigo(rs.getInt("codigo"));
				c.setNome(rs.getString("nome"));
				c.setCpf(rs.getString("cpf"));
				c.setEmail(rs.getString("email"));
				c.setTelefone(rs.getString("telefone"));
				c.setCelular(rs.getString("celular"));
				c.setOption(rs.getString("option"));
				c.setCep(rs.getInt("cep"));
				c.setUf(rs.getString("uf"));
				c.setCidade(rs.getString("cidade"));
				c.setRua(rs.getString("rua"));
				c.setNumero(rs.getString("numero"));
				c.setBairro(rs.getString("bairro"));
			};
			ps.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
    	return c;
    }
    
}
