package br.com.server.dto;

import com.fasterxml.jackson.databind.ObjectMapper;

public class AbstractDTO {

	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String toJson() throws Exception {
		ObjectMapper mapper = new ObjectMapper();
		return mapper.writeValueAsString(this);
	}
}
