package criacao.factoryMethod

import java.util.*

class ViacaoGracia : Company() {

    override val name: String = "Viaçao Garcia"

    override fun generateTicketUrban(origin: String, destination: String, dateTime: Date): Ticket {
        return TicketUrban( this, origin, destination, dateTime )
    }

    fun generateTicketInterurban(origin: String, destination: String, dateTime: Date): Ticket {
        return TicketInterurban( this, origin, destination, dateTime )
    }

}