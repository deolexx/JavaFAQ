package com.deo.javalearning.inheritance;

public class InheritanceTest2 {

   static class Parent{
        public void sayName(){
            String name = this.getClass().getName();
                      System.out.println("Hello from parent");
        }
    }
   static class Child extends Parent{
       @Override
       public void sayName() {
           System.out.println("Hello from child");
       }
   }

    public static void main(String[] args) {
        Parent parent = new Parent();
        Child child = new Child();
        Parent cp = new Child();
        
        parent.sayName();
        child.sayName();
        cp.sayName();
    }

}
