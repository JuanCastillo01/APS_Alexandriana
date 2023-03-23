package alexandria.core.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import alexandria.core.entity.Livro;

@Repository
public interface LivroRepo extends JpaRepository<Livro,Long>{
	public Livro findBySequencial(Long id);
	public List<Livro> findByNome(String name);
}
