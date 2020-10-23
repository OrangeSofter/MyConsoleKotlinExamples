package ru.orangefor.consolekotlintrening

import android.content.Context


fun main(){
    val s1 = Singleton.getObject(1)
    val s2 = Singleton.getObject(2)
    println("${Singleton.getObject()?.a} ${s1?.a} ${s2?.a} ${s1 === s2}")
}

class  Singleton private constructor(_a: Int){

    companion object{
       private var obj: Singleton? = null

       fun getObject(a: Int? = null): Singleton? {//если обьект еще не проинициализирован то он будет проинициализирован

           if(obj == null && a != null) obj = Singleton(a)
           return obj
       }
        fun destruct(){
            obj = null
        }


    }

    val a = _a
}