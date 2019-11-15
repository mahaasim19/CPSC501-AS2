

////////////////**************************************//////////////////////////////

import java.uitl.*;
import java.io.*;



public class ObjectCreator{

      public static SimpleObject SimpleobjectCreator(Object obj){

          try{
                
              Object obj = new Object();
              Field[] field = classObj.getFields();
              int i = 0;
              while(i < field.length){
                System.out.println("Name: \n"+ field[i].getName + "Type: "+ class.getDeclaredField().getType().toString());
                System.out.println("the value of these fileds are: ");
                i++;
              }

              Scanner inputValue = new Scanner(System.in);
              System.out.println("Enter the int value: ");
              if(inputValue != hasNextInt()){
                System.out.println("enter the int number");
              }
              else if(inputValue != hasNextDouble()){
                  System.out.println("enter the double int number");
              }
              else if(inputValue = nextChar()){
                  System.out.println("enter valid value");
              }
          }
          catch(Exception e){
            e.printStackTrace();
          }
          catch(IOException ioe){
            ioe.printStackTrace();
          }

          ArrayList<> objectCreatorList = new ArrayList<>;
          SimpleobjectCreator list = new SimpleobjectCreator();

          return list;
      }

      private ReferenceObject refObj;

     public static ReferenceObject ReferenceObjectCreator(Object obj){

          SimpleObject simpleObject = SimpleobjectCreator(obj);
          ReferenceObject refObject = new ReferenceObject(simpleObject);

          simpleObj.setSimpleobjectCreator(refObject);
          refObject.setReferenceObjectCreator(simpleObject);

          simpleObject = null;
          refObject = null;

          if(!SimpleobjectCreator()){
            System.out.println("Reference object not created");
          }
          else{
              System.out.println("Reference object created");
          }

     }


     public static SimpleArrayObject ArrayObjectCreator(Object obj){


     }
   //https://stackoverflow.com/questions/31876858/how-to-create-array-of-object-references-in-java
     public static ReferenceArrayObject ArrayReferenceObjectCreator(Object obj){

       Scanner sc = new Scanner(System.in);
       int inputInt = inputInt.nextInt();
       int i = 0;
       while(i < inputInt.length()){
         SimpleObject simpleObject = SimpleobjectCreator(obj);
         inputInt[i] = simpleObject;
       }



     }

     public static CollectionObject CollectionObjectCreator(Object obj){


     }


}
