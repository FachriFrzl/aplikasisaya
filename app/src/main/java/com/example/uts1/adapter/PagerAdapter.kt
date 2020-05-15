package com.example.uts1.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.uts1.R
import com.example.uts1.model.PagerModel
import kotlinx.android.synthetic.main.vp_item.view.*

class PagerAdapter: RecyclerView.Adapter<PagerAdapter.ViewHolder>() {

    private var items:List<PagerModel> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PagerAdapter.ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.vp_item,parent,false)
        )
    }

    override fun onBindViewHolder(holder: PagerAdapter.ViewHolder, position: Int) {
        holder.bindContent(items.get(position))
    }

    override fun getItemCount(): Int {
        return items.size
    }

    fun setPagerAdapter (pagerModel: List<PagerModel>){
        items = pagerModel

    }

    class ViewHolder constructor(
        view: View
    ): RecyclerView.ViewHolder(view){
        val title = view.title_vp
        val desc = view.desc_vp
        val image = view.image_vp

        fun bindContent(pagerModel: PagerModel)
        {
            title.text   = pagerModel.title
            desc.text    = pagerModel.desc
            image.setBackgroundResource(pagerModel.image)
        }

    }
}