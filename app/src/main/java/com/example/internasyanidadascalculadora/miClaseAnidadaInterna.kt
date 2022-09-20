package com.example.internasyanidadascalculadora

class miClaseAnidadaInterna {
    //Una clase anidada es aquella clase que puede encontrarse dentro de otra clase

    private val uno = 1
    private fun retornarUno():Int
    {
        return uno
    }


    class miClaseAnidada
    {
        fun suma(n1:Int,n2:Int):Int
        {
         return n1+n2
        }
    }

    inner class miClaseInterna()
    {
     fun sumarDo(num:Int):Int
     {
      return num + uno + retornarUno()
     }
    }

}
