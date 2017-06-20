
public class InfiniteArray {
	// You should only have one array stored in the object.
	String[] data;
	int defaultSize = 10; // or something
	int initialSize = 0;
	int currentIndex = 0; //the counter
	
	//constructor
	public InfiniteArray(){
		// You should use the array constructor here to create your array with some default size.
		data = new String[defaultSize];
	};
	
	public InfiniteArray(int size) {
		// Remember, objects can have more than one constructor
		// We can have another constructor here for when the user wants to specify an initial size.
		initialSize = size;
		data = new String[initialSize];
	}
	
	public void display(){
		for (int i = 0; i < data.length; i++){
			System.out.println(data[i]);
		}
	}
	
	public String toString() {
		// most objects have a toString method. You can write one here as well.
		String result = "";
		for (int i = 0; i < data.length; i++)
			result = result + "||" + data[i];
		return result;
	}
	
	public void flush(){
		data = new String[defaultSize]; //create a new array with the default size
	}
	
	public void add(String value){
		//check occupation
		if(currentIndex == data.length)
			data = autoExpand(currentIndex);
		
		//add new item
		data[currentIndex] = value;
		currentIndex ++;
	}
	
	private String[] autoExpand(int currentIndex){
		String[] data2 = new String[currentIndex * 2];
		for (int i = 0; i < data.length; i++){
			data2[i] = data[i];
		}
		return data2;
	}
	
	public String get(int index){
		return data[index];
	}
	
	public void set(int index, String value){
		data[index] = value;
	}
	
	public int size(){
		// This should not return data.length.
		// Instead, it should return the number of things that are stored inside the array
		// So if the array starts at size 10, and the user adds 3 things, the size() should return 3.
		return data.length;
	}
	
	public void insert(int index, String value) {
		// This method should insert a value at the specified index.
		// This is different from the set() method because if there is other data behind it, this method should
		// move the other data back.
		// For example, for a list of [cat, dog, bird, fish, beer, null, null, ....]
		// If you call insert(2, sake);
		// The list should then become [cat, dog, sake, bird, fish, beer, null, null, ...]
		// Dont forget to expand the array if the array gets full!
	}
}
