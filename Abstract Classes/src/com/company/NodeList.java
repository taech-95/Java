package com.company;

public interface NodeList {
    ListItems getRoot();
    boolean addItem(ListItems item);
    boolean removeItem(ListItems item);
    void transverse (ListItems root);
}
