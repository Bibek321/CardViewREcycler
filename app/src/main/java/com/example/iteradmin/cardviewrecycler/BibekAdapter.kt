package com.example.iteradmin.cardviewrecycler

import android.content.Context
import android.os.Parcel
import android.os.Parcelable
import android.support.v7.widget.RecyclerView
import android.view.ViewGroup

class BibekAdapter(conText:Context) : RecyclerView.Adapter<BibekAdapter.MyViewHolder>(), Parcelable {
    private val mContext:Context


    init{
        this.mContext=conText

    }
    override fun getItemCount(): Int {

    }

    override fun onBindViewHolder(p0: MyViewHolder, p1: Int) {

    }

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): MyViewHolder {

    }


    class MyViewHolder {

    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {

    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<BibekAdapter> {
        override fun createFromParcel(parcel: Parcel): BibekAdapter {
            return BibekAdapter(parcel)
        }

        override fun newArray(size: Int): Array<BibekAdapter?> {
            return arrayOfNulls(size)
        }
    }
}