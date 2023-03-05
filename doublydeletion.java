import java.util.Scanner;
class Doublydeletion{
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
	public void deletion(){
			int m,p;
			Scanner sc=new Scanner(System.in);
			System.out.println("press 1 to delete from beginning 2 fron end 3 from specific position");
			m=sc.nextInt();
			switch(m){
				case 1:
					head=head.next;
					head.prev=null;
					break;
				case 2:
					Node temp1=tail;
					temp1=temp1.prev;
					temp1.next=null;
					break;
				case 3:
					System.out.println("enetr position");
					p=sc.nextInt();
					Node temp2=head;
					Node ptr=temp2.next;
					for(int i=0;i<(p-1);i++){
						temp2=ptr;
						ptr=ptr.next;
					}
					temp2.next=ptr.next;
					ptr.next.prev=temp2;
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
		Doublydeletion m=new Doublydeletion();
		m.creation();
		m.deletion();
		m.display();
	
	}

}









































