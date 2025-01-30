class Cuenta(val numCuenta: Int, var saldo: Double) {

    // METODOS
    // se puede consultar el saldo disponible, recibir abonos y realizar pagos.

    fun comprobarSaldo(): String{
        return ("El saldo total disponible actualmente en la cuenta es de: $saldo")
    }

    fun recibirAbono(cantidad: Double){
        saldo += cantidad
    }

    fun realizarPago(cantidad: Double){
        saldo -= cantidad
    }

}