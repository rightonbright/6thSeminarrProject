package com.example.imsihyun.a6thseminarproject

import io.realm.RealmObject
import io.realm.annotations.PrimaryKey

// VO : Value Object

open class PokemonVO : RealmObject() {
    @PrimaryKey
    var name : String = ""
    var num : Int = 0
    var type : String = ""
    var user : String = ""
}