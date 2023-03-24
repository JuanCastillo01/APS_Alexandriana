package alexandria.api.v0.contoller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import alexandria.api.v0.request.LivroRequestTO;
import alexandria.api.v0.response.LivroResponseTO;
import alexandria.core.mapper.LivroMapper;
import alexandria.core.service.LivroService;

@RestController
@RequestMapping("/Cadastro")
public class LivroController {

	@Autowired
	private LivroMapper mapper;
	@Autowired
	private LivroService service;

	public LivroController(LivroMapper mapper, LivroService service) {
		this.mapper = mapper;
		this.service = service;
	}

	@PostMapping("/Livros")
	public LivroResponseTO adicionarLivro(@RequestBody LivroRequestTO request) {
		return mapper.toDomain(service.salvar(mapper.toEntity(request)));
	}
	
	@GetMapping("/Livros")
	public List<LivroResponseTO> listarLivros(){
		return service.listaLivros().stream().map(s-> mapper.toDomain(s)).collect(Collectors.toList());
	}

	@GetMapping("/Livros/{id}")
	public LivroResponseTO buscarPorId(@PathVariable Long id) {
		return mapper.toDomain(service.buscaPorId(id));
	}	

	@GetMapping("/Livros/{nome}")
	public List<LivroResponseTO> buscarPorNome(@PathVariable String nome) {
		return service.buscaPorNome(nome).stream().map(s-> mapper.toDomain(s)).collect(Collectors.toList());
	}
	
	@PutMapping("/Livros/{id}")
	public LivroResponseTO alterarLivro(@RequestBody LivroRequestTO request, @PathVariable Long id) {
		return mapper.toDomain(service.atualizar(mapper.toEntity(request), id));
		
	}
	@DeleteMapping("/Livros/{id}")
	public void deletarLivro(@PathVariable Long id) {
		service.deletar(id);
	}
}
