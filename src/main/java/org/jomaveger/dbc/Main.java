package org.jomaveger.dbc;

import org.jomaveger.dbc.collections.CStack;
import org.jomaveger.dbc.collections.IStack;

/**
 *
 * @author jmvegas.gertrudix
 */
public class Main {
    public static void main(String[] args) {
        IStack<Integer> pila = new CStack<>();
        pila.pop();
    }
}