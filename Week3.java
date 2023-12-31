import java.util.Stack;

public class Week3 {
    // public static void main(String[] args) {
        

		
		// *****************************************************
		
		// stack = LIFO data structure. Last-In First-Out
		//               stores objects into a sort of "vertical tower"
		//		  push() to add objects to the top
		//		  pop() to remove objects from the top
		
		// uses of stacks?
		// 1. undo/redo features in text editors
		// 2. moving back/forward through browser history
		// 3. backtracking algorithms (maze, file directories)
		// 4. calling functions (call stack)
		
		// *****************************************************
		
		// Stack<String> stack = new Stack<String>();
		
		// //System.out.println(stack.empty());
        // System.out.println(stack);
        // // System.out.println(stack.get(0));
		
		// stack.push("Minecraft");
		// stack.push("Skyrim");
		// stack.push("DOOM");
		// stack.push("Borderlands");
		// stack.push("FFVII");
		// System.out.println(stack.);
		// String myFavGame = stack.peek();
        // System.out.println(myFavGame);
		// System.out.println(stack);
        // if(stack.peek().equals(stack.peek())){
        //     System.out.println(true);
        // }
        // System.out.println(stack.search(myFavGame));
        

        // Stack<Integer> stack = new Stack<>();
        // stack.push(20);
        // System.out.println(stack.get(0));
		// System.out.println(234 / 10);
		
    
}
	
class Main{
	
	public static void main(String[] args) {
		int[] originalArray = {1, 2, 3};
int[] shallowCopyArray = originalArray.clone();
shallowCopyArray[0] = 99;
System.out.println(originalArray[0]); // Outputs 1
System.out.println("hi");
		
		int array[] = new int[10];
		int target = 3;
		
		for(int i = 0; i < array.length; i++) {
			array[i] = i;
		}
		
		//int index = Arrays.binarySearch(array, target);
		int index = binarySearch(array, target);
		
		if(index == -1) {
			System.out.println(target + " not found");
		}
		else {
			System.out.println("Element found at: " + index);
		}
		// DynamicArray dynamicArray = new DynamicArray(5);
		// System.out.println(dynamicArray.raduis(130.55));
		
		// dynamicArray.add("A");
		// dynamicArray.add("B");
		// dynamicArray.add("C");
		
		// //System.out.println(dynamicArray.get(0));
		// //dynamicArray.insert(0, "X");
		// // dynamicArray.delete("A");
		// //System.out.println(dynamicArray.search("C"));
		
		// System.out.println(dynamicArray);
		// System.out.println("size: " + dynamicArray.size);
		// System.out.println("capacity: " + dynamicArray.capacity);
		// System.out.println("empty: " + dynamicArray.isEmpty());
		
	}

	private static int binarySearch(int[] array, int target) {
		
		int low = 0;
		int high = array.length - 1;
		
		while(low <= high) {
			
			int middle = low + (high - low) / 2;
			int valueM = array[middle];
			
			System.out.println("middle: " + valueM);
			
			if(valueM < target) low = middle + 1;
			else if(valueM > target) high = middle - 1;
			else return middle; //target found
		}
		
		return -1;
	

		
		
	}
}
class DynamicArray<T> {

	int size;
	int capacity = 10;
	Object[] array;
	
	public DynamicArray() {
		this.array = new Object[capacity];
	}
	public DynamicArray(int capacity) {
		this.capacity = capacity;
		this.array = new Object[capacity];
	}
	
        public Object get(int index) {
            return array[index];
        }
	
	public void add(Object data) {
		
		if(size >= capacity) {
			grow();
		}
		array[size] = data;
		size++;
	}
	
	public void insert(int index, Object data) {
		
		if(size >= capacity) {
			grow();
		}
		for(int i = size; i > index; i--) {
			array[i] = array[i - 1];
		}
		array[index] = data;
		size++;
	}
	
	public void delete(Object data) {
		
		for(int i = 0; i < size; i++) {
			if(array[i] == data) {
				for(int j = i;j<size-1;j++){
					array[j] = array[j + 1];
				}
				size--;
				if(size <=(int) (capacity/3)) {
					shrink();
				}
				break;
			}
		}
	}
	
	public int search(Object data) {
		
		for(int i = 0; i < size; i++) {
			if(array[i] == data) {
				System.out.println(array[i]);
				return i;
			}
		}
		return -1;
	}
	
	private void grow() {
		
		int newCapacity = (int)(capacity * 2);
		Object[] newArray = new Object[newCapacity];
		
		for(int i = 0; i < size; i++) {
			newArray[i] = array[i];
		}
		capacity = newCapacity;
		array = newArray;
	}
	
	private void shrink() {
		
		int newCapacity = (int)(capacity / 2);
		Object[] newArray = new Object[newCapacity];
		
		for(int i = 0; i < size; i++) {
			newArray[i] = array[i];
		}
		capacity = newCapacity;
		array = newArray;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public String toString() {
		
		String string = "";
		
		for(int i = 0; i < size; i++) {
			string += array[i] + ", ";
		}
		if(string != "") {
			string = "[" + string.substring(0, string.length() - 2) + "]";
		}
		else {
			string = "[]";
		}
		return string;
	}
	public static double raduis(double circumference) {
		// write your code here
		return circumference / (3.14 * 2);
	}
	public static String word_repeat(String word, int n) {
    // write your code here
    String string = "";
    for(int i = 0;i<n;i++){
        string += word;
    }
    return string.substring(0,string.length()-1);
}

}

