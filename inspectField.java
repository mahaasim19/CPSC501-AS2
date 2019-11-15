import java.util.*;
import java.lang.reflect.*;
import java.lang.*;
import java.lang.reflect.*;
import static java.lang.System.out;
import static java.lang.System.err;



public class inspectField extends Serializer{


private void inspectFields(Object obj, boolean recurisve) throws IllegalAccessException {

        System.out.println("FIELD INSPECTOR:  ");
        Field[] objectField = null;

        for(Field field : objectField){
            Object someObject = field.get(obj);

              if(!field.getType().isPrimitive()){
                  System.out.println("Field: " + field.getName());
              }

              if(someObject != null){
                  System.out.println("Already defined before ");
              }

              if(field.getType().isArray()){
                  if(!field.getType().isPrimitive()){
                      System.out.println("(%s): " + field.getType().getComponentType());
                  }
              }

              else{
                  System.out.println("Field: " + field.getName()+" is Primitive");
              }

              try{
                  System.out.println("Field: " + field.getName());
							    System.out.println("Type: " + field.getType().getName());
							    System.out.println(" = " + someObject.toString());
                  System.out.println(" Modifier: " + Modifier.toString(field.getModifiers()));
              }
              catch(Exception e){
                  e.printStackTrace();
              }
        }
    }
}
