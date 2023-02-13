package arquitectura.de.computadoras.KotlinVersion.dto

import java.math.BigDecimal

class CurrencyDto (
    var success: Boolean,
    var query: RequestDto,
    var info: InfoDto,
    var date: String,
    var result: BigDecimal)
{
    constructor(): this(false, RequestDto(), InfoDto(), "", BigDecimal.ZERO)
    override fun toString(): String {
        return "success: $success date: $date result: $result info: $info query: $query"
    }

}