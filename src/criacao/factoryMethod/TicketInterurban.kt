package criacao.factoryMethod

import java.util.*

data class TicketInterurban(
        var company: Company,
        var originInterurban: String,
        var destinationInterurban: String,
        var dateTimeInterurban: Date

): Ticket( originInterurban, destinationInterurban, dateTimeInterurban ) {

    override fun showDetail() {
        println( "${company.name} Gerou um bilhete interurbano emitido de: ${originInterurban}, Para o destino: " +
                 "${destinationInterurban}, No horario: ${ dateTimeInterurban.toString()}" )
    }
}