 import java.util.Scanner;
class Doublyinsertion{
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
	public void insertion(){
		       int data,m,p;
		       Scanner sc=new Scanner(System.in);
			System.out.println("enter data you want to insert");
			data=sc.nextInt();
			Node newnode=new Node(data);
			System.out.println("press 1 if you want to insert in beginning 2 for end 3 for specific position");
			m=sc.nextInt();
			switch(m){
				case 1:
					head.prev=newnode;
					newnode.next=head;
					head=newnode;
					break;
				case 2:
					newnode.prev=tail;
					tail.next=newnode;
					tail=newnode;
					break;
				case 3:
					System.out.println("enter position");
					p=sc.nextInt();
					Node temp=head;
					Node ptr=temp.next;
					for(int i=0;i<(p-1);i++){
						temp=ptr;
						ptr=ptr.next;
					}
					temp.next=newnode;
					newnode.prev=temp;
					newnode.next=ptr;
					ptr.prev=newnode;
					break;
			}
		
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
		Doublyinsertion m=new Doublyinsertion();
		m.creation();
		m.insertion();
		m.display();
	
	}

}



