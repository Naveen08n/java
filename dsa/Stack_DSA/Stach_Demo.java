package Stack_DSA;

import java.util.ArrayList;

class StackUnderFlowException extends Exception{
	StackUnderFlowException(){
		super("No element in  stack");
	}
}
class Stack{
	ArrayList al;
	int top;
	
	public Stack() {
		this.al=new ArrayList<Integer>();
		this.top=-1;
		
	}
	void push(int element) {
		this.al.add(element);
	}
	int pop() throws StackUnderFlowException {
		if(this.al.size()==0) {
			throw  new StackUnderFlowException();
		}
		int lastIndex=this.al.size()-1;
		int t=(int)this.al.get(lastIndex);
		this.al.remove(lastIndex);
		return t;
	}
}
public class Stach_Demo {

	public static void main(String[] args)throws Exception  {
		Stack myStack=new Stack();
		myStack.push(10);
		myStack.push(20);
		myStack.push(30);
		System.out.println(myStack.pop());
		System.out.println(myStack.pop());
		System.out.println(myStack.pop());
		System.out.println(myStack.pop());
	}

}
