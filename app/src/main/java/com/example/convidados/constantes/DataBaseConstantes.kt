package com.example.convidados.constantes

class DataBaseConstantes private constructor(){


     object GUEST{
        const val TABLE_NAME = "Guest"

         object COLUMNS{
             const val ID = "Id"
             const val NAME = "Name"
             const val PRESENCE = "presence"

         }
    }
}