package com.example.openapiapp.communication.dto

import groovy.transform.CompileStatic
import io.micronaut.core.annotation.Introspected
import io.swagger.v3.oas.annotations.media.Schema

@Introspected
@CompileStatic
@Schema(
		name = 'PessoaJuridica',
		allOf = [EntidadeDto]
)
class PessoaJuridicaDto extends EntidadeDto {

	String razaoSocial

	String nomeFantasia

	String CNPJ

}
