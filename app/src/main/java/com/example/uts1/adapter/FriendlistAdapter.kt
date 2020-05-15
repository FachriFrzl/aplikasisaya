package com.example.uts1.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.uts1.R
import com.example.uts1.model.Friendlist
import kotlinx.android.synthetic.main.fragment_daily.view.*
import java.util.ArrayList

class FriendlistAdapter:RecyclerView.Adapter<FriendlistAdapter.ViewHolderTeman>() {
    private var items:List<Friendlist> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): ViewHolderTeman {
        return ViewHolderTeman(LayoutInflater.from(parent.context).inflate(R.layout.fragment_daily,parent,false))
    }

    override fun onBindViewHolder(holder: ViewHolderTeman, position: Int) {
    holder.bindTeman(items.get(position))
    }
    override fun getItemCount(): Int {
        return items.size
    }


    class ViewHolderTeman constructor(
        view: View
    ) : RecyclerView.ViewHolder(view) {
        val nama = view.namateman
        val foto = view.fototeman
        fun bindTeman(friendlist : Friendlist) {
            nama.text = friendlist.NamaTeman
            foto.setImageResource(friendlist.image)
        }
    }
}
