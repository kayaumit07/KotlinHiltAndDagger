package com.umit.kotlinhiltanddagger

import javax.inject.Inject

class InterfaceImplementor
@Inject constructor() : MyInterface {
    override fun myPrintFunc(): String {
        return "My Interface Implementor"
    }
}