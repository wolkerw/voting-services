package com.example.accessingdatamysql;

import org.springframework.data.repository.CrudRepository;

import com.example.accessingdatamysql.Vote;

// This will be AUTO IMPLEMENTED by Spring into a Bean called voteRepository
// CRUD refers Create, Read, Update, Delete

public interface VoteRepository extends CrudRepository<Vote, Integer> {

}
