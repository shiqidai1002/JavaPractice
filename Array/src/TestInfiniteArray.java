
public class TestInfiniteArray {
	public static void main(String[] args){
		InfiniteArray test = new InfiniteArray();
		test.create(1);
		test.fill("my");
		test.display();
		test.expend(4);
		test.fill("name");
		test.fill("is");
		test.fill("shiqi");
		test.fill("dai");
		System.out.println("After expending:");
		test.display();
		test.expendTo(6);
		test.fill("!");
		System.out.println("After expending:");
		test.display();
	}
}

