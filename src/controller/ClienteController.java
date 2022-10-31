package controller;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import dao.ClienteDAO;
import model.Cliente;

@Controller
public class ClienteController {

		@GetMapping("/cadastracliente")
		public String cadastrarCliente() {
			
			return "cadastracliente";
			
		}
		
		@PostMapping("/cadastracliente")
		public String cadastrarProdutoPost(HttpServletRequest req,Model model) {
			
			String nome = req.getParameter("nome");
			String cpf = req.getParameter("cpf");
			String email = req.getParameter("email");
			String telefone = req.getParameter("telefone");
			String celular = req.getParameter("celular");
			String option = req.getParameter("option");
			int cep = Integer.parseInt(req.getParameter("cpf"));
			String uf = req.getParameter("uf");
			String cidade = req.getParameter("cidade");
			String rua = req.getParameter("rua");
			String numero = req.getParameter("numero");
			String bairro = req.getParameter("bairro");





			
			Cliente c = new Cliente();
			c.setNome(nome);
			c.setCpf(cpf);
			c.setEmail(email);
			c.setTelefone(telefone);
			c.setCelular(celular);
			c.setOption(option);
			c.setCep(cep);
			c.setUf(uf);
			c.setCidade(cidade);
			c.setRua(rua);
			c.setNumero(numero);
			c.setBairro(bairro);





			ClienteDAO dao = new ClienteDAO();
			model.addAttribute("texto", dao.salvar(c));
			
			return "mensagem";
			
		}
		
		@GetMapping("/listarclientes")
		public String listarProdutos(Model model) {
			ClienteDAO dao = new ClienteDAO();
			model.addAttribute("listaClientes", dao.listarTodos());
			
			return "listagemclientes";	
		}
		
		

	}


