class tester{
  public static String parens(int num){
    if (num%2 ==1); return "invalid input";

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
  