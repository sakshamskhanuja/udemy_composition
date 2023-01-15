## Composition

### Description

This is an exercise in Class Composition. To complete the exercise, you must create five classes with associated member variables and methods. The five classes should be created as follows:

1. Create a class and name it <b>Lamp</b>. Inside this class should be declared three member variables: <b>style</b> of type <b>String</b>, <b>battery</b> of type <b>boolean</b>, and <b>globRating</b> of type <b>int</b>. All variables should be marked <b>private</b>. A constructor needs to be created which accepts the three member variables as parameters. In addition, four methods should also be created: <b>turnOn()</b> has no return type and should print a message that the lamp is being turned on; <b>getStyle()</b> returns the lamp <b>style</b>; <b>isBattery</b> returns the value of <b>battery</b>; and <b>getGlobRating()</b> returns the <b>globRating</b> of the lamp.

2. Create a class and name it <b>Bed</b>. Five private member variables should be declared: <b>style</b> of type <b>String</b>, and <b>pillows</b>, <b>height</b>, <b>sheets</b>, <b>quilt</b> of type <b>int</b>. A constructor should be coded which accepts these five member variables as parameters. Also, six methods should be defined: <b>make()</b> has no return type and prints a message to the effect that the bed is being made; <b>getStyle()</b> which returns the value of <b>style</b>; <b>getPillows()</b> returns the number of <b>pillows</b>; <b>getHeight()</b> returns the <b>height</b> of the bed; <b>getSheets()</b> returns the number of <b>sheets</b> on the bed; and <b>getQuilt()</b> returns the value of <b>quilt</b>.

3. Create a class with the name <b>Ceiling</b>. There are two member variables for this one, <b>height</b> and <b>paintedColor</b>, both of type <b>int</b>. There should also be a constructor which accepts both member variables as parameters. There are also two additional methods which should be defined: <b>getHeight()</b> shall return the value of <b>height</b> and <b>getPaintedColor()</b> should return the value of <b>paintedColor</b>.

4. Create a class with the name <b>Wall</b>. It contains one member variable, <b>direction</b>, and is of type <b>String</b>. A constructor for Wall should accept one parameter for the member variable <b>direction</b>. A getter should also be defined for the direction field called <b>getDirection()</b>.

5. Create a class with the name <b>Bedroom</b>. This class contains eight member variables: <b>name</b> of type <b>String</b>; <b>wall1</b>, <b>wall2</b>, <b>wall3</b>, <b>wall4</b> of type <b>Wall</b>; <b>ceiling</b> of type <b>Ceiling</b>; <b>bed</b> of type <b>Bed</b>, and <b>lamp</b> of type <b>Lamp</b>. The class constructor should accept all eight of the member variables as parameters, and there should also be two additional methods:<br><br><b>getLamp()</b> which returns an object of type <b>Lamp</b>, and <b>makeBed()</b> which prints a message that the bed is being made and also calls the <b>make()</b> method in the <b>Bed</b> class.

To be sure that the correct output is generated so your code passes the evaluation, use the following statements in your code:

1. System.out.print("Bedroom -> Making bed | "); should be used in the <b>makeBed()</b> method of the <b>Bedroom</b> class.

2. System.out.print("Bed -> Making | "); should be used in the <b>make()</b> method of the <b>Bed</b> class.

3. System.out.println("Lamp -> Turning on"); should be used in the <b>turnOn()</b> method of the <b>Lamp</b> class.

### Test Code

    Wall wall1 = new Wall("West");
    Wall wall2 = new Wall("East");
    Wall wall3 = new Wall("South");
    Wall wall4 = new Wall("North");
     
    Ceiling ceiling = new Ceiling(12, 55);
     
    Bed bed = new Bed("Modern", 4, 3, 2, 1);
     
    Lamp lamp = new Lamp("Classic", false, 75);
     
    Bedroom bedRoom = new Bedroom("YOUR NAME HERE", wall1, wall2, wall3, wall4, ceiling,bed, lamp);
    bedRoom.makeBed();
     
    bedRoom.getLamp().turnOn();
