// main class with main method

public class TEST{
  Public static void main{
     //Polymorphic array
     Food[] array = new Food[2];
     array[0] = new Burger();
     array[1] = new Pizza();
     
     for(int counter = 0; counter<array.length; counter++){
          // on each iteration the methods of both Burger and Pizza will be called
          array[counter].eat();
     }
     
  }
}

// super class Food

public class Food{
  public void eat(){
    System.out.println("This food is great!!");
  }
}

// sub class Burger

public class Burger extends Food{
    @Override /* here we did some modifications to the inherited method(eat) from super class Food, this is the reason we
    used @Override keyword */
    public void eat(){
     System.out.println("This Burger is great!!");
    }
}

//sub class Pizza

public class Pizza extends Food{
   @Override
   public void eat(){
     System.out.println("This Pizza is Delicious");
   }
}
