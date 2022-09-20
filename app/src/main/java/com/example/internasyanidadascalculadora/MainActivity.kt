package com.example.internasyanidadascalculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.service.autofill.OnClickAction
import android.view.View
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
//Estas son 2 formas de llamar la edicion del texto

     var etn_valor1: EditText? = null
     lateinit var etn_valor2: EditText
     lateinit var txt_Resultado:TextView
     lateinit var Rb_Sum:RadioButton
     lateinit var Rb_Rest:RadioButton
     lateinit var Rb_Mult:RadioButton
     lateinit var Rb_Div:RadioButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       // clasesAnidadasI()
        etn_valor1 = findViewById(R.id.etn_Valor1)
        etn_valor2 = findViewById(R.id.etn_Valor2)
        txt_Resultado = findViewById(R.id.txt_Resultado)
        Rb_Sum = findViewById(R.id.Rb_Sum)
        Rb_Rest = findViewById(R.id.Rb_Rest)
        Rb_Mult = findViewById(R.id.Rb_Mult)
        Rb_Div = findViewById(R.id.Rb_Div)

    }

    fun calcular(vista:View)
    {
        val Valor1_String = etn_valor1?.text.toString()
        val Valor2_String = etn_valor2.text.toString()

        val valor1_Int = Valor1_String.toInt()
        val valor2_Int = Integer.parseInt(Valor2_String)

        if(Rb_Sum.isChecked==true)
        {
            val suma = valor1_Int+valor2_Int
            val resultado = suma.toString()
            txt_Resultado.setText(resultado)

        }else if (Rb_Rest.isChecked==true)
        {
            val resta = valor1_Int-valor2_Int
            val resultado = resta.toString()
            txt_Resultado.setText(resultado)
        }else if (Rb_Mult.isChecked==true)
        {
            val mult = valor1_Int*valor2_Int
            val resultado = mult.toString()
            txt_Resultado.setText(resultado)
        }else if (Rb_Div.isChecked==true)
        {
            if(valor2_Int!=0 && valor1_Int !=0){
            val div = valor1_Int/valor2_Int
            val resultado = div.toString()
            txt_Resultado.setText(resultado)
            }else{
                Toast.makeText(this,"No puede dividirse entre 0", Toast.LENGTH_LONG).show()
            }
        }



    }


//practica interna//
//Aqui tenemos 2 tipos de clases las anidadas y las internas ambas ocupando la clase miClaseAnidadaInterna:
    private fun clasesAnidadasI ()
    {
        //Aqui aremos una instancia de la clase que deseamos llamar en este caso miClaseAnidadaInterna
        //Clase Anidada
        val miClaseAnidada = miClaseAnidadaInterna.miClaseAnidada()
        val sumarD = miClaseAnidada.suma(5, 10)
        //para imprimir con un comentario agregamos el signo de dolar para que tome el valor que se traera
        println("La suma es $sumarD")
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //clase interna
        val miClaseInterna = miClaseAnidadaInterna().miClaseInterna()
        val sumarDos = miClaseInterna.sumarDo(3)
        println("El resultado es $sumarDos")

    }
}