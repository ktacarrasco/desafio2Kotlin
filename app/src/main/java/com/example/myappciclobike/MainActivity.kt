package com.example.myappciclobike

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.TextKeyListener.clear
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.Toast
import android.widget.Toast.*
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.ciromine.ciclobike.Ciclovia
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.cyclo_item_list.*
import android.widget.Toast.makeText as toastMakeText

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView:RecyclerView
    private lateinit var adapter:CycloAdapter
    private lateinit var layoutManager: RecyclerView.LayoutManager
    private lateinit var nDataset: MutableList<Ciclovia>

    @SuppressLint("ShowToast")
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
       recyclerView = findViewById(R.id.recyclo)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = layoutManager

    filtrarlascondes.setOnClickListener(View.OnClickListener {
        Toast.makeText(this,"SOLO LAS CONDES", LENGTH_LONG).show()

        //  when (nDataset) {

        //val filtrarlascondes = String nDataset.filter { comuna ->comuna.equals("las condes") }
    //}

    })

    }


}