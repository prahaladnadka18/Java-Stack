package stack;

public class MyStack {

	private int capacity,top;
	private Object[] obj;

	MyStack(int capacity) {
		this.capacity=capacity;
		top=-1;
		obj = new Object[capacity];
	}

	public void push(Object data) {

		if(top==capacity-1) {
			System.out.println("Stack Overflow...!");
			return ;
		}

		obj[++top]=data;

	}

	public String toString() {

		String st="[";
		for(int i=0;i<=top;i++) {
			st=st+obj[i];
			if(i<top) {
				st=st+",";
			}
		}

		return st+"]";
	}

	public Object pop() {
		if(top==-1) {
			System.out.println("Stack is underFlow..!");
			return "";
		}

		return obj[top--];
	}

	public Object peek() {
		if(top==-1) {
			System.out.println("Stack is underFlow..!");
			return "";
		}

		return obj[top];
	}

	public int size() {

		return top+1;
	}

	public int search(Object data) {

		for(int i=top;i>=0;i--) {
			if(obj[i]==data) {
				return top-i+1;
			}
		}
		
		return 0;
	}





}
