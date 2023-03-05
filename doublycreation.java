import java.util.Scanner;
class Doublycreation{
	 static class Node{
		int data;
		Node next;
		Node prev;
		Node(int data){
			this.data=data;
			this.next=null;
			this.prev=null;
		}
	}
	Node head=null;
	Node tail=null;
	public void creation(){
		int data,n;
		Scanner sc=new Scanner(System.in);
		do{
		System.out.println("Enter data");
		data=sc.nextInt();
		Node newnode=new Node(data);
		if(head==null){
				head=newnode;
				tail=newnode;
			}
		else{
			head.prev=newnode;
			newnode.next=head;
			head=newnode;
				
			}
		      System.out.println("do you want to enter more node the press 1:");
		      n=sc.nextInt();
		}while(n==1);
	}
		
	public void display(){
		Node temp=head;
		if(head==null){
			System.out.println("linked list does not exist");
		}
		else{
			while(temp!=null){
				System.out.println(temp.data);
				System.out.println(temp.next);
				System.out.println(temp.prev);
				temp=temp.next; 
				
			}
		}
	
	}
	public static void main(String[] args){
		Doublycreation m=new Doublycreation();
		m.creation();
		m.display();
	
	}

}



