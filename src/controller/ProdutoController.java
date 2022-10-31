package controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import dao.ProdutoDAO;
import model.Produto;

@Controller
public class ProdutoController {
	
	@GetMapping("/cadastraproduto")
	public String cadastrarProduto() {
		
		return "cadastraproduto";
		
	}
	
	@PostMapping("/cadastraproduto")
	public String cadastrarProdutoPost(HttpServletRequest req,Model model) {
		
		String descricao = req.getParameter("descricao");
		double quantidade = Double.parseDouble(req.getParameter("quantidade"));
		double valor = Double.parseDouble(req.getParameter("valor"));
		
		Produto p = new Produto();
		p.setDescricao(descricao);
		p.setQuantidade(quantidade);
		p.setValor(valor);
		
		ProdutoDAO dao = new ProdutoDAO();
		model.addAttribute("texto", dao.salvar(p));
		
		return "mensagem";
		
	}
	
	@GetMapping("/listarprodutos")
	public String listarProdutos(Model model) {
		ProdutoDAO dao = new ProdutoDAO();
		model.addAttribute("listaProdutos", dao.listarTodos());
		
		return "listagemprodutos";	
	}
	
	

}
