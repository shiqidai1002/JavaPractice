
public class InfiniteArray {
	String[] array1;
	String[] array2;
	
	//constructor
	public InfiniteArray(){
	};
	
	public void create(int initialSize){
		array1 = new String[initialSize];
	}
	
	public void display(){
		for (int i = 0; i < array1.length; i++){
			System.out.println(array1[i]);
		}
	}
	
	public void fulsh(){
		array1 = null;
	}
	
	public void fill(String value){
		int nextIndex = 0;
		//check current occupation
		for(int c = 0; c < c + 1; c++){
			String check = array1[c];
			if(check != null){
				continue;
			}
			else{
				nextIndex = c; 
				break;
			}
		}
		
		//add new content
		array1[nextIndex] = value;
	}
	
	public void expendTo(int newSize){
		array2 = new String[newSize];
		for (int i = 0; i < array1.length; i++){
			array2[i] = array1[i];
		}
		array1 = array2;
	}
	
	public void expend(int additionalSize){
		array2 = new String[array1.length + additionalSize];
		for (int i = 0; i < array1.length; i++){
			array2[i] = array1[i];
		}
		array1 = array2;
	}
}
