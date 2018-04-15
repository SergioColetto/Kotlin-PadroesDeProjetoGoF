package criacao.factoryMethod

import java.util.*

abstract class Company {

    open val name: String? = ""
    abstract fun generateTicketUrban( origin: String, destination: String, dateTime: Date ) : Ticket

}