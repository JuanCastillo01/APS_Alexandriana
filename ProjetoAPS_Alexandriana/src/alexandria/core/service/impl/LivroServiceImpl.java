package alexandria.core.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import alexandria.core.entity.Livro;
import alexandria.core.repository.LivroRepo;
import alexandria.core.service.LivroService;

@Service
public class LivroServiceImpl implements LivroService{

	@Autowired
	private LivroRepo repository;
	
	@Override
	public Livro salvar(Livro entity) {
		return repository.save(entity);
	}

	@Override
	public Livro atualizar(Livro entity, Long id) {
		entity.setSequencial(id);
		return repository.save(entity);
	}

	@Override
	public void deletar(Long id) {
		repository.deleteById(id);
	}

	@Override
	public Livro buscaPorId(Long id) {
		return repository.findBySequencial(id);
	}

	@Override
	public List<Livro> buscaPorNome(String nome) {
		return repository.findByNome(nome);
	}

	@Override
	public List<Livro> listaLivros() {
		return repository.findAll();
	}

}
