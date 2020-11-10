package br.com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.server.dto.AbstractDTO;
import br.com.server.model.EntityBaseRoot;
import br.com.server.service.ServiceBase;

@Controller
@RequestMapping(value = "/api")
public class ControllerBase<TEntity extends EntityBaseRoot> {

	@Autowired
	private ServiceBase service;

	@RequestMapping(method = RequestMethod.GET)
	public List<AbstractDTO> list() {
		return service.toDTOs();
	}
//
//	@RequestMapping(method = RequestMethod.POST)
//	public TEntity save(@RequestBody TEntity entity) {
//		return service.save(entity);
//	}
}
