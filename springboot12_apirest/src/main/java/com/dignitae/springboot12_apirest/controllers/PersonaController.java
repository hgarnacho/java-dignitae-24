package com.dignitae.springboot12_apirest.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dignitae.springboot12_apirest.entities.PersonaEntity;
import com.dignitae.springboot12_apirest.entities.services.PersonaService;


@RestController
@RequestMapping("/api/v1")
public class PersonaController {
	@Autowired
	private PersonaService ps;
	
	@GetMapping(value="/personas")
	public ResponseEntity<Object> get(){ 
		Map<String, Object> map = new HashMap<String, Object>();
		try {
			List<PersonaEntity> list  = ps.findAll();
			return new ResponseEntity<Object>(list,HttpStatus.OK);
		} 
		catch (Exception e) {
			map.put("message", e.getMessage());
			return new ResponseEntity<>( map, HttpStatus.INTERNAL_SERVER_ERROR);
		} 
 	}
	
	@GetMapping(value="/personas/{id}")
	public ResponseEntity<Object> getById(@PathVariable Long id){ 
		try {
			PersonaEntity pe  = ps.findById(id);
			return new ResponseEntity<Object>(pe,HttpStatus.OK);
		} 
		catch (Exception e) {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("message", e.getMessage());
			return new ResponseEntity<>( map, HttpStatus.INTERNAL_SERVER_ERROR);
		} 
 	}

	@PostMapping(value="/personas")
	public ResponseEntity<Object> create(@RequestBody PersonaEntity pe){ 
		Map<String, Object> map = new HashMap<String, Object>();
		try {
			PersonaEntity peResult = this.ps.save(pe);  
			return new ResponseEntity<Object>(peResult,HttpStatus.OK);
		} 
		catch (Exception e) {
			map.put("message", e.getMessage());
			return new ResponseEntity<>( map, HttpStatus.INTERNAL_SERVER_ERROR);
		} 
 	}
	
	@PutMapping("/personas/{id}")
	public ResponseEntity<Object> update(@RequestBody PersonaEntity pe, @PathVariable Long id){ 
		Map<String, Object> map = new HashMap<String, Object>();
		try {			
			PersonaEntity peResultFind = this.ps.findById(id);
			
			peResultFind.setNombre(pe.getNombre());
			peResultFind.setEmail(pe.getEmail());
			peResultFind.setTelefono(pe.getTelefono()); 
			
			PersonaEntity peResultSave = this.ps.save(peResultFind);
			
			return new ResponseEntity<Object>(peResultSave,HttpStatus.OK);
		} 
		catch (Exception e) {
			map.put("message", e.getMessage());
			return new ResponseEntity<>( map, HttpStatus.INTERNAL_SERVER_ERROR);
		} 
 	}
	
	@DeleteMapping("/personas/{id}")
	public ResponseEntity<Object> delete(@PathVariable Long id){ 
		Map<String, Object> map = new HashMap<String, Object>();
		try { 
			PersonaEntity peResultFind = this.ps.findById(id); 
			this.ps.delete(peResultFind);
			map.put("deleted", true);
			return new ResponseEntity<Object>(map,HttpStatus.OK);
		} 
		catch (Exception e) {
			map.put("message", e.getMessage());
			return new ResponseEntity<>( map, HttpStatus.INTERNAL_SERVER_ERROR);
		} 
 	}
}



