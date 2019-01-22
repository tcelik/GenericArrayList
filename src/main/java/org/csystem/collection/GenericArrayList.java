package org.csystem.collection;

//Sen T türünden nesneler tutuyorsun. Seni T ile açıyorum.
public class GenericArrayList<T> {
    private static final int DEFAULT_CAPACITY = 10;
    private T [] m_elems;

    public GenericArrayList()
    {
        this(DEFAULT_CAPACITY);
    }

    public GenericArrayList(int initialCapacity)
    {
        if (initialCapacity < 0)
            throw new IllegalArgumentException("invalid initialCapacity values");

        m_elems = (T[]) new Object[initialCapacity == 0 ? DEFAULT_CAPACITY : initialCapacity];

    }
}
