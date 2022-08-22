# cars-and-drivers
This is a project intended to teach the basics of classes, access modifiers, and encapsulation

A class is a blueprint to create an object. An object is a collection of aligned variables, called fields, and methods.

At its simplest, an object is used like any other variable. It is declared the same way, and it is initialized with the new keyword:

```
Animal animal = new Animal();
```
Note: The object has to be added as an import to be used like this. Begin typing the capitalized class word, then once the dropdown has selected the correct class, press enter, autocompleting the Class and auto adding the required import.

The new keyword is followed by the object's class name (capitalized), as well as parenthesis. This name and parenthesis are called a Constructor.
A Constructor is the method which is called to create a new instance of an object.

An object is created from a class. The only things required for that class are a name and a Constructor. If no Constructor is defined in the class, a default Constructor is assigned which takes no arguments. This is refered to as a No Args Constructor. Here is an example of an Animal class with an explicit No Args Constructor:

```
public class Animal{

  public Animal(){
  
  }

}
```

Typically, an object's class will have some variables of its own, called fields. Let's create two, numberOfLegs and kingdom. When an object has fields, it is common for there to be a Constructor which takes all of them as arguments. The constructor is a method, so its variables are block-scoped. To pass them to the class, use the this keyword and the dot operator. The Class and Constructor look like this:

```
public class Animal{

  private int numberOfLegs;
  private String kingdom;
  
  public Animal(int numberOfLegs, String kingdom){
    this.numberOfLegs = numberOfLegs; //This is fine because this.numberOfLegs refer's to the class's field, and numberOfLegs refer's to the code block's
    this.kingdom = kingdom;
  }

}
```

This creates an object with its fields initialized to the values which are passed into the object's Constructor.

An object's class definition can have any number of Constructors, so long as they have a unique method signature.

In this project, you will implement both a No Args Constructor and the Constructor which already exists within the repo.

Additionally, there is a principle of Object Oriented Programming called Encapsulation. Simply put, it states that information should only be accessed by things which should have access to it. Practically, that means that an object's fields should not be accessible by whichever class has instantiated the object. By using the private keyword in front of the class's variables, it becomes inaccessible from the outside. There still needs to be a way to access these fields, however, and the way that this is done is with special methods called getters and setters. These methods specifically retrieve or set the field they're named after. Here is an example:

```
public class Animal{

  private int numberOfLegs;
  private String kingdom;
  
  public Animal(int numberOfLegs, String kingdom){
    this.numberOfLegs = numberOfLegs;
    this.kingdom = kingdom;
  }

  public int getNumberOfLegs(){
    return this.numberOfLegs;
  }
  
  public String getKingdom(){
    return this.kingdom;
  }
  
  public void setNumberOfLegs(int numberOfLegs){
    this.numberOfLegs = numberOfLegs; //this works the same way the Constructor does
  }
  
  public void setKingdom(String kingdom){
    this.kingdom = kingdom;
  }
}
```

This is how to explicitly create getters and setters for an object's fields. However, there are some shortcuts we can use. So long as the dependency Project Lombok is added to your gradle build, you can use these annotations to reduce boilerplate code:

```
@Getter //this creates get methods for all your fields
@Setter //this creates set methods for all your fields
@NoArgsConstructor //this creates a No Args Constructor for your class
@AllArgsConstructor //this creates an All Args Constructor for your class
@RequiredArgsConstructor //this creates a constructor requiring all arguments that are required for your class to work
@ToString //this creates a .toString() method for your class which neatly presents the class and all its fields and their values in a String
@EqualsAndHashCode //this creates a .equals() and .hashCode() method for your class, allowing objects to be compared by their values instead of their memory locations
@Data //this is equivalent to @Getter, @Setter, @RequiredArgsConstructor, @ToString, and @EqualsAndHashCode all at once
```
While you're typing this annotation, the option to import them will appear in a dropdown list. Type part of the annotation, then hit enter to both autocomplete the annotation and add the required import statement.

I can simply use these annotations to remove boilerplate code and reduce it to this:

```
@Data
@NoArgsConstructor
public class Animal{

  private int numberOfLegs;
  private String kingdom;

}
```

To use this project, clone the repo into a folder on your machine.
Right click the folder and open it as an IntelliJ IDEA project.

On the left navigation window, there is a test folder. You can right click it to run the tests in the repo. When they are all passing, you have successfully completed this lesson.

To complete them, you will need to implement the fields which are listed in the Constructors.
You will need to implement getters and setters for these fields.
You will need to implement a No Args Constructor.
You will need to implement a .toString() method.
You will need to implement a .equals() method.

Complete these steps for the Driver class first, then complete them for the Car class.

Good luck.
