package com.example.myappciclobike

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.*
import com.example.ciromine.ciclobike.Ciclovia

class CycloAdapter (private  val listadoCiclos: MutableList<Ciclovia>): Adapter<CycloAdapter.CycloViewHolder>() {



    class CycloViewHolder(itemView: View) : ViewHolder(itemView) {

        var texviewCyclo : TextView=itemView.findViewById(R.id.textViewCyclo)
        var texviewComuna : TextView=itemView.findViewById(R.id.textViewcomuna)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CycloViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.cyclo_item_list,parent,false)
        return CycloViewHolder(view)

    }

    override fun getItemCount(): Int {
        return listadoCiclos.size

    }

    override fun onBindViewHolder(holder: CycloViewHolder, position: Int) {

        holder.texviewComuna.text = listadoCiclos[position].comuna
        holder.texviewCyclo.text =  listadoCiclos[position].nombre
    }
}