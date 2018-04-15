package criacao.factoryMethod

import java.util.*

fun main(args : Array<String>) {

    val ticketUrbanTccc: Ticket = TCCC().generateTicketUrban(
            "Bairro A", "Bairro B", Date(2018,4,15, 11,55))

    ticketUrbanTccc.showDetail()

    val ticketUrbanViacaoGracia: Ticket = ViacaoGracia().generateTicketUrban(
            "Bairro A", "Bairro B", Date(2018,4,15, 11,55))

    ticketUrbanViacaoGracia.showDetail()

    val ticketInterurbanViacaoGracia: Ticket = ViacaoGracia().generateTicketInterurban(
            "Maringa", "Sarandi", Date(2018,4,15, 11,55))

    ticketInterurbanViacaoGracia.showDetail()

}
