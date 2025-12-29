A)Project Overview
The purpose of this project is to show core OOP concepts in Java through our Vehicle Management System. This system models different types of vehicles and their drivers, allowing vehicles to start and stop engines and display some information. As a superclass we have Vehicle, therefore , Car, Motorcycle, and Truck inherit common properties from Vehicle. The Vehicle class is abstract and uses abstract methods like start and stop engine. Each Vehicle object contains a Driver object, One driver object can be associated with multiple Vehicle objects.

B)
Superclass: Vehicle, that contains common fields like driver info, brand and year of the vehicle
Subclasses: Car, Truck, Motorcycle
The abstract methods startEngine() and stopEngine() are overridden in each subclass: and prints Start and Stop of the engine work.
There are 3 access modifiers: Private(to ensure encapsulation), protected(to give access to common fields)
Public(for methods and constuctors

C)
To run it:
java Main

D) docs folder

E)Inheritance simplified the design of the system by allowing common attributes and methods to be placed in the abstract Vehicle class.
Instead of duplicating code in each vehicle type shared functionality was implemented once and reused by all subclasses.
Method overriding helped customize behavior by allowing each vehicle type to define its own engine behavior.
This made the program more flexible and easier to extend with new vehicle types in the future.
One challenge was correctly using protected access modifiers.
While protected allows subclasses to access fields, it requires careful design to avoid breaking encapsulation.
Understanding the difference between protected and default access was the most important challenge that I faced
