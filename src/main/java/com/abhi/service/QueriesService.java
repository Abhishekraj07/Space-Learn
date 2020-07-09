package com.abhi.service;

import java.util.Date;
import java.util.Set;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.abhi.model.Queries;


public interface QueriesService extends JpaRepository<Queries, Long> {

	@Query(value = "SELECT Queries.Queries_id, "
			+ "Queries.Topic, "
			+ "Queries.comments, "
			+ "Queries.user_id "
			+ "FROM Queries;", nativeQuery = true)
	public Set<Queries> getAllQueries();
	
	@Modifying
	@Transactional
	@Query(value = "INSERT INTO Queries (Topic, comments, user_id) values(?,?,?);", nativeQuery = true)
	int addQueries(String Topic, String comments, int userId);
}
