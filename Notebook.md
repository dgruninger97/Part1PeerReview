# Part 1 Peer Review

## Date -- 4/29/2020

## Final Class Diagram

![Class Diagram](images/ClassDiagram.PNG)

## Final Sequence Diagram

![Sequence Diagram](images/SequenceDiagram.PNG)

## Discussion

### To what extent did the peer’s design function?

It did not function. Not only were there classes that did nothing in the class diagram but had methods in the sequence diagram, there were cases where
classes had really no purposed but were passed around sort of like a black box for what to do. This left me very confused and I was not able to reasonably
implement the design based off of what I was given. Additionally, there were cases where association arrows and implementation arrows were mixed, making the
design more confusing overall.

### To what extent did the design favor composition over inheritance?

This design did a decent job favoring composition over inheritance. It uses an IntegrationMethod interface which is implemented by a NumericalIntegration
class. I assume that the author intends for there to be multiple instances of classes which implement IntegrationMethod and make use of encapsulating the family
of NumericalIntegration algorithms; however it is not shown in the class diagram.

### To what extent did the design program to interfaces?