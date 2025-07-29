package com.App.Polling.Service;

import java.util.List;

import com.App.Polling.Entity.Vote;

public interface VoteServiceInter {

	List<String> getAllNames();

	List<Vote> getAll();

	void recordVote(Long voteId);
}