package com.example.example;

import com.example.example.ContactAppDemo.Contact;
import com.example.example.ContactAppDemo.ContactApp;
import com.example.example.example.CalculatorSample;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.out;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.startsWith;
import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class ContactAppTest {


    @Mock
    ContactApp contactApp;

    @Mock
    Scanner mScanner;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }


    @Test
    public void mainUsage() {
//        PrintStream out = mock(PrintStream.class);
//        System.setOut(out);
//        contactApp.deleteContactList();
//        verify(out).println(startsWith("\nEnter the Contact Position you want Delete : "));


        when(mScanner.nextInt())
                .thenReturn(10)
                .thenReturn(11)
                .thenReturn(19);

        when(contactApp.equals(any())).then(any());
        verify(contactApp, times(0)).deleteContactList();
        verify(contactApp, times(0)).displayOptions();
        verify(contactApp, times(0)).createContact();
    }


}
