package criacao.factoryMethod

import java.util.*

class TicketUrban(
        var company: Company,
        var originUrban: String,
        var destinationUrban: String,
        var dateTimeUrban: Date

): Ticket( originUrban, destinationUrban, dateTimeUrban ) {

    override fun showDetail() {
        println( "${company.name} Gerou um bilhete Urbano emitido de: ${originUrban}, Para o destino: " +
                 "${destinationUrban}, No horario: ${ dateTimeUrban.toString()}" )
    }

}