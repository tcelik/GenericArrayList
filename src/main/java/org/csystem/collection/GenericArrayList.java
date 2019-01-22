package org.csystem.collection;

//Sen T türünden nesneler tutuyorsun. Seni T ile açıyorum.
public class GenericArrayList<T> {
    private static final int DEFAULT_CAPACITY = 10;
    private T [] m_elems;
    private int m_index;

    private void allocateCapacity(int capacity)
    {
        T [] temp = (T[]) new Object[capacity];

        for (int i = 0; i < m_index; ++i)
            temp[i] = m_elems[i];

        m_elems = temp;
    }
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

    public boolean add(T elem)
    {
        //kontrol
        if (m_index == m_elems.length)
            this.allocateCapacity(m_elems.length * 2);

        m_elems[m_index++] = elem;
        return true;
    }

}
