package com.example.simulacro.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.simulacro.R
import com.example.simulacro.entities.Mascota
import com.example.simulacro.entities.Offers
import com.example.simulacro.holders.MascotaHolder
import com.example.simulacro.holders.OfferHolder
import com.example.simulacro.listener.OnViewItemClickedListener

class OfferListAdapter (
    private val offersList: MutableList<Offers>
) : RecyclerView.Adapter<OfferHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OfferHolder {
        val view =  LayoutInflater.from(parent.context).inflate(R.layout.item_offers,parent,false)
        return (OfferHolder(view))
    }

    override fun getItemCount(): Int {
        return offersList.size
    }

    override fun onBindViewHolder(holder: OfferHolder, position: Int) {
        val offer = offersList[position]
        holder.setTitulo(offer.titulo)
        holder.setDescripcion(offer.descripcion)
        holder.setImagen(offer.imagen)
        }
    }
