package stack;

import java.util.ArrayList;

import java.util.Stack;

public class Nearest_greater_to_left {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int arr[] =  {1,3,2,4};
   int n = arr.length;
   ArrayList<Integer> mv = new ArrayList<Integer>(n);
   Stack<Integer> stack = new Stack<Integer>();
   
   for(int i = 0;i<n;i++) {
	   if(stack.size()==0) {
		   mv.add(-1);
		  }else if(stack.size()>0 && stack.peek() > arr[i]) {
		   mv.add(stack.peek());
		  
	   }else if(stack.size()>0 && stack.peek() <= arr[i]){
		   while(stack.size()>0 && stack.peek() <= arr[i]) {
			   stack.pop();
		   }
		   if(stack.size()==0) {
			   mv.add(-1);
			  }else {
				  mv.add(stack.peek());
			  }
		 }
	   stack.push(arr[i]);
   }
  
  
   
   System.out.print(mv);
	}

}
	

