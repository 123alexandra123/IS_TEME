package org.ex5;

public class Node {
    private String name;
    private Node nextNode;
    private boolean hasToken;
    private String message;

    public Node(String name) {
        this.name = name;
        this.hasToken = false;
        this.message = "";
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }

    public void receiveToken() {
        this.hasToken = true;
    }

    public void sendMessage(String destination, String message) {
        if (hasToken) {
            System.out.println(name + " trimite mesajul: \"" + message + "\" catre " + destination);
            this.hasToken = false;
            nextNode.receiveToken();
        } else {
            System.out.println(name + " nu are tokenul pentru a trimite mesajul.");
        }
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }
    public String getName() {
        return name;
    }

    public Node getNextNode() {
        return nextNode;
    }
}
