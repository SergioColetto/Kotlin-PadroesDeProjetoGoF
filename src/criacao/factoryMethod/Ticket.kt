package criacao.factoryMethod

import java.util.*

abstract class Ticket (
    var origin: String,
    var destination: String,
    var dateTime: Date

){
    abstract fun showDetail()
}