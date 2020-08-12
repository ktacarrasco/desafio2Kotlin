package com.example.myappciclobike

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.ciromine.ciclobike.Ciclovia
import kotlinx.android.synthetic.main.cyclo_item_list.*

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView:RecyclerView
    private lateinit var adapter:CycloAdapter
    private lateinit var layoutManager: RecyclerView.LayoutManager
    private lateinit var nDataset: MutableList<Ciclovia>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

     //   val listSetupCiclovias:SetupCiclovias
      //  Log.d("LOG",SetupCiclovias().init().toString())
      //  Log.d("LOG",SetupCiclovias().init1().toString())

        val filtrarlascondes : Button= findViewById(R.id.buttonLascondes)
        val sinfiltro : Button=findViewById(R.id.buttonallcomunas)
       layoutManager = LinearLayoutManager(this)
        nDataset  = SetupCiclovias().init()as MutableList<Ciclovia>
        adapter = CycloAdapter(nDataset)
        recyclerView = findViewById(R.id.textViewCyclo)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = layoutManager

    filtrarlascondes.setOnClickListener(View.OnClickListener {
        when (nDataset) {
        //val filtrarlascondes = String nDataset.filter { comuna ->comuna.equals("las condes") }
    }

    })

    }
}