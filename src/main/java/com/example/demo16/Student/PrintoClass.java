package com.example.demo16.Student;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class PrintoClass {

    @Autowired
    @Qualifier("Print1")
    private PrinterInterface printerInterface;

  @Test
public void main1(){
    printerInterface.print();
    }

}
