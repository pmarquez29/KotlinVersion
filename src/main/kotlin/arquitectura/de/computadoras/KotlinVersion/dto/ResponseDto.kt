package arquitectura.de.computadoras.KotlinVersion.dto

class ResponseDto<T>(
        var data: T,
        var success: Boolean,
        var message: String
) {
    override fun toString(): String {
        return "ResponseDto(data=$data, success=$success, message='$message')"
    }
}
