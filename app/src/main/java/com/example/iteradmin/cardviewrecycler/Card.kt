package com.example.iteradmin.cardviewrecycler

import android.provider.MediaStore
import android.support.v7.widget.DialogTitle

class Card(thumbnail:String,title: String,subtitle:String) {
    private val thumbnail:String
    private val title:String
    private val subtitle:String

    init {
        this.thumbnail=thumbnail
        this.title=title
        this.subtitle=subtitle
    }

    fun getThumbnail():String{
        return this.thumbnail
    }

    fun getTitle():String{
        return this.title
    }

    fun getSubTitle():String{
        return this.subtitle
    }
}