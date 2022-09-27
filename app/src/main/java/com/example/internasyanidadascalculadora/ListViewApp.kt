package com.example.internasyanidadascalculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView

class ListViewApp : AppCompatActivity() {
    //Creacion de variables
    private var lvLLenguajes:ListView?=null
    private var tvSeleccion:TextView?=null

    private val Lenguajes = arrayOf("Kotlin","Java","C++","C#","php","VB.net")
    private val posicion = arrayOf("1","6","3","2","4","5")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view_app)

        lvLLenguajes=findViewById(R.id.lv_Lenguajes)
        tvSeleccion=findViewById(R.id.tv_Seleccion)

        //crear un adaptador para los numeros creo

        var adaptador:ArrayAdapter<String> = ArrayAdapter <String>(this,R.layout.list_items_claseprogramacion,Lenguajes)
            lvLLenguajes?.adapter=adaptador

        lvLLenguajes?.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{

            override fun onItemSelected(
                parent: AdapterView<*>?,
                viwe: View?,
                position: Int,
                id: Long
            ) {
                tvSeleccion?.text="La posicion del lenguaje ${lvLLenguajes?.getItemAtPosition(position)} es ${posicion[position]}"
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

        }

    }
}