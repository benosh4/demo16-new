package com.example.demo16.Student;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("Print1")
public class Print1 implements PrinterInterface{
    @Override
    public void print() {
        System.out.println("im print 1");
    }
}
