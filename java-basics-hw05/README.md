# java-basics-hw05

This is a homework for the Java Constructors

## IntelliJ IDEA project configuration
1. Clone this project to your local environment

    ```git clone https://github.com/kermek/java-basics-hw05.git``` 
2. Import in IntelliJ IDEA using `File -> New -> Project from Existing Sources...`.
3. Select the directory that you cloned to.
4. Go through the `Import Project` wizard by clicking `Next`.
5. On `Please select project SDK` point it to your Java 1.8 JDK.
6. Press `Ctrl+Alt+Shift+S` (`Command + ;`) and check that in your `Project Structure`.
    value of `Project language level` is set to `8 - Lambdas, type annotations et.`.
7. Open test class, put your cursor on `@Test` annotation, press `Alt+Enter` 
    and choose `Add 'testng' to classpath`.  
8. Set the value to `org.testng:testng:6.14.3` and mark checkbox `Download to`.
9. Complete all TODO tasks. Do not change the test class.
10. Uncomment `BirdTest` body and execute tests. 


## Birds assignment

Develop base class Bird.
Develop abstract classes FlyingBird and NonFlyingBird.
FlyingBird should have method checkWings().
Create class Eagle, Swallow, Penguin and Kiwi. 
Implement methods in the Zoo class:
 - add a bird to the list
 - feed different bird sections of the zoo
 - add birds to a flying section of the zoo
Uncomment tests and execute them.
All test should pass.
```text
                |-------|
                | Bird  |
                |-------|
                    |
           ------------------------
           |                      |
     |----------|          |-------------|
     |FlyingBird|          |NonFlyingBird|
     |----------|          |-------------|         
           |                      | 
    --------------            ----------
    |            |            |        |
|-----|     |--------|    |-------|  |----|
|Eagle|     | Swallow|    |Penguin|  |Kiwi|
|-----|     |--------|    |-------|  |----|        
```

## Unit testing
There are number of different ways to run your unit tests, e.g.:
* In test class put your cursor on its definition, right click and choose `Run ...`
* Right click on a little green triangle near the class definition and choose `Run ...`
* In test class put your cursor on its definition and press `Ctrl+Shift+F10` (`Control+Shift+R`)
* Once you executed your test you could re-run it again by pressing `Shift+F10` (`Control+R`)
