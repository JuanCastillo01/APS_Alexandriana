package alexandria.core.mapper;

import org.mapstruct.Mapper;

import alexandria.api.v0.request.LivroRequestTO;
import alexandria.api.v0.response.LivroResponseTO;
import alexandria.core.entity.Livro;

@Mapper
public interface LivroMapper {
	public LivroResponseTO toDomain(Livro entity);
	public Livro toEntity(LivroRequestTO request);

}
