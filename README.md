## Practice Set 1
These cover various topics such as arithmetic operations, conditions, loops, and user input handling:

### 1. Sum and Average of Numbers
**Problem**: Write a program that takes a list of numbers as input, calculates their sum, and computes the average.

### 2. Multiplication Table
**Problem**: Write a program that generates the multiplication table of a given number up to 10.

### 3. Prime Number Checker
**Problem**: Write a program that checks if a given number is a prime number.

### 4. Fibonacci Sequence
**Problem**: Write a program that prints the first N numbers in the Fibonacci sequence.

### 5. Palindrome Checker
**Problem**: Write a program that checks if a given string is a palindrome (reads the same forward and backward).

### 6. Temperature Converter
**Problem**: Write a program that converts temperatures from Celsius to Fahrenheit and vice versa.

### 7. Simple Calculator
**Problem**: Write a program that performs basic arithmetic operations (addition, subtraction, multiplication, division) based on user input.

### 8. Number Guessing Game
**Problem**: Write a program that generates a random number between 1 and 100 and lets the user guess the number, providing feedback on whether the guess is too high or too low.

### 9. Factorial Calculation
**Problem**: Write a program that calculates the factorial of a given number using both for and while loops.

### 10. Armstrong Number Checker
**Problem**: Write a program that checks if a given number is an Armstrong number (a number that is equal to the sum of its own digits each raised to the power of the number of digits).

### 11. Reverse a Number
**Problem**: Write a program that takes a number as input and outputs its reverse.

### 12. Count Vowels and Consonants
**Problem**: Write a program that takes a string as input and counts the number of vowels and consonants in the string.

### 13. Find the Largest and Smallest Number
**Problem**: Write a program that takes a list of numbers and finds the largest and smallest number in the list.

### 14. Sum of Digits
**Problem**: Write a program that calculates the sum of the digits of a given number.

### 15. Check for Leap Year
**Problem**: Write a program that checks if a given year is a leap year.

### 16. Print a Diamond Pattern
**Problem**: Write a program that prints a diamond pattern using stars (*).

### 17. Matrix Addition
**Problem**: Write a program that performs matrix addition of two 2x2 matrices.

### 18. Binary to Decimal Conversion
**Problem**: Write a program that converts a binary number (entered as a string) to its decimal equivalent.

### 19. Simple Interest Calculator
**Problem**: Write a program that calculates simple interest based on user input for principal, rate of interest, and time.

### 20. Count Positive, Negative, and Zero Numbers
**Problem**: Write a program that takes a list of numbers and counts how many are positive, negative, and zero.

## Practice Set 2
These cover defining and using methods in Java, including function parameters, return types, method overloading, and combining methods for practical problem-solving:

### 1. Basic Function Definition
**Task**: Write a method `greet` that takes a string parameter `name` and prints "Hello, name!".

### 2. Function with Return Type
**Task**: Write a method `multiply` that takes two integer parameters and returns their product.

### 3. Method Overloading
**Task**: Create overloaded methods `printInfo`:
- One that takes a string and prints it.
- Another that takes an integer and prints it.
- Another that takes a string and an integer, and prints them both.

### 4. Calculations with Parameters
**Task**: Write a method `calculateArea` that calculates the area of a rectangle. Use method overloading to handle both integer and double parameters.

### 5. Combining Multiple Methods
**Task**:
- Write a method `isEven` that takes an integer and returns true if the number is even, otherwise false.
- Write another method `printEvenNumbers` that takes an array of integers and uses the `isEven` method to print all even numbers in the array.

### 6. Overloaded Method with Different Return Types
**Task**: Write overloaded methods `findMax`:
- One that takes two integers and returns the larger one.
- Another that takes two doubles and returns the larger one.
- Another that takes three integers and returns the largest one.

## Practice Questions for Java OOP Concepts
### 1. Basic Class and Object Creation
1. **Library System**: Design a class `Book` with attributes like title, author, and ISBN. Create a method `displayDetails()` that prints the details of the book.
2. **Bank Account**: Create a `BankAccount` class with attributes for accountNumber, accountHolderName, and balance. Add methods to deposit money, withdraw money, and check the balance.
3. **Student Information**: Design a `Student` class with name, studentID, and grade as attributes. Implement a method to display the student’s details.
4. **Car Details**: Define a `Car` class with make, model, and year as attributes. Include a method to display the car’s information.
5. **Product Catalog**: Create a `Product` class with productName, price, and quantityInStock as attributes. Add methods to update the price and check stock levels.

