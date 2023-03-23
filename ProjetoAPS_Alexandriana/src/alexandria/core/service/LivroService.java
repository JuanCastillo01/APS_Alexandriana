package alexandria.core.service;

import java.util.List;

import org.springframework.stereotype.Service;

import alexandria.core.entity.Livro;

@Service
public interface LivroService{
	public Livro salvar(Livro entity);
	public Livro atualizar(Livro entity, Long id);
	public void deletar(Long id);
	public Livro buscaPorId(Long id);
	public List<Livro> buscaPorNome(String nome);
	public List<Livro> listaLivros();
}