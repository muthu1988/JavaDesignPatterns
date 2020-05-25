# JavaDesignPatterns
Design Principles and Design Pattern Examples for Java

    Single Responsibility Principle 
        
        - Separation of concerns 

    Open Closed Principle 

        - classes should be open for extension, closed for modification

        - specification pattern shows implementation of OCP

    Liskov Substitutional Principle

        - Able to substitute a base type for a sub type

        - Don't substituting parent class params from child class

        - Avoid creating child class if it can be dealt with any flag in parent class

        - Use factory pattern to modify parent class parmas while creating object

    Interface Segregation Principle 

        - Create segregated interface such that a client don't have to implement unnecessary methods (YAGNI)

    Dependency Inversion Principle 

        - High level modules should not depend on low level modules (use abstraction)

    ##Gamma Categorization

    Creational - Object creation

    Structural - Structure, Wrappers, good API design

    Behavioral - No theme

    ##Creational 

        Builder - Step by step creation of object

            - Builder, Fluent Builder, Fluent builder Inheritance with Recursive Generics, Faceted Builder

        Factory - Methods that create complete objects for us

            - Factory mtd - static methods in class with private constructor

            - Factor - inner static class with static factory mtd and constructor private

        ProtoType - Create a new object with state of an existing type

            - can use clone, but not advisable as it ment for shallow copy

            - constructor copy is more advisable

            - serialization and deserialization is a easy way to do so without any code change

        Singleton - 

            - Basic singleton - private constructor, static final instance initialized, get instance mtd

            - Avoid serialization issue - use read resolve and return existing instance

            - Static block singleton - create object in static block if constructor throws error

            - Laziness and Thread safe - create object only when requested in get instance mtd, use synchronized or double check

            - Inner static class - thread safe without synchronized keywords

            - MonoState - make all fields static, though user can create many instances, they all will share same state

            - Multiton - restricts the number of instances created, returns existing instance if its already created

            - To make UT for singleton - make use of dependency injection

    Structural

        Adapter - A construct which adapts an existing X to conform to the required interface Y

            - Uses an Adapter class that implements the class into which the adaption has to happen

            - Adapter class has a constructor that takes the object that is to be adapted

            - Adapter class will override the mtd of class into which the adaption has to happen

        Bridge - Decouple an interface hierarchy from an implementation hierarchy

            - Add the interface as a constructor parameter at the top most object

            - Pass the implementations of the interface from the object sub types

            - Doing so will avoid creation of multiple object sub types for each interface implementation

        Composite - Mechanism for treating individual object and composite of object in same manner

            - Create an interface that implements Iterable

            - Make the Single object and Group object implement the Iterable

            - override method in single object with Collection.singleton of this

        Decorator - Facilitates addition of behavior to an object without inheriting 

            - Dynamic decorator - Takes objects in constructor and adds additional behavior

            - Static decorator - Takes constructor as suppliers in decorator constructors and adds additional behavior

        Facade - Provides a easy and simple to understand user interface for a large and sophisticated body of code

        Flyweight - Space optimization technique that lets us use less memory by storing externally the data associated with similar objects

        Proxy - Class that functions as an interface to a particular source. That resource may be remote, expensive to construct, or may require logging or some other added functionality

            - Protection Proxy - protect behavior of an object

            - Property Proxy - Wrapper property that holds the original value and keeps track of getting and setting object

            - Dynamic Proxy - Proxy created at runtime, wrapper around a object to intesept every method calls in it

    Behavioral

        Chain Of Responsibility - a chain of components who all get a chance to process a command or query, optionally having default processing implementation and an ability to terminate the processing chain

            - Method chain - Modifier takes a next modifier as itself and does a chain operation

            - Broker chain - 

        Command - Object which represents an instruction to perform a particular action (enables undo)

            - Command object that stores all actions and can also enable undo

        Interpreter - A component that process structured text data (lexing and parsing).

            - Lexing - basically spits the text into tokens with type associated to them

            - Parsing - parses the tokens so that we can evaluate to get output

        Iterator - Object that facilitates the traversal of a data structure

            - Create iterators for data structures and traverse them

            - Eg. Binary tree Inorder and Preorder traversal done with help of Node Object

        Mediator - Component that provides communication among other components, without having any direct reference to each other

            - Chat room is a good example where chatroom acts as a Mediator

            - Event brokers with reactive extensions are advanced implementation of Mediator

        Memento -  Token or Handle representing the system state.

            - Enables us to rollback to the state when the token was generated

        Null Object - A no op object that satisfies a dependency by confirming to a required interface 

            - Create an Null object that implements all methods and does nothing, also doesn't break anything when passed as dependency

        Observer - Object that wishes to be informed about events happening in the system

            - Can be implemented by creating Observer & Observable interface (but not advisable)

            - Use Event class which can return subscription by taking consumer as arg

        State - Pattern in which obj behavior is determined by its state, formalized construct that manages the state and transition in called state machine

            - Spring state machine - Framework to make state transmission

        Strategy - Enables the exact behavior of a system to be selected either at run time or compile time

            -  Interface which defines the strategy, with implementation classes

            - Dynamic and Static strategy using the implementation classes

        Template - Allows us to define the 'skeleton' of the algorithm with concrete implementations in sub class

                - Abstract class with skeleton and main methods which in turn calls the methods in sub class

        Visitor - pattern where a component(visitor) is allowed to traverse the entire hierarchy. Implemented by propagating a single visit method

            - Intrusive visitor - visitor in each class

            - Reflective - common class with instance of to identify the logic
            
            - Double dispatcher - sub classes will dispatch the visitor

