package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Factory.Conexao;
import model.Produto;

public class ProdutoDAO {
    private Connection con;
    
    public ProdutoDAO() {
    	Conexao c = new Conexao();
    	con = c.getConexao();
    } 
    
    public String salvar(Produto p) {
    	String sql = "INSERT INTO produto(descricao,quantidade,valor)" +
                      "VALUES(?,?,?)";
    	try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, p.getDescricao());
			ps.setDouble(2, p.getQuantidade());
			ps.setDouble(3, p.getValor());
			ps.execute();
			ps.close();
			return "Produto salvo com �xito";
		} catch (SQLException e) {
			e.printStackTrace();
			return"Houve um erro! Tente novamente"+ e.getMessage();
		}
    }
    
    public List<Produto> listarTodos(){
    	
    	List<Produto> listaProdutos = new ArrayList<>();
    	String sql = "SELECT * FROM produto";
    	try {
    		
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				
				Produto p = new Produto();
				p.setCodigo(rs.getInt("codigo"));
				p.setDescricao(rs.getString("descricao"));
				p.setQuantidade(rs.getDouble("quantidade"));
				p.setValor(rs.getDouble("valor"));
				listaProdutos.add(p);
				
			}
			ps.close();
			return listaProdutos;
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
			return null;
			
		}
    	
    }
    
    public Produto getProdutoPorCodigo(int codigo) {
    	String sql = " SELECT * FROM produto " + " WHERE codigo = ?";
    	Produto p = new Produto();
    	try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, codigo);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				p.setCodigo(rs.getInt("codigo"));
				p.setDescricao(rs.getString("descricao"));
				p.setQuantidade(rs.getDouble("quantidade"));
				p.setValor(rs.getDouble("valor"));
			};
			ps.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
    	return p;
    }
    
}

