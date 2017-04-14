package org.jomaveger.dbc.collections;

import com.google.java.contract.Ensures;
import com.google.java.contract.Invariant;
import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 *
 * @author jmvegas.gertrudix
 */
@Invariant({
    "elements != null",
    "elements.size() >= 0",
    "!(elements.size() > 0) || (elements.get(elements.size() - 1) == peek())"
})
public class CStack<T> implements IStack<T> {

    private static final Logger LOGGER = LoggerFactory.getLogger(CStack.class);
    
    private final List<T> elements;
    
    @Ensures("size() == 0")
    public CStack() {
        elements = new ArrayList<>();
    }
    
    @Override
    public void push(T elem) {
        elements.add(elem);
    }

    @Override
    public void pop() {
        elements.remove(elements.size() - 1);
    }

    @Override
    public T peek() {
        return elements.get(elements.size() - 1);
    }

    @Override
    public Boolean isEmpty() {
        return elements.isEmpty();
    }

    @Override
    public Integer size() {
        return elements.size();
    }
    
}
