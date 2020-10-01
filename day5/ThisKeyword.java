// 41.	Write a program to demonstrate this() construct functionality.

class Demo{
    Demo()
    {
        //this(5,6);
        System.out.println(" first constructor call.. ");
    }
   Demo(int i, int j)
   {
       this();
       int sum = i + j;
    System.out.println(" sum = "+ sum);

   }
}

class Example extends Demo{

     Example()
     {
         this(2,3);
      System.out.println(" base-class constructor call.. ");
    }
   Example(int i, int j)
   {
       super(5,6); 
       int mul = i * j;
    System.out.println(" mul = "+ mul);

   }
}

class ThisKeyword{

    public static void main(String args[]){
    
    Example e = new Example();

    }
}