### 2. Encapsulation
6. **Person Profile**: Design a `Person` class with name, age, and email. Use private access modifiers for the attributes and provide public getter and setter methods for each.
7. **Employee Details**: Create an `Employee` class with employeeID, name, and salary. Ensure the salary field is private and provide methods to set and get the salary.
8. **Library Management**: Design a `Library` class that has a list of `Book` objects. Use private access for the list and provide public methods to add books and list all available books.
9. **Rectangle Operations**: Create a `Rectangle` class with length and width as private attributes. Provide public methods to calculate area and perimeter.
10. **Account Management**: Define an `Account` class with private attributes for accountNumber and balance. Implement methods for deposit, withdraw, and to get account details.

### 3. Inheritance
11. **Animal Kingdom**: Create a base class `Animal` with a method `makeSound()`. Extend it with subclasses `Dog` and `Cat`, overriding `makeSound()` to make specific animal sounds.
12. **Employee Hierarchy**: Define a base class `Employee` with attributes for name and position. Create subclasses `Manager` and `Intern`, each with additional attributes and methods.
13. **Shape Hierarchy**: Design an abstract class `Shape` with an abstract method `draw()`. Extend it to create `Circle` and `Rectangle` classes, each implementing the `draw()` method.
14. **Vehicle Inheritance**: Create a `Vehicle` class with speed and capacity as attributes. Extend it to create `Car` and `Bicycle` classes, adding specific features for each.
15. **Person Subclasses**: Define a `Person` class with basic attributes. Create `Student` and `Teacher` subclasses that add more specific attributes like studentID for `Student` and subject for `Teacher`.

### 4. Polymorphism
16. **Shape Drawing**: Create a base class `Shape` with a method `draw()`. Implement `Circle` and `Square` classes with different implementations of `draw()`. Demonstrate polymorphism by calling `draw()` on a `Shape` reference.
17. **Animal Sounds**: Define a `SoundMaker` interface with a method `makeSound()`. Implement it in `Dog` and `Bird` classes with different sounds. Use an `ArrayList` to store `SoundMaker` objects and invoke `makeSound()` on each.
18. **Media Player**: Create an interface `Playable` with a method `play()`. Implement it in `Music` and `Video` classes. Demonstrate polymorphism by creating an array of `Playable` objects and calling `play()` on each.
19. **Employee Tasks**: Design a `Task` class with a method `performTask()`. Extend it to create `CodingTask` and `MeetingTask` classes, each with a different implementation of `performTask()`. Show polymorphism in action.
20. **Payment Processing**: Create an abstract class `Payment` with an abstract method `processPayment()`. Implement it in `CreditCardPayment` and `PayPalPayment` classes. Demonstrate polymorphism by processing different types of payments.

### 5. Abstraction
1. **Music Player Application**:
   - Create an `AudioPlayer` class that uses an abstract `MediaFile` class for playing audio files. Implement concrete classes like `MP3File` and `WAVFile` inheriting from `MediaFile`, each implementing its own `play` method.
2. **E-commerce Order Processing**:
   - Define an abstract `Order` class with methods like `processOrder`, `cancelOrder`, and `calculateTotalPrice`. Extend this class to concrete order types (e.g., `OnlineOrder`, `InStoreOrder`) with specialized implementations.

### 6. Packages and Access Modifiers(These are performed but not Created)
21. **Package Organization**: Create a package `com.company.project` and add classes `Employee` and `Department`. Show how to organize these classes and use them from

 a different package.
22. **Access Control**: Define a `Vehicle` class with private attributes `make` and `model`. Create getter and setter methods with different access modifiers to illustrate the use of public, protected, and private.
23. **Library Structure**: Design a package for a library management system with `Book`, `Member`, and `Library` classes. Show how to create and use these classes across different packages.
24. **Access Modifiers Practice**: Create a `Person` class with public, protected, and private members. Demonstrate access to these members from a different class in the same package and from a subclass.
25. **Banking System Packages**: Define a package `com.bank` with classes `Account`, `SavingsAccount`, and `CheckingAccount`. Show how to use access modifiers to manage data between these classes.
