
public class TestInfiniteArray {
	public static void main(String[] args){
		InfiniteArray list = new InfiniteArray();
		System.out.println(list.size());
		list.add("lmao");
		list.add("things");
		list.add("omg");
		list.add("Don't listen to girls who say they will die for you. Fried chicken actually died for you. Fried chicken is love.");
		System.out.println(list.get(3)); // Should print the "Don't listen...." entry
		for ( int x = 0; x < 1000; x++ ) {
			list.add("load test");
		}
		System.out.println(list.get(666));
		list.set(0, "Deus Vult"); // should set "lmao" to "Deus Vult"
		System.out.println(list.get(0));
	}
}

