package com.example.simulacro.holders

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.simulacro.R
import com.example.simulacro.entities.Mascota

class MascotaHolder (v: View) : RecyclerView.ViewHolder(v) {

    private var view: View

    init {
        this.view = v
    }

    fun setName(name: String?) {
        val txt: TextView = view.findViewById(R.id.mascotaName)
        txt.text = name
    }
    fun setEdad(edad: Int?){
        val txt: TextView = view.findViewById(R.id.mascotaAge)
        txt.text = edad.toString()
    }
    fun setRaza(raza: String?){
        val txt: TextView = view.findViewById(R.id.mascotaRace)
        txt.text = raza
    }
    fun setSubRazas(subrazas: List<String>?){
        val txt: TextView = view.findViewById(R.id.mascotaSubRace)
        txt.text = subrazas?.joinToString(", ")
    }
    fun setGenero(genero: String?){
        val txt: TextView = view.findViewById(R.id.mascotaGender)
        txt.text = genero
        }
    fun setImagen(imagen: String?){
        val img: ImageView = view.findViewById(R.id.mascotaImageView)
        Glide.with(view.context).load(imagen).into(img)
    }

    fun getCardLayout (): CardView {
        return view.findViewById(R.id.card_package_item)
    }
}