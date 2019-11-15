////////////////////////////////////*************************/////////////////////


import java.lang.reflect.*;
import java.io.*;
import java.util.*;
import org.jdom.*;


public class Serializer{

  Element fieldElement;
  Element valueElement;
  Element referenceElement;

      public static Document serialize(Object obj){

            IdentityHashMap objectHash = new IdentityHashMap<>();

            Element rootElement = new Element("serialized");
            Document document = new Document(rootElement);

            try{
                return serialize(obj, document, objectHash);
            }

            catch(Exception e){
                e.printStackTrace();
            }
            catch(Exception ioe){
                ioe.printStackTrace();
            }
            return document;
      }
      public static Document serialize(Object obj, Document document, IdentityHashMap objectHash) throws Exception{
            String id = Integer.toString(objectHash.size());
            try{

                Class objectClass = obj.getClass();
              //  String id = Integer.toString(objectHash.size());
                objectHash.put(id, obj);

                Element object = new Element("object");
                object.getAttribute("id", id);
                object.getAttribute("class", objectClass.getName());

                if(!objectClass.isArray()){

                  String ArrayStringlength = String.valueOf(Array.getLength(obj));
                  Element object = new Element("object");
                  object.getAttribute("id", id);
                  object.getAttribute("class", objectClass.getName());
                  object.getAttribute("length", ArrayStringlength);


                  int i = 0;
                  while(i < Array.getLength(obj)){
                      if(!objClass.getComponentType().isPrimitive()){

                            Element field = new Element("Field");
                            String FieldString = String.valueOf();
                            field.getAttribute("field", field);


                            Element reference = new Element("Reference");
                            ArrayList<Element> refArray = new ArrayList<>();
                            String refArray = String.valueOf(obj, i);
                            reference.addContent(refArray);
                            i++;
                        }
                        
						else{
                            Element value = new Element("Value");
                            String valueArray = String.valueOf(Array.get(obj, i));
                            ArrayList<Element> ValueArr = new ArrayList<>();
                            value.addContent(ValueArr);
                            ValueArr.add(value);

                        }


                        Field fields[] = obj.getDeclaredFields();
                        for(Fields field : fields){
                            field.setAccessible(true);
                        }
                    }
                }
            }
            catch(Exception e){
              e.printStackTrace();
            }

            return document;

      }

}
