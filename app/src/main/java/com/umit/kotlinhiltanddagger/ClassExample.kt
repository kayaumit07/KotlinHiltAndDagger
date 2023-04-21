package com.umit.kotlinhiltanddagger

import com.google.gson.Gson
import javax.inject.Inject

class ClassExample @Inject constructor(@FirstImplementor private val myInterfaceImplementor: MyInterface,
                                       @SecondImplementor private val mySecondInterfaceImplementor: MyInterface)
{
    fun myFunction():String{
        return "Working: ${myInterfaceImplementor.myPrintFunc()}"
    }

    fun secondFunction():String{
        return "Working: ${mySecondInterfaceImplementor.myPrintFunc()}"
    }
}