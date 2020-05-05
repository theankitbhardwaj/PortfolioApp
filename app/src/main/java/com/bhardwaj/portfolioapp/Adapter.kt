package com.bhardwaj.portfolioapp

import android.annotation.SuppressLint
import android.content.Context
import android.text.Html
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import android.widget.TextView
import androidx.core.text.HtmlCompat
import androidx.recyclerview.widget.RecyclerView

class Adapter(val aboutList:ArrayList<Model>): RecyclerView.Adapter<Adapter.ViewHolder>() {

    private var lastPosition = -1

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.container_item,parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
    return aboutList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItems(aboutList[position])
        setAnimation(holder.itemView,position)
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        @SuppressLint("WrongConstant")
        fun bindItems(aboutme: Model){
            val tv_title = itemView.findViewById<TextView>(R.id.rv_container_title)
            val tv_content = itemView.findViewById<TextView>(R.id.rv_container_content)
            tv_title.text = aboutme.title
            tv_content.text = HtmlCompat.fromHtml(aboutme.content,Html.FROM_HTML_MODE_LEGACY)
        }
    }

    private fun setAnimation(view:View,position: Int){

        if(position > lastPosition){
            var anim = AnimationUtils.loadAnimation(view.context,R.anim.item_animation_from_right)
            view.startAnimation(anim)
            lastPosition = position
        }
    }


}