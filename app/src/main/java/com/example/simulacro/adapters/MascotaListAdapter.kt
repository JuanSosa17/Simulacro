package com.example.simulacro.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.simulacro.R
import com.example.simulacro.entities.Mascota
import com.example.simulacro.holders.MascotaHolder
import com.example.simulacro.listener.OnViewItemClickedListener

class MascotaListAdapter (
    private val mascotasList: MutableList<Mascota>,
    private val onItemClick: OnViewItemClickedListener,
) : RecyclerView.Adapter<MascotaHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MascotaHolder {
        val view =  LayoutInflater.from(parent.context).inflate(R.layout.item_mascotas,parent,false)
        return (MascotaHolder(view))
    }

    override fun getItemCount(): Int {
        return mascotasList.size
    }

    override fun onBindViewHolder(holder: MascotaHolder, position: Int) {
        val mascota = mascotasList[position]
        holder.setName(mascota.nombre)
        holder.setEdad(mascota.edad)
        holder.setRaza(mascota.raza)
        holder.setSubRazas(mascota.subrazas)
        holder.setGenero(mascota.genero)
        holder.setImagen(mascota.urlImage)


        holder.getCardLayout().setOnClickListener{
            onItemClick.onViewItemDetail(mascota)
        }
    }
}