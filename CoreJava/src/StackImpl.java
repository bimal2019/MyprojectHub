
public class StackImpl {
	private int arr[];
	private int top;
	private int capacity;
	private int count;
	public StackImpl(int size) {
		arr = new int[size];
		capacity = size;
		top = -1;
		count=0;
		
	}
	public void push(int x) {
		++count;
		if(isFull()) {
			System.out.println("System is over flow");
			System.out.println(count-size() + "items from the stack");
			//System.exit(1);
		}else {
			arr[++top]=x;
		}
	}
	public int currentElementsOnTop() {
		return arr[top];
	}
	public int size() {
		return top+1;
	}
	public int pop() {
		if(isEmpty()) {
			System.exit(1);
		}
		return arr[top--];
	}
	private boolean isFull() {
		// TODO Auto-generated method stub
		return top == capacity-1;
	}
	private boolean isEmpty() {
		return top==-1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackImpl stack = new StackImpl(4);
		
		stack.push(5);
		stack.push(23);
		stack.push(12);
		stack.push(23);
		stack.push(45);
		stack.push(89);
		stack.push(21);
		stack.push(83);
		
		
		
		
		
		
		
	}
}
