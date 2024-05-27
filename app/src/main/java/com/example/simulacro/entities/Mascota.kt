package com.example.simulacro.entities

import android.os.Parcel
import android.os.Parcelable

data class Mascota(
    var nombre: String?,
    var edad: Int,
    val raza: String?,
    val subrazas: List<String>?,
    val genero:String?,
    val descripcion:String?,
    val peso:Double?,
    val ubicacion: String?,
    var urlImage: String?,
    val adoptante: String?,
) : Parcelable {

    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readInt(),
        parcel.readString(),
        parcel.createStringArrayList(),
        parcel.readString(),
        parcel.readString(),
        parcel.readDouble(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),

        )

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(nombre)
        parcel.writeInt(edad)
        parcel.writeString(raza)
        parcel.writeStringList(subrazas)
        parcel.writeString(urlImage)
        parcel.writeString(genero)
        parcel.writeString(descripcion)
        parcel.writeDouble(peso!!)
        parcel.writeString(ubicacion)
        parcel.writeString(adoptante)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Mascota> {
        override fun createFromParcel(parcel: Parcel): Mascota {
            return Mascota(parcel)
        }

        override fun newArray(size: Int): Array<Mascota?> {
            return arrayOfNulls(size)
        }
    }
}