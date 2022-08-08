#### Strategy Pattern
The Strategy Pattern defines a family of algorithms, encapsulates each one, and makes them interchangeable. Strategy lets the algorithm vary independently from clients that use it.

###### Problem statement:

We have a variety of ducks with different looks, flying and quacking capabilities.
In future we may see new capabilities like how the ducks walk,eat,breathe, etc

###### Solution:

We have separated the part of code that varies from the part that remains unchanged.
Flying and Quacking features are no longer inherited (is-a) but have been composed (has-a) by making flying and quacking features an interface.
Different Implementations define different ways of showing flying and Quacking behaviour