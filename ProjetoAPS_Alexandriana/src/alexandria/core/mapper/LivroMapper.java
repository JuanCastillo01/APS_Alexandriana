package alexandria.core.mapper;

import org.mapstruct.Mapper;

import alexandria.controller.v0.api.request.LivroRequestTO;
import alexandria.controller.v0.api.response.LivroResponseTO;
import alexandria.core.entity.Livro;

@Mapper
public interface LivroMapper {
	public LivroResponseTO toDomain(Livro entity);
	public Livro toEntity(LivroRequestTO request);

}
