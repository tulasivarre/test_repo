package com.zensar;

class Node {
Node prevNode;
Node nextNode;
int data;

@Override
public String toString() {
return "Node [pre=" + prevNode + ", next=" + nextNode + ", data=" + data + "]";
}

public Node() {
super();
}

public Node(Node pre, Node next, int data) {
super();
this.prevNode = pre;
this.nextNode = next;
this.data = data;
}

public Node getPre() {
return prevNode;
}

public void setPre(Node pre) {
this.prevNode = pre;
}

public Node getNext() {
return nextNode;
}

public void setNext(Node next) {
this.nextNode = next;
}

public int getData() {
return data;
}

public void setData(int data) {
this.data = data;
}

public Node(int data) {
this.data = data;
}

}

public class DLL {
Node headNode, tailNode = null;

public void addNode(int data) {
Node newDLLNode = new Node(data);
if (headNode == null) {
headNode = tailNode = newDLLNode;
headNode.prevNode = null;
tailNode.nextNode = null;
} else {
tailNode.nextNode = newDLLNode;
newDLLNode.prevNode = tailNode;
tailNode = newDLLNode;
tailNode.nextNode = null;
}
}

public void deleteNode() {
if (headNode == null) {
System.out.println("Doubly Linked List is empty");
return;
} else {
if (headNode != tailNode) {
headNode = headNode.nextNode;
} else {
headNode = tailNode = null;
}
}
}

public int countNode() {
System.out.println("\n");
int count = 0;

Node current = headNode;

while (current != null) {

count++;
current = current.nextNode;
}
return count;

}

public void showAll() {
Node currentNode = headNode;
if (headNode == null) {
System.out.println("Doubly Linked List is empty");
return;
}
System.out.println("\n");
System.out.println("Nodes in Doubly Linked List: ");
while (currentNode != null) {
System.out.print(currentNode.data + " ");
currentNode = currentNode.nextNode;
}
}

public static void main(String args[]) {
DLL DLL = new DLL();
DLL.addNode(10);
DLL.addNode(23);
DLL.addNode(34);
DLL.addNode(46);
DLL.addNode(66);
DLL.showAll();
DLL.deleteNode();
DLL.showAll();
System.out.println("Count of nodes present in the list: " + DLL.countNode());

}
}

