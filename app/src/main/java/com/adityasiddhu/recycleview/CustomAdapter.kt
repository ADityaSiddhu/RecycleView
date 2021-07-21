package com.adityasiddhu.recycleview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView

class CustomAdapter(val contactList: ArrayList<Contacts>) : RecyclerView.Adapter<CustomAdapter.ViewHolder>()
{

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.contact_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int)
    {
        holder.tvName.text = contactList[position].name
        holder.tvMobile.text = contactList[position].mobile
        if (contactList[position].img==1)
        {
            holder.ivUser.setImageResource(R.drawable.man)
        }
        else if (contactList[position].img==2)
        {
            holder.ivUser.setImageResource(R.drawable.woman)
        }
        else
        {
            holder.ivUser.setImageResource(R.drawable.ic_launcher_foreground)
        }
    }

    override fun getItemCount(): Int {
        return contactList.size
    }

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

        val ivUser: ImageView = itemView.findViewById(R.id.imgUser)
        val tvName: TextView = itemView.findViewById(R.id.tvName)
        val tvMobile: TextView = itemView.findViewById(R.id.tvMobile)

    }


}