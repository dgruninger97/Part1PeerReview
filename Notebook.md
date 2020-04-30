# Part 1 Peer Review

## Date -- 4/29/2020

## Final Class Diagram

![Class Diagram](images/ClassDiagram.PNG)

## Final Sequence Diagram

![Sequence Diagram](images/SequenceDiagram.PNG)

## Discussion

### To what extent did the peer’s design function?

It functioned, but required a decent amount of change on my end to get it to work. There were a couple issues that would have caused compile errors; the
interface had fields in it and there needed to be a function passed into the integrationMethod(). Additionally, there was no main method, so I was confused
on where the program would actually start. Lastely, there were no actual implementations of the IntegrationMethod interface. These were all minor issues that
I was able to fix, but it did require a fair amount of code to be redesigned or changed.

### To what extent did the design favor composition over inheritance?

This design did a decent job favoring composition over inheritance. It uses an IntegrationMethod interface which is implemented by a NumericalIntegration
class. I assume that the author intends for there to be multiple instances of classes which implement IntegrationMethod and make use of encapsulating the family
of NumericalIntegration algorithms; however it is not shown in the class diagram.

### To what extent did the design program to interfaces?

As mentioned above, the IntegrationMethod interface was implemented by the NumericalIntegraiton class, which I assume will actually execute the integration desired
by the client.