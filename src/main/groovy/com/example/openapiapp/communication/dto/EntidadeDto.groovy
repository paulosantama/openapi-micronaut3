package com.example.openapiapp.communication.dto

import groovy.transform.CompileStatic
import io.micronaut.core.annotation.Introspected
import io.swagger.v3.oas.annotations.media.Schema

import javax.validation.constraints.NotNull

@Introspected
@CompileStatic
@Schema(
		name = 'Entidade'
)
class EntidadeDto {

	@NotNull
	UUID id

	Long tenantId

	Integer version

	@NotNull
	Date criadoEm

	@NotNull
	Date atualizadoEm

}
