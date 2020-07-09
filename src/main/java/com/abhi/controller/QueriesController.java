package com.abhi.controller;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abhi.model.Queries;
import com.abhi.service.impl.QueriesServiceImpl;

@RestController
@RequestMapping("/queries")

public class QueriesController {

	@Autowired
	private QueriesServiceImpl queriesService;

	
	@RequestMapping(value="/queries")
	public ResponseEntity<Set<Queries>> getAllFeedbacks(){
		return new ResponseEntity<Set<Queries>>(queriesService.getAllQuerie(),HttpStatus.OK);
	}
	@PostMapping(value="/addqueries")
	public void addFeedback(@RequestBody Queries queries) {
		queriesService.addQueries(queries);
		
	}
	
	
}
