package StackOverflow;

import java.util.List;

public class User {
    private int id;
    private String name;
    public List<Question> questions;
    public List<Comment> comments;
    public List<Answer> answers;
    public int reputationPoints;

    public void updateReputation(int delta){

    }

    public int getReputation(){
        return reputationPoints;
    }

}