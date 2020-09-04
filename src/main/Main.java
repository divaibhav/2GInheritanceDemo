/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 04-Sep-20
 *  Time: 1:26 PM
 */
package main;

import inheritance.derived.Derived;

public class Main {
    public static void main(String[] args) {
        // creating object of derived and using it for calling base methods
        Derived object = new Derived();
        //calling derived class metho
        object.print();
        //calling base class methods
        object.display();
        object.greet();
    }
}
