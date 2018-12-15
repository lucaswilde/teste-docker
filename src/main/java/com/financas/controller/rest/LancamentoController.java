package com.financas.controller.rest;

import java.io.IOException;
import java.time.LocalTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

@RestController
@RequestMapping("/v1/lancamentos")
@CrossOrigin(origins = "*") // ou poderia ser http://localhost:4200 (angular ui), CrossOrigin='Access-Control-Allow-Origin'
public class LancamentoController {

	@GetMapping(path = "/heartbeat", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> heartbeat() throws JsonParseException, JsonMappingException, IOException {
		System.out.println("LancamentoController.heartbeat");
		String retorno = LocalTime.now().toString();
		
		return ResponseEntity.status(HttpStatus.OK).body(retorno);
	}
}
