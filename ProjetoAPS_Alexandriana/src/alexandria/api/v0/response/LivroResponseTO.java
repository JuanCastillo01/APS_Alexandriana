package alexandria.api.v0.response;

import java.util.Date;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LivroResponseTO {
	private Long sequencial;
	private String nome;
	private String genero;
	private String author;
	private Date dataPub;

}
