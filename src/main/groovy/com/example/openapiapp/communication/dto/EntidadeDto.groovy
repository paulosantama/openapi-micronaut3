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
abstract class EntidadeDto {

	@NotNull
	private UUID id

	private Long tenantId

	private Integer version

	@NotNull
	private Date criadoEm

	@NotNull
	private Date atualizadoEm

	UUID getId() {
		return id
	}

	void setId(UUID id) {
		this.id = id
	}

	Long getTenantId() {
		return tenantId
	}

	void setTenantId(Long tenantId) {
		this.tenantId = tenantId
	}

	Integer getVersion() {
		return version
	}

	void setVersion(Integer version) {
		this.version = version
	}

	Date getCriadoEm() {
		return criadoEm
	}

	void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm
	}

	Date getAtualizadoEm() {
		return atualizadoEm
	}

	void setAtualizadoEm(Date atualizadoEm) {
		this.atualizadoEm = atualizadoEm
	}

}
