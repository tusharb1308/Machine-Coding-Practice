package Splitwise;

import java.util.List;
import java.util.Map;

public class Expense {
    private int id;
    private int totalAmount;
    private String description;
    private SplitType splitType;
    private Map<User, Integer> contributors;
    private Map<User, Integer> actualStake;

    public void setContributors(List<User> users){
        int amount = totalAmount;
        for(int user=0; user<users.size() && amount > 0; user++){

        }
    }
    public void setActualStake(List<User> users){
        if(splitType == SplitType.EQUAL){

        } else if(splitType == SplitType.PERCENTAGE){

        } else if(splitType == SplitType.AMOUNT){

        }
    }

}