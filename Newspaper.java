/* *****************************************
 *  File : Topic 4 HW Assignment - Newspaper.java
 *  Author : Celia Ho  
 *  Last Modified : Fri Mar 08 2024
 *  Description : Create the following classes
ReadingMaterial
- 	format:String 	print, digital, audio
+ 	ReadingMaterial() 	
+ 	ReadingMaterial(format:String) 	
+ 	getFormat():String 	
+ 	setFormat(String):void 	
+ 	toString():String 	
 
Newspaper  : ReadingMaterial
- 	numPages:int 	must be > 0
+ 	Newspaper() 	
+ 	Newspaper(format:String, numPages:int) 	
+ 	getNumPages():int 	
+ 	setNumPages(int):void 	must be > 0
+ 	toString():String 	must include ReadingMaterial toString
 
Book : ReadingMaterial
- 	numPages:int 	must be > 0
- 	binding:String 	hardcover,softcover,none
+ 	Book() 	
+ 	Book(format:String, numPages:int, binding:String) 	
+ 	getNumPages():int 	
+ 	setNumPages(int):void 	must be > 0
+ 	getBinding():String 	
+ 	setBinding(String):void 	
+ 	toString():String 	must include ReadingMaterial toString

Create a TestReadingMaterial class that instantiates an instance of ReadingMaterial, an instance of Newspaper, and an instance of Book. Create a method in TestReadingMaterial that demonstrates polymorphism with the signature: printReadingMaterial(ReadingMaterial rm) to print each instance and calls the object's toString method - do not use instanceOf in this method. 
 * ******************************************/

 public class Newspaper extends ReadingMaterial {
  
    private int numPages;     // must be > 0
  
    public Newspaper() {
    }
  
    public Newspaper(String format, int numPages) {
      super(format);
      if (numPages < 0)
        numPages = 1;
      this.numPages = numPages;
    }
    
    public int getNumPages() {
      return numPages;
    }
  
    public void setNumPages(int numPages) {
      if (numPages < 0)
      numPages = 1;
      this.numPages = numPages;
    }
  
    @Override   // ***IS THIS CORRECT? Must incl ReadingMaterial toString
    public String toString() {
      return super.toString() + " Newspaper [numPages=" + numPages + "]";
    }
  
  }