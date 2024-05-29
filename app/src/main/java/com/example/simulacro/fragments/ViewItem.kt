package com.example.simulacro.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.example.simulacro.R

class ViewItem : Fragment() {

    lateinit var vista: View
    lateinit var nombre: TextView
    lateinit var edad: TextView
    lateinit var raza: TextView
    lateinit var imagen: ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        vista = inflater.inflate(R.layout.view_item, container, false)
        nombre = vista.findViewById(R.id.detailNombre)
        edad = vista.findViewById(R.id.detailEdad)
        raza = vista.findViewById(R.id.detailRaza)
        imagen = vista.findViewById(R.id.detailImageView)
        return vista;
    }

    override fun onStart() {
        super.onStart()

        arguments?.let {
            val mascota = ViewItemArgs.fromBundle(it).mascota

            nombre.text = mascota.nombre
            edad.text = mascota.edad.toString()
            raza.text = mascota.raza
            Glide.with(vista.context).load(mascota.urlImage).into(imagen)
        }
    }

}