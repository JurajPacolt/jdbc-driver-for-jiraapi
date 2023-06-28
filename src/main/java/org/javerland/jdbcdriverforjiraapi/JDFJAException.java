/* Created on 28.06.2023 */
package org.javerland.jdbcdriverforjiraapi;

/**
 * @author juraj.pacolt
 */
public class JDFJAException extends RuntimeException {

    public JDFJAException() {
        super();
    }

    public JDFJAException(String msg) {
        super(msg);
    }

    public JDFJAException(Throwable th) {
        super(th);
    }

    public JDFJAException(String msg, Throwable th) {
        super(msg, th);
    }

}
