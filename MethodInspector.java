
import java.util.*;
import java.lang.reflect.*;
import java.lang.*;
import java.lang.reflect.*;
import static java.lang.System.out;
import static java.lang.System.err;


public class MethodInspector extends FieldInspector{
    Class clz;
  	Constructor constructor;
  	Object obj;
  	Method meth;

    public MethodInspector(){

    }


    private void inspectMethod(Object obj){

          System.out.println("Method:  ");
          Method[] methods = clz.getDeclaredMethods();
          for(Method m : methods ){
            if(m.getDeclaringClass().equals(obj.getClass())){
              // taken from TA example
              out.println("   Modifier: "+ Modifier.toString(m.getModifiers())  + " \n   Return Type: "+ m.getReturnType() +   " \n   Name:"  + m.getName() );
			        Parameter[] param = m.getParameters();
			        out.println("Parameters: " );

			        for(Parameter p:param){
				          out.println("   Type: " + p.getType());
				          out.println("   Name: " + p.getName());
			        }
			        System.out.println();
		        }

            for (Class throwException : m.getExceptionTypes()) {
						     System.out.println("Exception Throws: " + throwException.getName());
					  }
        }
    }

    private void inspectConstructor(Object obj){

      System.out.println("Constructor:  ");
      Constructor[] constructor = clz.getConstructors();
      for(Constructor c : constructor){
        out.println("   Modifier: "+ Modifier.toString(c.getModifiers()) + " \n   Name:"  + c.getName() );
        Parameter[] param = c.getParameters();
        out.println("Parameters: " );

        for(Parameter p : param){
            out.println("   Type: " + p.getType());
            out.println("   Name: " + p.getName());
        }
        System.out.println();
      }

    }

}
