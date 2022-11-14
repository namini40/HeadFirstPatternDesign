## The Strategy Pattern
- defines a family of algorithms, encapsulates each one, and makes them interchangeable. Strategy lets the algorithm vary independently from clients that use it.
---
### Design principle : Favor composition over inheritance
As you’ve seen, creating systems using composition gives you a lot more flexibility. Not only does it let you encapsulate **a family of algorithms** into their own set of classes, but it also lets you change behavior at **runtime** as long as the object you’re composing with implements the correct behavior interface