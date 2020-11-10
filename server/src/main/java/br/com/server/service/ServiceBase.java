package br.com.server.service;

import java.util.List;

import br.com.server.dto.AbstractDTO;

public interface ServiceBase {

	List<AbstractDTO> toDTOs();
}
