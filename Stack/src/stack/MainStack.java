package stack;

public class MainStack {
	
	public static void main(String[] args) {
		
		MyStack ms = new MyStack(5);
		ms.push(10);
		ms.push(20);
		ms.push(30);
		ms.push(40);
		System.out.println(ms);
		
		System.out.println(ms.pop());
		System.out.println(ms);
		
		System.out.println(ms.peek());
		
		System.out.println(ms.size());
		ms.push(40);
		System.out.println(ms.size());
		
		System.out.println(ms.search(30));
		System.out.println(ms.search(40));
		System.out.println(ms.search(90));
	}

}
