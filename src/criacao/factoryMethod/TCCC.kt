package criacao.factoryMethod

import java.util.*

class TCCC : Company() {

    override val name: String = "TCCC"

    override fun generateTicketUrban(origin: String, destination: String, dateTime: Date): Ticket {
        return TicketUrban( this, origin, destination, dateTime )
    }

}