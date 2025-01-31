class Persona(val dni: String){
    val cuentas: Array<Cuenta?> = arrayOfNulls(3)

    fun añadirCuenta(ingresoCuenta: Cuenta): Boolean {
        for ((i, cuenta) in cuentas.withIndex()) {
            if (cuenta == null) {
                cuentas[i] = ingresoCuenta
                return true
            }
        }
        return false
    }

    fun comprobarMoroso(persona: Persona): Boolean {
        for (cuenta in persona.cuentas){
            if (cuenta != null && cuenta.saldo < 0){
                return true
            }
        }
        return false
    }

    fun realizarTransferencia(persona1: Persona, persona2: Persona, numeroCuenta1: Int, numeroCuenta2: Int, cantidadTransferencia: Double){
        val cuenta1Exist = persona1.cuentas.any { it?.numCuenta == numeroCuenta1}
        val cuenta2Exist = persona2.cuentas.any { it?.numCuenta == numeroCuenta2}

        if (cuenta1Exist && cuenta2Exist){
            val cuenta1 = persona1.cuentas.find { it?.numCuenta == numeroCuenta1 }
            val cuenta2 = persona2.cuentas.find { it?.numCuenta == numeroCuenta2 }

            if (cuenta1 != null && cuenta2 != null){
                cuenta1.realizarPago(cantidadTransferencia)
                cuenta2.recibirAbono(cantidadTransferencia)
                println("TRANSFERENCIA REALIZADA CON EXITO!")
            }
        }
    }
}

