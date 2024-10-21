package stackusinglinkedlist;

public class MainStacklinked {

	public static void main(String[] args) {

		MyStackLinked ml = new MyStackLinked();
		ml.push(10);
		ml.push(20);
		ml.push(30);
		System.out.println(ml);
		ml.push(40);
		ml.push(50);
		System.out.println(ml);
		System.out.println(ml.size());

		System.out.println(ml.pop());
		System.out.println(ml.pop());
		System.out.println(ml.size());


	}

}
