package com.example.imsihyun.a6thseminarproject

import android.content.Context

object SharedPreferenceController {

    private val USER = "user"
    private val ID = "id"
    private val PWD = "pwd"

    fun setID(context : Context, id : String) {
        val pref = context.getSharedPreferences(USER, Context.MODE_PRIVATE)
        val editor = pref.edit()
        editor.putString(ID, id)
        editor.commit()
    }

    fun getID(context : Context) : String? {
        val pref = context.getSharedPreferences(USER, Context.MODE_PRIVATE)
        return pref.getString(ID, "")
    }

    fun setPWD(context : Context, pwd : String) {
        val pref = context.getSharedPreferences(USER, Context.MODE_PRIVATE)
        val editor = pref.edit()
        editor.putString(PWD, pwd)
        editor.commit()
    }

    fun getPWD(context : Context) : String? {
        val pref = context.getSharedPreferences(USER, Context.MODE_PRIVATE)
        return pref.getString(PWD, "")
    }

    fun clearSPC(context : Context) {
        val pref = context.getSharedPreferences(USER, Context.MODE_PRIVATE)
        val editor = pref.edit()
        editor.clear()
        editor.commit()
    }
}