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



public static void main(String[] args) {

  int [] a1 = {1,2,3,4,5};

  sumTriangle(a1);

    //System.out.println("Hello world!");
    
  }
}