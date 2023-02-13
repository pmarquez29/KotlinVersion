package arquitectura.de.computadoras.KotlinVersion.api
import arquitectura.de.computadoras.KotlinVersion.bl.CurrencyBl
import arquitectura.de.computadoras.KotlinVersion.dto.ResponseDto
import org.springframework.web.bind.annotation.*
import org.springframework.http.ResponseEntity
import java.math.BigDecimal

@RestController
@RequestMapping("api/v1/currency")
class CurrencyApi(private val currencyBl: CurrencyBl) {

    @GetMapping("/get")
    fun get(@RequestParam from: String, @RequestParam to: String, @RequestParam amount: BigDecimal): ResponseEntity<Any> {
        val currencyDto = currencyBl.get(from, to, amount)
        val responseDto = ResponseDto(currencyDto, true, "Success")
        return ResponseEntity.ok(responseDto)
    }
}
