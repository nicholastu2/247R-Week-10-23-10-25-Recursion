import java.*;
class Main {

  //1. Sum Triangle: Given an array of integers, print a sum triangle from it such that the first level has all array elements. From then, at each level, the number of elements is one less than the previous level and each elements at that level is made up of the sum of consecutive two elements in the previous level. The triangle             can be a right triangle (i.e. don’t worry about spacing).
  //  1    2     3     4    5 
  //     3     5     7    9 
  //       8    12   16 
  //         20    28 
  //              48

public static void sumTriangle(int[] array){
  if(array.length ==1){
    System.out.println(array[0]);
  }
  else{
    for(int x : array){
      System.out.print(x+" ");
    }
    System.out.println();
    int [] newArray = new int [array.length-1];
    for(int i = 1; i<array.length;i++){
      newArray[i-1] = array[i]+array[i-1];
    }
    sumTriangle(newArray);
  }
}

//  Reverse Linked List: Given a linked list, write a recursive function that returns the reverse of that linked list. (Reminder: You only have access to the head node)
class Node{
  int value;
  Node next;
}
public static Node reverseLinkedList(Node curNode, Node nextNode){
  if(curNode.next() == null) return curNode;

  if(nextNode.next == null){
    nextNode.next =  curNode;
    return nextNode;
  }

  Node nextNext = nextNode.next;
  nextNode.next = curNode;

  
  return reverseLinkedList(nextNode,nextNext);

}

//3. Parens: Given an integer, write a function that prints all valid (properly opened and closed) combinations of the input number of parentheses.
public static String parens(int num){
  if (num%2 ==1) return "invalid input";

  if (num == 2){
    return "()";
  }
  
  return "()"+parens(num-2)+" "+"("+ parens(num-2) +")"+" "+parens(num-2)+"()";
  //num = 2 ()
  //num = 4 
  
  // num = 4 ()() (())
  // num = 6 ()()()   (()())  ((()))  ()(())  (())()
}

public static void main(String[] args) {

  int [] a1 = {1,2,3,4,5};

  //sumTriangle(a1);
  System.out.println(parens(6));

    //System.out.println("Hello world!");
    
  }
}