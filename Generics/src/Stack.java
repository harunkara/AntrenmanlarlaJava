import java.util.Arrays;

public class Stack <E>{
	private int top;
	private int size;
	E[] elements;

	public int getTop() {
		return top;
	}
	public void setTop(int top) {
		this.top = top;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public E[] getElements() {
		return elements;
	}
	public void setElements(E[] elements) {
		this.elements = elements;
	}
	public void push(E pushvalue) {
		E elements=pushvalue;
		System.out.println(elements);
		
	}
	public void pop() {
		//i--;
	    for(int i = 0; i < elements.length; i++){
	    	for(int j = i; j < elements.length - 1; j++)
                elements[j] = elements[j+1];      	
	}
}
	
    
	@Override
	public String toString() {
		return "Stack [top=" + top + ", size=" + size + ", elements=" + Arrays.toString(elements) + ", i=" + i + "]";
	}
	public Stack() {}
	public Stack(int s) {

		
	}
	
	public static void main(String[] args) {
		Stack s=new Stack();
		s.push(3);
		s.push(4);
		s.push(5);
		//s.pop();
		//System.out.println(s);



}

class GenericStackExample{
	//E[] doubleElements;
	//E[] integerElements;
	double[] doubleElements;
	int[] integerElements;
	public <T> void testPush(String name,Stack<T> stack,T[] elements) {
		//for(int y=0;y<i+1;y++)
			
	}
	public <T> void testPop(String name,Stack<T> stack) {}
	
	



	}
}

