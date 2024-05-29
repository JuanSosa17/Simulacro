package com.example.simulacro.holders

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.widget.AppCompatImageView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.simulacro.R
import com.example.simulacro.entities.Mascota

class OfferHolder (v: View) : RecyclerView.ViewHolder(v) {

    private var view: View

    init {
        this.view = v
    }

    fun setTitulo(titulo: String?) {
        val txt: TextView = view.findViewById(R.id.discount)
        txt.text = titulo
    }
    fun setDescripcion(descripcion: String?){
        val txt: TextView = view.findViewById(R.id.description)
        txt.text = descripcion
    }
    fun setImagen(imagen: Int){
        val img: AppCompatImageView = view.findViewById(R.id.credit_card)
        img.setImageResource(imagen)
    }

    fun getCardLayout (): CardView {
        return view.findViewById(R.id.card_package_item_offers)
    }
}