package com.softlink.wafi.src.helpers


    abstract  class Lang {

    fun replace(langValue: String = "SP"): HashMap<String, String>? {
        val langs  = HashMap<String, HashMap<String, String>>();

        val sp  = HashMap<String,String>();

        sp["Hello"] = "Hola"
        sp["Welcome"] = "Bienvenido"

        langs["SP"] = sp;


        return langs[langValue];
    }

}