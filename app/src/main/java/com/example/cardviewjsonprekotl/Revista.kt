package com.example.cardviewjsonprekotl

import org.json.JSONArray
import org.json.JSONException
import org.json.JSONObject
import kotlin.jvm.Throws

class Revista (a: JSONObject){
    var nombre: String
    var urlRevista: String

    companion object{
        @Throws(JSONException::class)
        fun JsonObjectBuild(datos: JSONArray): ArrayList<Revista>{
            val revistas: ArrayList<Revista> = ArrayList<Revista>()
            var i = 0
            while (i < datos.length()){
                revistas.add(Revista(datos.getJSONObject(i)))
                i++
            }
            return revistas
        }
    }

    init {
        nombre = a.getString("first_name").toString()
        urlRevista = a.getString("avatar").toString()
    }
}