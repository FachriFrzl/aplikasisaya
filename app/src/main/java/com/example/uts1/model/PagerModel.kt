package com.example.uts1.model

import com.example.uts1.R

data class PagerModel (
    val title : String,
    val desc  : String,
    val image : Int

){
        companion object{
            fun setDataViewPager(): ArrayList<PagerModel>{
                val list = ArrayList<PagerModel>()
                list.add(
                    PagerModel("Gaming","Hobi Pertama Saya", R.drawable.gaming)
                )
                list.add(
                    PagerModel("Musik","Hobi Kedua Saya ",R.drawable.ic_music_note_black_24dp )
                )
                list.add(
                    PagerModel("Selamat Datang,","Di Aplikasi Tentang Saya",R.drawable.logo)
                )
                return list
            }
        }
}