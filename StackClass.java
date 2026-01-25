import java.util.*;
public class StackClass{
    //linked list
    static class Node{
        int data;
        Node next;
public Node(int data){
    this.data=data;
    next=null;
}
    }
static class Stack{
        public static Node head;
        public static boolean isEmpty(){
            return head==null;
        }

public static void push(int data){
    Node newNode=new Node(data);
    if(isEmpty()){
        head=newNode;
        return;}
    newNode.next=head;
    head=newNode;
    }
     
public static int pop(){
    if(isEmpty()){
        return -1;
    }
    int top=head.data;
    head=head.next;
    return top;
    }

public static int peek(){
    if(isEmpty()){
        return -1;
    }
    return head.data;
}
     }
    
//array list
static class Stack{
   static ArrayList<Integer> list =new ArrayList<>();
    public static boolean isEmpty(){
        return list.size() == 0;
    }

public static void push(int data){
        list.add(data);
    }

public static int pop(){
    if(isEmpty()){
        return -1;
    }
    int top=list.get(list.size()-1);
    list.remove(list.size()-1);
    return top;
}

public static int peek(){
    if(isEmpty()){
        return -1;
    }
}
public static void main(String[]args){
Stack s= new Stack();
s.push(1);
s.push(6);
s.push(9);

while(!s.isEmpty()){
    System.out.println(s.peek());
    s.pop();
    }
}
}
}

//collection framework
public static void main(String[]args){
Stack<Integer> s =new Stack<>();
s.push(1);
s.push(7);
s.push(0);

while(!s.isEmpty()){
         System.out.println(s.peek());
   s.pop();
    }
}
}

//push element at bottom:3,1,2   - 4,3,1,2

public static void pushAtBottom(int data, Stack<Integer> s){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
int top=s.pop();//firstly we pop all elements
pushAtBottom(data,s);// then the data i.e 4 is added
s.push(top);
    }

public static void reverse(Stack<Integer> s){
    if(!s.isEmpty()){
        return;
    }
    int top=s.pop();
    reverse(s);
    pushAtBottom(top,s);

}
public static void main(String[]args){
Stack<Integer> s =new Stack<>();
s.push(3);
s.push(1);
s.push(2);

// reverse(s);

 pushAtBottom(4,s);

while(!s.isEmpty()){
         System.out.println(s.peek());
   s.pop();    }
// }
}


//QUEUE
public class QueueClass{
    static class Queue{
static int arr[];
static int size;
static int rear=-1;

Queue(int size){
    arr=new int [size];
    this.size=size;
}
public static boolean isEmpty(){
    return rear==-1;
}
//enqueue
public static void add(int add){
    if(rear==size-1){
        System.out.println("full queue");
        return;
    }
    rear++;
    arr[rear]=data;
}
//dequeue
public static int remove(){
if(isEmpty()){
    System.out.println("empty queue");
    return -1;
}
int front=arr[0];
for(int i=0;i<rear;i++){
  arr[i]=arr[i+1];
}
rear--;
return front;
}
//peek
public static int peek(){
if(isEmpty()){
    System.out.println("empty queue");
    return -1;
}
return arr[0];
    }
}
public static void main(String[]args){
Queue q =new Queue();
q.add(1);
q.add(2);
q.add(3);

while(!q.isEmpty()){
    System.out.println(q.peek());
    q.remove;
}
}
}


//LINKED LIST(for insertion linked list is better)
//SINGLY LINKED LIST
public class LinkedList {
Node head;
 private int size;

     LinkedList() {
        this.size = 0;
    }
 
 class Node{
 String data;
 Node next;


 Node(String data){
    this.data=data;
    this.next=null;
    size++;
 }
 }

 //addFirst
 public void addFirst(String data){
    Node newNode=new Node(data);
    if(head==null){
        head=newNode;
        return;
    }
    newNode.next=head;
    head=newNode;
 }

//addlast
public void addLast(String data){
    Node newNode=new Node(data);
    if(head==null){
        head=newNode;
        return;
    }
    Node currNode=head;
    while(currNode.next!=null){
        currNode=currNode.next;
    }
    currNode.next=newNode;
  }
//print
public void printList(){
    if(head==null){
        System.out.println("List is empty");
        return;
    }
    Node currNode=head;
    while(currNode!=null){
        System.out.print(currNode.data+" -> ");
        currNode=currNode.next;
    }
    System.out.println("null");
  }

//delete first
 public void deleteFirst(){
    if(head==null){
        System.out.println("List is empty");
        return;   
    }
    size--;
    head=head.next;
 }

//delete last
    public void deleteLast(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        size--;
        if(head.next==null){
            head=null;
            return;
        }
        Node secondLast=head;
        Node lastNode=head.next;
        while(lastNode.next!=null){
            secondLast=secondLast.next;
            lastNode=lastNode.next;
        }
        secondLast.next=null;
    }

public int getSize(){
    return size;}

//REVERSE A LINKED LIST(iterative approach)
    public void reverseIterate(){
    if(head==null || head.next==null){
        return;
    }

 Node prevNode=head;
 Node currNode=head.next;
 while(currNode!=null){
    Node nextNode=currNode.next;
    currNode.next=prevNode;

    //update
    prevNode=currNode;//currnode becomes prevnode
    currNode=nextNode;//nextnode becomes currnode
 }
 head.next=null;
 head=prevNode;
    }

//recursive approach
public Node reverseRecursive(Node head){
    if(head==null || head.next==null){
        return head;
    }
    Node newHead=reverseRecursive(head.next);
    head.next.next=head;
    head.next=null;
    return newHead;
}
  
 public static void main(String[] args) {
    LinkedList list=new LinkedList();
     list.addFirst("A");
      list.addFirst("is");
        list.printList();
    
         list.addLast("list");
          list.addLast("linked");
            list.printList();

            list.getSize();
            System.out.println("Size of linked list: " + list.getSize());

            // list.reverseIterate();
            // list.printList();

            list.head=list.reverseRecursive(list.head);
            list.printList();

 }
}
import java.util.LinkedList;
public class LinkedListEx {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.addFirst("A");
        list.addFirst("is");
        list.addFirst("this");
        System.out.println(list);

        list.addLast("linked");
         list.addLast("list");
        System.out.println(list);

System.out.println(list.size());

for(int i=0;i<list.size();i++){
    System.out.print(list.get(i)+"-> ");
}
System.out.println("null");

        list.removeFirst();
        System.out.println(list);

        list.remove(3);
        System.out.println(list);
    }
}





