package br.com.IncluStep.IS.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record RequisicaoNovoPessoa(

		@NotBlank @Size(min = 5, max = 250)

		String nomePessoa1,

		@NotBlank String nivelGravidade1, String dataPostada1,

		@NotBlank String descricao1

) {

}
