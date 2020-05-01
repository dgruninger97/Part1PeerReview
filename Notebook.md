# Part 1 Peer Review

## Date -- 4/29/2020

## Final Class Diagram

![Class Diagram](images/ClassDiagram.PNG)

## Final Sequence Diagram

![Sequence Diagram](images/SequenceDiagram.PNG)

## Discussion

### To what extent did the peer’s design function?

It functioned, but required a decent amount of change on my end to get it to work. There were a couple issues that would have caused compile errors; the
interface had fields in it and there needed to be parameters passed into the integrationMethod(). Additionally, there was no main method, so I was confused
on where the program would actually start. Lastely, there were no actual implementations of the IntegrationMethod interface. These were all minor issues that
I was able to fix, but it did require a fair amount of code to be changed from the initial class diagram.

### To what extent did the design favor composition over inheritance?

The initial design didn't favor composition over inheritance for a simple reason; there were no actual implementations of the IntegrationMethod class. If there
were implementations of IntegrationMethod, then it would have favored composition over inheritance.

### To what extent did the design program to interfaces?

The design did a good job programming to interfaces. It used the IntegrationMethod interface to hold the integrate() method, and the NumericalIntegration class
had a reference to that interface. One small issue was that the design gave the interface some fields, which is wrong, so I removed them.

### To what extent was the design loosely coupled? Were there any trainwrecks?

This question is somewhat difficult to answer, because there are really only two classes in the class diagram that mattered to actually calculate
integration. So in terms of those two classes, yes they are loosely coupled and there were no trainwrecks. There was only one association between NumericalIntegration and IntegrationMethod.
But again, keep in mind that only two of the seven classes shown in the class diagram actually had to do with calculating integrals.

### To what extent was the design cohesive? Did it violate Single Responsibility Principle anywhere?

The design was very cohesive. Both the NumericIntegration class and the IntegrationMethod class have **only one reason to change.** They both carry out one
responsibility and demonstrated high cohesion.

### Was there anything that your peer’s design/notebook lacked that would have made life easier for you?

Yes. I don't think it was necessary to include the classes that were not related to the actual Numeric Integration layer of the architecture. Additionally,
there should not have been fields inside of the interface. Finally, it would have been easier to understand if there was at least one concrete implementation
of the IntegrationMethod.

### In retrospect: was there anything that your notebook was lacking that would have made life easier for someone else?

Yes. I probably should have noted that my ConcreteImplentations of the IntegrationMethod were not actually going to be the real concrete implementations, they were
just there to be placeholders.

### Time Spent - 3 hours (includes implementing the actual design)

# Part 2 Decorator

## Date -- 4/30/2020

### Candidate Design 1

For my first candidate design, I propose that we give the IntegrationMethod interface an abstract decorator called **IntegrationDecorator**. That abstrct decorator will have
one concrete Decorator implementation, called AreaUnderTheCurveDecorator. In the AreaUnderTheCurverDecorator's integrate method, it will call Math.abs(integrate()),
so that the integrals are properly calculated.

#### Pros

This approach will do a very good job of **adding additional responsibilities to an object dynamcially.** Additionally, this design will allows us to add on additional
functionality to our integration methods in the future. Also, we don't have to change **any existing code** to add on the decorators.

#### Cons

We will have to add additional an additional dependency between the NumericanIntegration class and the actual AreaUnderTheCurveDecorator. Also if this ends up being
our only additional functionality added to the IntegrationMethod, than this would be an overall design decision, and you could simply override the integrate
method in another class to do the job with less code. However, it is likely that the design will in fact change in the future.


### Candidate Design 2

#### Pros

#### Cons