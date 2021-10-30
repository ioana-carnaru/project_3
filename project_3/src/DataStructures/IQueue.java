package DataStructures;

public interface IQueue {
    String newAccount = "NEW ACCOUNT"; // create a new account
    String logIn = "LOG IN"; // log to an existing account

    void enqueue(String item); // adds a new item to the queue
    String dequeue(); // extracts an item from the queue
    String peek(); // take a look at the node that has to be extracted
    boolean isEmpty(); // verifies if the queue is empty
}
