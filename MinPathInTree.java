package RePracticeAlgo;

import java.util.ArrayList;
import java.util.List;



public class MinPathInTree {
	static class Tree{
		int value;
		Tree left;
		Tree right;		
	}
	 int prevSum=Integer.MAX_VALUE;
	public String findMinPath(Tree root, int sum, List<Integer> path){
		String str1="";
		String str;
		if(root== null){
			
			if(prevSum>sum){
				prevSum=sum;
				str1 =path.toString();
				return "Min sum" +prevSum +" Path"+ str1;
			}
			return "Min sum" +prevSum +" Path"+ str1;
			}
				
			
		
		path.add(root.value);
		
		str = findMinPath(root.left, sum+root.value,path);
		
		path.remove((Integer)root.value);
		str = findMinPath(root.right,  sum+root.value,path);
	
		path.remove((Integer)root.value);
		
		return str;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MinPathInTree minpath = new MinPathInTree();
		List<Integer> path = new ArrayList<Integer>();
		Tree root = new Tree();
		root.value=2;
		root.left = new Tree();
		root.left.value=5;
		root.left.left = new Tree();
		root.left.left.value =1;
		root.right= new Tree();
		root.right.value =4;	
		root.right.left = new Tree();
		root.right.right = new Tree();
		root.right.left.value= 0;
		root.right.right.value=6;
		System.out.println(minpath.findMinPath(root,  0, path));
		
	}

}
