package com.company;

public class MyLinkedList implements NodeList {

    private ListItems root = null;

    public MyLinkedList (ListItems root){
        this.root = root;
    }

    @Override
    public ListItems getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItems item) {
        if(this.root == null){
            this.root = item;
            return true;
        }

        ListItems currentItem = this.root;
        while (currentItem != null){
            int comparison = (currentItem.compareTo(item));
            if(comparison < 0){
                if(currentItem.next()!=null){
                    currentItem = currentItem.next();
                } else {
                    currentItem.setNext(item).setPrevious(currentItem);
                    return true;
                }
            }
            else if(comparison>0){
                if(currentItem.previous() != null){
                    currentItem.previous().setNext(item).setPrevious(currentItem.previous());
                    item.setNext(currentItem).setPrevious(item);

                } else {
                    item.setNext(this.root).setPrevious(item);
                    this.root = item;
                }
            }
            else{
                System.out.println(item.getValue()+ " is already present, not added");
                return false;
            }
        }
        return false;
    }

    @Override
    public boolean removeItem(ListItems item) {
        return false;
    }

    @Override
    public void transverse(ListItems root) {
        if(root == null){
            System.out.println("The list is empty");
        }
        else{
            while(root!=null){
                System.out.println(root.getValue());
                root = root.next();
            }
        }

    }
}
