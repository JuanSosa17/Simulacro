package com.example.simulacro.fragments

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.simulacro.R
import com.example.simulacro.adapters.MascotaListAdapter
import com.example.simulacro.entities.Mascota
import com.example.simulacro.listener.OnViewItemClickedListener

class listFragment: Fragment(), OnViewItemClickedListener {

    lateinit var vista: View

    lateinit var recMascotas : RecyclerView

    var mascotas : MutableList<Mascota> = ArrayList()

    private lateinit var linearLayoutManager: LinearLayoutManager

    private lateinit var contactoListAdapter: MascotaListAdapter


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        vista =  inflater.inflate(R.layout.list_fragment, container, false)

        recMascotas = vista.findViewById(R.id.rec_mascotas)

        Log.d("ListFragment", "onCreateView")

        return vista
    }

    override fun onStart() {
        super.onStart()
        Log.d("ListFragment", "onResume")
        //Creo la Lista Dinamica
        for (i in 1..50) {
            mascotas.add(Mascota("Pepito",7,"Salchicha",
                listOf("subSalchicha"), "Macho", "Perro salchica re copado y dulce. Adoptalo porque es un capo mal", 12.0, "Buenos Aires", "https://tse3.mm.bing.net/th?id=OIP.f6ALIuEVKIL7zEFxcsKW-AHaE8&pid=Api&P=0&h=180", "Juan"))
        }

        linearLayoutManager = LinearLayoutManager(context)
        recMascotas.layoutManager = linearLayoutManager

        contactoListAdapter = MascotaListAdapter(mascotas, this)
        recMascotas.adapter = contactoListAdapter
    }



    override fun onViewItemDetail(mascota: Mascota) {
        val action = listFragmentDirections.actionListFragmentToViewItem(mascota)
        this.findNavController().navigate(action)
    }
}