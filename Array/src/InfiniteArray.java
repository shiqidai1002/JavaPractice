
public class InfiniteArray {
	// You should only have one array stored in the object.
	String[] data;
	int defaultSize = 10; // or something
	int currentIndex = 0; //the counter
	
	//constructor
	public InfiniteArray(){
		// You should use the array constructor here to create your array with some default size.
		data = new String[defultSize];
	};
	
	public InfiniteArray(int initialSize) {
		// Remember, objects can have more than one constructor
		// We can have another constructor here for when the user wants to specify an initial size.
		data = new String[initialSize];
	}
	
	public void display(){
		for (int i = 0; i < array1.length; i++){
			System.out.println(array1[i]);
		}
	}
	
	public String toString() {
		// most objects have a toString method. You can write one here as well.
	}
	
	public void flush(){
	
		// Also, instead of setting your data to null, you should create a new array with the default size
		// This way, if the user tries to add to the array after flushing it won't crash the program.
		array1 = null;
	}
	
	public void fill(String value){
		// This makes sense, but it is slow because we have to search through the array one by one every time
		// we want to add something. Maybe it would be better to just store "nextIndex" as a variable inside
		// the object? Then we can directly use nextIndex without searching, and just update it after a change.
		//add new content
		array1[currentIndex] = value;
		currentIndex +=;
	}
	
	public void expandTo(int newSize){
		
		// But the truth is, we don't need these methods. We should automatically
		// expand the array when the size is not large enough. See your test class for an example use case.
		array2 = new String[newSize];
		for (int i = 0; i < array1.length; i++){
			array2[i] = array1[i];
		}
		array1 = array2;
	}
	
	public void expand(int additionalSize){
		array2 = new String[array1.length + additionalSize];
		for (int i = 0; i < array1.length; i++){
			array2[i] = array1[i];
		}
		array1 = array2;
	}
}
