package com.example.openapiapp.controller

import com.example.openapiapp.communication.dto.PessoaJuridicaDto
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

@Controller('/pessoa-juridica')
class PessoaJuridicaController {

	@Get()
	PessoaJuridicaDto obtemPessoaJuridica() {
		return new PessoaJuridicaDto(
				id: UUID.randomUUID(),
				criadoEm: new Date(),
				atualizadoEm: new Date(),
				razaoSocial: 'Paulo Juridico'
		)
	}

}
