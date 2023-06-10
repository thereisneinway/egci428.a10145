package com.example.egci428.a10145.Model

import java.io.Serializable

data class CookieObject(val items: ArrayList<Cookie>): Serializable{
    public fun get(): ArrayList<Cookie> {
        return items
    }
}
