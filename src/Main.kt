fun main(){

    val persona1 = Persona("45346739X")
    val cuenta1_p1 = Cuenta(1, 0.0)
    val cuenta2_p1 = Cuenta(2, 700.0)

    persona1.añadirCuenta(cuenta1_p1)
    persona1.añadirCuenta(cuenta2_p1)

    cuenta1_p1.recibirAbono(1100.0)
    cuenta2_p1.realizarPago(750.0)

    println(persona1.comprobarMoroso(persona1))

    persona1.realizarTransferencia(persona1, persona1, 1, 2, 100.0)

    println(persona1.comprobarMoroso(persona1))
    println(cuenta1_p1.comprobarSaldo())
    println(cuenta2_p1.comprobarSaldo())



    val persona2 = Persona("77178659b")
    val cuenta1_p2 = Cuenta(1, 14.0)
    val cuenta2_p2 = Cuenta(2, 700.0)
    val cuenta3_p2 = Cuenta(3, 8000.0)


    persona2.añadirCuenta(cuenta1_p2)
    persona2.añadirCuenta(cuenta2_p2)
    persona2.añadirCuenta(cuenta3_p2)

    cuenta1_p2.recibirAbono(1100.0)
    cuenta2_p2.realizarPago(300.0)
    println(persona1.comprobarMoroso(persona2))





}