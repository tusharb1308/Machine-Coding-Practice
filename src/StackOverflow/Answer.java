package StackOverflow;

import StackOverflow.Vote.Vote;
import StackOverflow.Vote.VoteType;
import StackOverflow.interfaces.Commentable;
import StackOverflow.interfaces.Votable;

import java.util.Date;
import java.util.List;
public class Answer implements Votable, Commentable {
    private int id;
    private String content;
    private User author;
    private Date creationDate;
    private Question question;
    public List<Comment> comments;
    public boolean isAccepted;
    public List<Vote> votes;

    @Override
    public void addComment(Comment comment) {

    }

    @Override
    public List<Comment> getComments() {
        return null;
    }

    @Override
    public void vote(User author, VoteType voteType) {

    }

    @Override
    public int getVoteCount() {
        return 0;
    }

    public void markAsAccepted(){

    }
}