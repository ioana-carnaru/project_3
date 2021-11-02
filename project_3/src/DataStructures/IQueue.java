package DataStructures;

public interface IQueue {
    String newAccount = "NEW ACCOUNT"; // create a new account
    String logIn = "LOG IN"; // log to an existing account
    String showInventory = "GIMME MY DATA"; // displays the current inventory of an user
    String newItem = "NEW ITEM"; // adds a new item to the inventory of the current user

    void enqueue(String item); // adds a new item to the queue
    String dequeue(); // extracts an item from the queue
    String peek(); // take a look at the node that has to be extracted
    int size(); // returns the size of the queue (number of elements)
    boolean isEmpty(); // verifies if the queue is empty
}
