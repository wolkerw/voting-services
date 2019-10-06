package com.example.accessingdatamysql;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

import com.example.accessingdatamysql.Vote;

// This will be AUTO IMPLEMENTED by Spring into a Bean called voteRepository
// CRUD refers Create, Read, Update, Delete

public interface VoteRepository extends CrudRepository<Vote, Integer> {
    @Query(value = "select vote.voting_id as VOTING_ID, voting.name as VOTING_NAME, vote.description as VOTE_DESCRIPTION, count(vote.description) as AMOUNT from voting join vote on voting.id = vote.voting_id group by 1, 2, 3", nativeQuery = true)
    List<Object[]> getTotalVotesByVoting();
}
