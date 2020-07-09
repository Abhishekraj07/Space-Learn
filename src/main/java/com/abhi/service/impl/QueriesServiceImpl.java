package com.abhi.service.impl;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abhi.model.Queries;
import com.abhi.service.QueriesService;

@Service
public class QueriesServiceImpl {
	
	@Autowired
	private QueriesService queriesService;

	public QueriesServiceImpl(QueriesService queriesService) {
		super();
		this.queriesService = queriesService;
	}
	public QueriesServiceImpl() {}
	public Set<Queries> getAllQuerie(){
		return queriesService.getAllQueries();
	}
	public int addQueries(Queries queries){
		
		return queriesService.addQueries(queries.getTopicName(), queries.getComment(), queries.getUserId());
	}

}
