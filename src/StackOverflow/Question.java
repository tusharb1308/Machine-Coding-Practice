package StackOverflow;


import StackOverflow.Vote.Vote;
import StackOverflow.Vote.VoteType;
import StackOverflow.interfaces.Commentable;
import StackOverflow.interfaces.Votable;

import java.util.Date;
import java.util.List;
public class Question implements Votable, Commentable {
    private int id;
    public String title;
    public String content;
    private User author;
    private Date creationDate;
    public List<Tag> tags;
    public List<Comment> comments;
    public List<Answer> answers;
    public Answer acceptedAnswer;
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

    public void addTag(Tag tag){

    }

    public void addAnswer(Answer answer){

    }

    public void markAcceptedAnswer(Answer answer){

    }

}
