
import org.jdom.*;
import java.io.*;
import java.util.*;

public class createXMLFile{


      public static void writeXML(){

      }

      public static void readXML(){


      }

      public static void printXML(String fileName){

        try{

          SAXBuilder builder = new SAXBuilder();

          Document document = builder.build(fileName);

          Element element = document.getRootElement();
        }
            
        catch(Exception e){
          e.printStackTrace();
        }
            
        catch(IOException ioe){
          ioe.printStackTrace();
        }

      }
}
