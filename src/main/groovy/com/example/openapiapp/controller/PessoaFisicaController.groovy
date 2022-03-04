package com.example.openapiapp.controller

import com.example.openapiapp.communication.dto.PessoaFisicaDto
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

@Controller('/pessoa-fisica')
class PessoaFisicaController {

	@Get()
	PessoaFisicaDto obtemPessoaFisica() {
		return new PessoaFisicaDto(
				id: UUID.randomUUID(),
				criadoEm: new Date(),
				atualizadoEm: new Date(),
				nome: 'Paulo'
		)
	}

}
