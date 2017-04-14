package org.jomaveger.dbc.collections;

import com.google.java.contract.Ensures;
import com.google.java.contract.Requires;

/**
 *
 * @author jmvegas.gertrudix
 */
public interface IStack<T> {
    
    @Requires("elem != null")
    @Ensures({
        "peek() == old(elem)",
        "size() == (old(size()) + 1)"
    })
    public void push(T elem);
    
    @Requires("size() > 0")
    @Ensures("size() == old(size() - 1)")
    public void pop();
    
    @Requires("size() > 0")
    @Ensures("size() == old(size())")
    public T peek();
    
    @Ensures("result == (size() == 0)")
    public Boolean isEmpty();
    
    public Integer size();
}