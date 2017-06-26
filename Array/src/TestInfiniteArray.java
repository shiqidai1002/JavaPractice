
public class TestInfiniteArray {
	public static void main(String[] args){
		InfiniteArray list = new InfiniteArray();
		System.out.println(list.size());
		list.add("two");
		list.add("three");
		list.add("four");
		list.add("five");
		System.out.println(list.get(3)); // Should print the "Don't listen...." entry
		for ( int x = 0; x < 20; x++ ) {
			list.add("load test" + " " + x);
		}
		System.out.println("After loading, the sixth is: " + list.get(6));
		System.out.println("After loading, the size of this array is:" + list.size());
		System.out.println("After loading, the length of this array is:" + list.length());
		System.out.println("After loading, the 24th is: " + list.get(23));
		System.out.println("After loading, the 25th is: " + list.get(24));
		list.insert(4, "six");
		System.out.println(list.toString());
	}
}

