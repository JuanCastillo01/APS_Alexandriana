package alexandria.api.v0.request;

import java.util.Date;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LivroRequestTO {
	private Long sequencial;
	private String nome;
	private String genero;
	private String author;
	private Date dataPub;

}
