/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package except;

/**
 *
 * @author 2dam
 */
public class LoginFormatException extends Exception {

    /**
     * Creates a new instance of <code>LoginFormatException</code> without
     * detail message.
     */
    public LoginFormatException() {
        super("Error with the format of the login, can't start with a number");
    }

    /**
     * Constructs an instance of <code>LoginFormatException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public LoginFormatException(String msg) {
        super(msg);
    }
}
