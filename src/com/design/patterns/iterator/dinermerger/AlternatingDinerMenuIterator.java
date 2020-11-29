package com.design.patterns.iterator.dinermerger;

import java.util.Calendar;

public class AlternatingDinerMenuIterator implements Iterator {
    MenuItem[] list;
    int position;

    public AlternatingDinerMenuIterator(MenuItem[] list) {
        this.list = list;
        Calendar rightNow = Calendar.getInstance();
        position = Calendar.DAY_OF_WEEK % 2;
    }

    public Object next() {
        MenuItem menuItem = list[position];
        position = position + 2;
        return menuItem;
    }

    public boolean hasNext() {
        return position < list.length && list[position] != null;
    }

    public String toString() {
        return "Alternating Diner Menu Iterator";
    }
}
