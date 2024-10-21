package stackusinglinkedlist;

public class MyStackLinked {
	
	class Node{
		
		Object data;
		Node next;
		
		Node(Object data){
			this.data=data;
		}
	}
	
	Node top;
	int size=0;
	
	public void push(Object data) {
		
		Node n = new Node(data);
		
		n.next=top;
		top=n;
		size++;
		
	}
	
	@Override
	public String toString() {
		String st="[";
		
		Node temp=top;
		while(temp!=null) {
			st+=temp.data;
			
			if(temp.next!=null) {
				st+=",";
			}
			
			temp=temp.next;
		}
		
		return st+"]";
	}

	public Object pop() {
		
		if(top==null) {
			System.out.println("Stack is Empty...!!");
			return "";
		}
		
		Object data=top.data;
		top=top.next;
		size--;
		
		return data;
		
	}

	public int size() {
	
		return size;
	}
	
	

}
