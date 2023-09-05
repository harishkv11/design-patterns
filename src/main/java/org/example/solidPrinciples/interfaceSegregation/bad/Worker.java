package org.example.solidPrinciples.interfaceSegregation.bad;


/*
One interface is executing several function. Let's say there situation arises where a class doesn't want to implement either of the
function. But this implementation does not allow. The class has to implement both. Thus we need to break into FactoryWorker and OfficeWorker
interfaces which classes can implement individually.
 */
public interface Worker {
    void doFactoryWork();
    void doOfficeWork();
}
