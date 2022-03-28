package com.training.exproject.clases;

import java.util.*;
class Customers {
    private Customer[] customers;
    private int capacity;
    private int size;

    public Customers(int capacity_) {
        size = 0;
        capacity = capacity_;
        customers = new Customer[capacity];
    }

    public Customers() {
        this(10);
    }

    public void push_back(Customer customer) {
        if (size < capacity) {
            customers[size] = customer;
            size++;
        }
        else {
            Customer[] buffer = new Customer[capacity*2];
            for (int i = 0; i < size; ++i) {
                buffer[i] = customers[i];
            }

            customers = buffer;
            capacity = capacity*2;
            customers[size] = customer;
            size++;
        }
    }

    public void print() {
        for (int i = 0; i < size; ++i) {
            customers[i].print();
        }
    }

    public void sortByName() {
        Arrays.sort(customers, 0, size, new Customer.ByNameComparator());
    }

    public void print_if_card_in(String a, String b) {
        for (int i = 0; i < size; ++i) {
            if (customers[i].get_credit_сard_number().compareTo(a) >= 0 &&
                    customers[i].get_credit_сard_number().compareTo(b) <= 0)
                customers[i].print();
        }
    }
}
