import java.util.*;
import java.lang.reflect.*;
import java.lang.*;
import java.lang.reflect.*;
import static java.lang.System.out;
import static java.lang.System.err;

public class InspectorNew extends MethodInspector {


  public InspectorNew(){
    super();
  }

    public void inspect(Object obj, boolean recurisve,Class clz){

        if(clz.isArray()){
          int i;
          int arrayLength = Array.getLength(obj);
          for(i = 0; i > arrayLength; i++){

          }
        }

      }



      private void inspectClasses(Object obj, boolean recurisve, Class clz){

        Field[] fields;

        Class sco = clz.getSuperclass();
        System.out.println("get SUPER CLASS:  " +sco.getName());

        Class io[] = clz.getInterfaces();
        System.out.println("get INTERFACES: " + io);

        Method mo[] = clz.getDeclaredMethods();
        inspectMethod(obj);

        Constructor co[] = clz.getConstructors();
        inspectConstructor(obj);
    //  System.out.println("get SUPER CLASS:  " +sco.getName());
        System.out.println("get Declared Class: " + obj);
    //  System.out.println("get INTERFACES: " + io);


    //  Method[] method = new Method();
    //  method.inspectMethod(obj,recurisve);
  //    method.inspectConstructor(obj);
    //  inspectFields(obj, recurisve);
        try{
            inspectFields(obj, recurisve);
          }
          catch(IllegalAccessException iae){
          iae.printStackTrace();
        }


      }


      Class clz;
  /*  public FieldInspector(){
      super();
    }*/


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
                  System.out.println("\nField: " + field.getName()
							                       + "	\nType: " + field.getType().getName()
							                       + " = " + someObject.toString() + "\nModifier: "
							                       + Modifier.toString(field.getModifiers()));
              }
              catch(Exception e){
                  e.printStackTrace();
              }
        }
}

    private void inspectInterface(Object obj){

      System.out.println("INSPECT INTERFACE:  ");

      Class <?> clz = obj.getClass();

      if(clz.getInterfaces().length >= 1){
          for ( Class classInt : clz.getInterfaces()) {
              System.out.println("Interface: " + classInt.getName());
            }
          }

          System.out.println("SUPER CLASS:  ");
          if(!clz.getSuperclass().getName().isEmpty()){
            System.out.println("Super Class: " + clz.getSuperclass().getName());

          }

     System.out.println("DECLARED CLASS:  ");
     if(!clz.getName().isEmpty()){
          System.out.println("Super Class: " + clz.getName());

     }
     else{
        System.out.println("nothing to print: NULL");
     }
   }

  //public abstract void inspectMethod();
  //public abstract void inspectConstructor();


  private void inspectSuperClass(Object obj ){


      System.out.println("INSPECTING SUPER CLASS: ");

      Class superClass = null;

      if(superClass.getSuperclass() != null){
        System.out.println("Super Class: " + superClass.getSuperclass().getName());
      }

      if(superClass.getInterfaces() != null){
          System.out.println("Super Class: " + superClass.getInterfaces());
      }
      //inspectClasses(obj,recursive,clz);
  }

}
