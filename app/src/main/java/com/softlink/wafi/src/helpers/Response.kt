package com.softlink.wafi.src.helpers
class Response(private val status: Int, private val message: String, private val data: Any?) {


    public fun getStatus(): Int {
        return status;
    }

    public fun getMessage(): String {
        return message;
    }

    public  fun getData(): Any? {
        return if (data == "") null else data;
    }

}

