package com.bhardwaj.portfolioapp

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.text.Html
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import android.widget.TextView
import android.widget.Toast
import androidx.core.text.HtmlCompat
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.contact_item.view.*

class ContactAdapter(val contactList:ArrayList<ModelContact>): RecyclerView.Adapter<ContactAdapter.ViewHolder>() {

    private var lastPosition = -1

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.contact_item,parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
    return contactList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItems(contactList[position])
        setAnimation(holder.itemView,position)
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        @SuppressLint("WrongConstant")
        fun bindItems(contactme: ModelContact){
            itemView.ic_contact.setImageResource(contactme.icon)
            itemView.tv_contact.text = HtmlCompat.fromHtml(contactme.contact,Html.FROM_HTML_MODE_LEGACY)
            itemView.tv_contact.setOnClickListener({
                if(contactme.contact.contains("98")){
                    Intent(Intent.ACTION_DIAL).also {
                        it.setData(Uri.parse("tel:"+contactme.contact.trim()))
                        itemView.context.startActivity(it)
                    }
                }else if (contactme.contact.contains("@")){
                    Intent(Intent.ACTION_VIEW).also {
                        it.setData(Uri.parse("mailto:"+contactme.contact.trim()))
                        itemView.context.startActivity(it)
                    }
                }else{
                    Intent(Intent.ACTION_VIEW).also {
                        it.setData(Uri.parse("https://"+contactme.contact.trim()))
                        itemView.context.startActivity(it)
                    }
                }
            })
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