package com.example.simulacro.fragments

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.simulacro.R
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.simulacro.adapters.MascotaListAdapter
import com.example.simulacro.adapters.OfferListAdapter
import com.example.simulacro.entities.Offers


class OfferFragment : Fragment() {

    lateinit var vista : View
    lateinit var recOffers : RecyclerView

    var offers : MutableList<Offers> = ArrayList()
    private lateinit var linearLayoutManager: LinearLayoutManager
    private lateinit var offerListAdapter: OfferListAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        vista = inflater.inflate(R.layout.fragment_offer, container, false)
        recOffers = vista.findViewById(R.id.rec_offers)

        return vista
    }
    override fun onStart() {
        super.onStart()
        Log.d("ListFragment", "onResume")
        //Creo la Lista Dinamica Ofertas
        offers.add(Offers("Get 20% discount with your Master credit cards","Use your mastercard with any transaction and get 20% discount instantly!" ,R.drawable.mastercard))
        offers.add(Offers("Get 25% discount with your VISA credit or debit cards","Use your VISA credit or debit card with any transaction and get 25% discount instantly!" ,R.drawable.visa))


        linearLayoutManager = LinearLayoutManager(context)
        recOffers.layoutManager = linearLayoutManager

        offerListAdapter = OfferListAdapter(offers)
        recOffers.adapter = offerListAdapter
    }

    companion object {
        fun newInstance() = OfferFragment

    }
}