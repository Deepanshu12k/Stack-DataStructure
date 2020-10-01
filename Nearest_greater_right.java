package stack;
import java.util.*;
public class Nearest_Greater_to_right {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int arr[] =  {1,3,2,4};
   int n = arr.length;
   ArrayList<Integer> mv = new ArrayList<Integer>(n);
   Stack<Integer> stack = new Stack<Integer>();
   
   for(int i = n-1;i>=0;i--) {
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
  
   Collections.reverse(mv);
   
   System.out.print(mv);
	}

}
	
