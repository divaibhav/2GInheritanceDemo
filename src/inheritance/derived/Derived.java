/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 04-Sep-20
 *  Time: 1:17 PM
 */
package inheritance.derived;

import inheritace.base.Base;

// this is our derived class which will inherit base class
// to inherit a class we will use a keyword --> extends
public class Derived extends Base {
    //this class also contains parent or base class functionality
    //defining a new method that is specific to derived class
    public void print(){
        System.out.println("vaibhav, from derived class");
    }
}
