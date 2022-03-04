package com.example.openapiapp.communication.dto

import groovy.transform.CompileStatic
import io.micronaut.core.annotation.Introspected
import io.swagger.v3.oas.annotations.media.Schema

@Introspected
@CompileStatic
@Schema(
		name = 'PessoaFisica',
		allOf = [EntidadeDto]
)
class PessoaFisicaDto extends EntidadeDto {

	String nome

	String nomeMae

	String nomePai

	String CPF

}
