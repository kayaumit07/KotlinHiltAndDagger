package com.umit.kotlinhiltanddagger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    //Field Injection
    @Inject
    lateinit var lars: Musicians
    @Inject
    lateinit var myClassExample: ClassExample
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*  var instrument=Instrument()
          var band=Band()
          var james=Musicians(instrument,band)
          james.sing()*/

        //Injection  -> 1.Field Injection  2.
        lars.sing()
        println(myClassExample.myFunction())
        println(myClassExample.secondFunction())
    }
}
@AndroidEntryPoint
class FragmentExample():Fragment(){
    @Inject
    lateinit var kirk:Musicians


}