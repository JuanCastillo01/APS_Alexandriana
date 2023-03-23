package alexandria.controller.v0.api.response;

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
