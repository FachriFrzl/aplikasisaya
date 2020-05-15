package com.example.uts1.model

import com.example.uts1.R

data class Friendlist (
            val NamaTeman : String,
            val image : Int
){
    companion object {
        fun setDataTeman():ArrayList<Friendlist>{
            val list = ArrayList<Friendlist>()
            list.add(
                Friendlist("Dean Sopian",R.drawable.dean)
            )
            list.add(
                Friendlist("Ilham Ramadhan",R.drawable.dhion)
            )
            list.add(
                Friendlist("Dimas Prayoga",R.drawable.oga)
            )
            return list
        }
    }
}




