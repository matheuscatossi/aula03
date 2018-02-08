package test.br.edu.impacta.ads;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import br.edu.impacta.ads.Contato;
import br.edu.impacta.ads.ContatoDaoArquivo;

public class GenericTest {

	ContatoDaoArquivo cdao;

	@Test
	public void testTest() {
		ContatoDaoArquivo cdao = new ContatoDaoArquivo("contatos.txt");
		List <Contato> lista = cdao.lerTodos();
		assertNotNull("NÃ£o existe um arquivo de dados.", lista);
	}
	

	@Test
	public void testegravar() {
		ContatoDaoArquivo cdao = new ContatoDaoArquivo("contatos.txt");
		
		ArrayList<Contato> contatos = new ArrayList<Contato>(); 
		
		contatos.add(new Contato("Matheus Catossi", "1234567987"));
		
		boolean result = cdao.gravar(contatos);
		assertTrue("Result: " + ( result ? "Success" : "Error"), result ? true : false);
	}
}
