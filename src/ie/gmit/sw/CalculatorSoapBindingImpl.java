/**
 * CalculatorSoapBindingImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ie.gmit.sw;

public class CalculatorSoapBindingImpl implements ie.gmit.sw.Calculator_PortType{
	
	private Calculator c = new CalculatorImpl();
	
    public int add(int in0, int in1) throws java.rmi.RemoteException {
        return c.add(in0, in1);
    }

    public double divide(int in0, int in1) throws java.rmi.RemoteException {
        return c.divide(in0, in1);
    }

    public int multiply(int in0, int in1) throws java.rmi.RemoteException {
        return c.multiply(in0, in1);
    }

    public int subtract(int in0, int in1) throws java.rmi.RemoteException {
        return c.subtract(in0, in1);
    }

}
