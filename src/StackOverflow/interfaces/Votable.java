package StackOverflow.interfaces;

import StackOverflow.User;
import StackOverflow.Vote.VoteType;

public interface Votable {

    void vote(User author, VoteType voteType);

    int getVoteCount();
}