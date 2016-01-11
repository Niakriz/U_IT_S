/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uits.jv.lesson17;


import com.sun.corba.se.impl.oa.poa.Policies;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;


/**
 *
 * @author Nia
 */
public class DocumentExample {
    
   private Document d;
    
   public DocumentExample (){
       
       d = DocumentHelper.createDocument();
       
       
   }
   
   public Element addElement(Element node){
       
           
     return null ;
   }
   public void createDocument (){
       
       
       
       Element root = d.addElement("pets");
       Element p1 = root.addElement("pet").addElement("Type").addAttribute("petType", "cat").addElement("organs");
       addOrgan("почка", 10, p1);
       System.out.println(d.asXML());
   }
   public void addOrgan(String name , int quantity,Element e){
       //.addElement("name").addText(name).addElement("quantity").addText(String.valueOf(quantity));
       e.addElement("organ").addElement("property").addAttribute("name", name).addAttribute("quantity", String.valueOf(quantity));

              
   }
    
}
