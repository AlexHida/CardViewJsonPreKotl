package com.example.cardviewjsonprekotl

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.snackbar.Snackbar
import com.squareup.picasso.Picasso

class AdapterOne (val revistaList: ArrayList<Revista>): RecyclerView.Adapter<AdapterOne.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.txtNombre.text = revistaList[position].nombre

        Picasso.get().load(revistaList[position].urlRevista).into(holder.itemImage);
    }

    override fun getItemCount(): Int {
        return revistaList.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var txtNombre: TextView
        var itemImage: ImageView

        init {
            txtNombre = itemView.findViewById(R.id.txtName)
            itemImage = itemView.findViewById(R.id.imgRevista)

            itemView.setOnClickListener{ v: View ->
                var position: Int = getAdapterPosition()

                Snackbar.make(v, "Item Seleccionado $position",
                    Snackbar.LENGTH_LONG).setAction("Action", null).show()


            }
        }
    }

}