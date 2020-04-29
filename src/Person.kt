import java.text.DateFormat
import java.text.SimpleDateFormat
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.*
import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlElement
import javax.xml.bind.annotation.XmlRootElement

@XmlRootElement(name = "person")
@XmlAccessorType(XmlAccessType.FIELD)
class Person(
    @XmlElement
    var name:String?=null,
    @XmlElement
    var birthday:Date?=null
){

}