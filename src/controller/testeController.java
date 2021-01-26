package controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import dao.PessoaDAO;
import model.Pessoa;

@Path("/teste")
public class testeController {

	@GET
	@Path("/save")
	@Produces("text/plain")
	public String metodo(){
		/*Pessoa p = new Pessoa();
		p.setNome("Teste");
		p.setCidade("RJ");
		PessoaDAO pDAO = new PessoaDAO();
		pDAO.Salvar(p);*/
		return "ok";
	}
}
