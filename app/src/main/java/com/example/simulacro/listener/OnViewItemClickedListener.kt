package com.example.simulacro.listener

import com.example.simulacro.entities.Mascota

interface OnViewItemClickedListener {

    fun onViewItemDetail(mascota: Mascota)
}