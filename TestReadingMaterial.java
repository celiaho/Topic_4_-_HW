/* *****************************************
 *  File : Topic 4 HW Assignment - TestReadingMaterial.java
 *  Author : Celia Ho  
 *  Last Modified : Mon Mar 11 2024
 *  Description : Create a TestReadingMaterial class that instantiates an instance of ReadingMaterial, an instance of Newspaper, and an instance of Book. Create a method in TestReadingMaterial that demonstrates polymorphism with the signature: printReadingMaterial(ReadingMaterial rm) to print each instance and calls the object's toString method - do not use instanceOf in this method. 
 * ******************************************/

 public class TestReadingMaterial {

    // Create a method in TestReadingMaterial that demonstrates polymorphism with the signature: printReadingMaterial(ReadingMaterial rm) to print each instance and calls the object's toString method - do not use instanceOf in this method. 
    public static void printReadingMaterial(ReadingMaterial rm) {
        System.out.println(rm); 
    };
    
    public static void main(String[] args) {

        // Instantiate classes
        ReadingMaterial readingMaterial = new ReadingMaterial();
        Newspaper newspaper = new Newspaper("print", 100);
        Book book = new Book("audio", 200, "none");

        // Use method to print each instance
        printReadingMaterial(readingMaterial);
        printReadingMaterial(newspaper);
        printReadingMaterial(book);

    }
}