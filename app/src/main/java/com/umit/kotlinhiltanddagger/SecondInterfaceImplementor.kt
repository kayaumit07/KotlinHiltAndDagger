package com.umit.kotlinhiltanddagger

import javax.inject.Inject

class SecondInterfaceImplementor
@Inject constructor() : MyInterface {
    override fun myPrintFunc(): String {
        return "My Second Implementor"
    }
}