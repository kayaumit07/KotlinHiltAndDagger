package com.umit.kotlinhiltanddagger

import com.google.gson.Gson
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.internal.managers.ApplicationComponentManager
import dagger.hilt.components.SingletonComponent
import javax.inject.Qualifier
import javax.inject.Singleton

interface MyInterface {
    fun myPrintFunc(): String
}

/*
@InstallIn(ActivityComponent::class)
@Module
abstract class myModule {
    @ActivityScoped
    @Binds
    abstract fun bindingFunction(myImplementor: InterfaceImplementor): MyInterface
}*/

@Module
@InstallIn(SingletonComponent::class)
class myModule{
    @FirstImplementor
    @Singleton
    @Provides
    fun bindingFunction():MyInterface{
        return InterfaceImplementor()
    }


    @SecondImplementor
    @Singleton
    @Provides
    fun SecondProviderFun():MyInterface{
        return SecondInterfaceImplementor()
    }
}

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class FirstImplementor

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class SecondImplementor