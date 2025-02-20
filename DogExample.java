/*
 * Demo: How to create an array of objects.
 */
package dogexample;


public class DogExample {

    
    public static void main(String[] args) {
        Dog d = new Dog("Mosi", "Portuguese Water Dog", 8);
        //System.out.println(d);
        //create array
        Dog [] myArray = new Dog[4];
        //create each element of the array
        myArray[0]= d;
        myArray[1]= new Dog("Buster", "Pit Bull", 2);
        myArray[2]= new Dog("Mimi", "Poodle", 4);
        myArray[3]=new Dog("Princess", "Spaniel", 5);
        
        for(int k=0; k<4; k++)
            System.out.println(myArray[k]);
        //alternate way to print an array
        for(Dog k: myArray)
            System.out.println(k);
        System.out.println("");
        //another way of creating an array of objects
        //similar to 
        //int[] A = {3,7,9,1};
      
        Dog [] myB = {new Dog("Mitzi", "Pug", 2), new Dog("Marty", "German Shepherd", 6), new Dog("Louis", "Corgi", 5)};
      for(Dog k: myB)
            System.out.println(k);
    }//main  
}
