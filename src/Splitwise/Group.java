package Splitwise;

import java.util.List;
import java.util.Map;

public class Group {
    private final int id;
    private final String groupName;
    private List<User> users;
    private List<Expense> expenses;
    private List<Transaction> transactions;
    private Map<User, Integer> balance;

    public Group(int id, String groupName) {
        this.id = id;
        this.groupName = groupName;
    }

    public void addUser(User user){
        users.add(user);
    }

    public void addUser(List<User> allUsers){
        users.addAll(allUsers);
    }

    public void addTransaction(Transaction transaction){
        transactions.add(transaction);
    }

    public void addExpense(Expense expense) {
        expenses.add(expense);
        updateBalance(expense);
    }

    private void updateBalance(Expense expense){

    }

}