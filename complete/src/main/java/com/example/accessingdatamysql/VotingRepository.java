package com.example.accessingdatamysql;

import org.springframework.data.repository.CrudRepository;

import com.example.accessingdatamysql.Voting;

// This will be AUTO IMPLEMENTED by Spring into a Bean called votingRepository
// CRUD refers Create, Read, Update, Delete

public interface VotingRepository extends CrudRepository<Voting, Integer> {

}
