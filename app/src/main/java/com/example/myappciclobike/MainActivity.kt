package com.example.myappciclobike

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import android.widget.Toast.*
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.ciromine.ciclobike.Ciclovia
import com.example.myappciclobike.R.id.buttonLascondes

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView:RecyclerView
    private lateinit var cycloAdapter: CycloAdapter
    private lateinit var layoutManager: RecyclerView.LayoutManager
    private lateinit var nDataset: MutableList<Ciclovia>


    @SuppressLint("ShowToast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val filtrarlascondes : Button= findViewById(buttonLascondes)
        var sinfiltro : Button=findViewById(R.id.buttonallcomunas)
        layoutManager = LinearLayoutManager(this)
        nDataset  = SetupCiclovias().init()as MutableList<Ciclovia>
        cycloAdapter = CycloAdapter(nDataset)
        recyclerView = findViewById(R.id.recyclo)
        recyclerView.adapter = cycloAdapter
        recyclerView.layoutManager = layoutManager


        filtrarlascondes.setOnClickListener(View.OnClickListener {
            var lista:ArrayList<Ciclovia>? = ArrayList<Ciclovia>()
            var listaT:ArrayList<Ciclovia> = SetupCiclovias().init() as ArrayList<Ciclovia>
            Toast.makeText(this,"SOLO LAS CONDES", LENGTH_LONG).show()
           // cycloAdapter.updateList(nDataset.toString())
            val filtroComuna = nDataset.filter { n ->n.comuna.equals("Las Condes") } as MutableList<Ciclovia>

            nDataset=filtroComuna
            updateLista()

        })

        sinfiltro.setOnClickListener(View.OnClickListener {
            nDataset = SetupCiclovias().init() as MutableList<Ciclovia>

            updateLista()
        })

    }

    private fun updateLista() {
        recyclerView.adapter=CycloAdapter(nDataset)
    }

    }



