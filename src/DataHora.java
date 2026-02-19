import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class DataHora {
    public static void main(String[] args){
        /*
         Datas e horários seguem o padrão ISO-8601
         ano-mês-diaThoras:minutos:segundos.fraçãodesegundosFUSOHORÁRIO

         LocalDate, LocalDateTime, Instant são TIPOS.
         */

        LocalDate dataApenas = LocalDate.now();
        System.out.println(dataApenas);

        LocalDateTime dataComHorario = LocalDateTime.now();  //horário local (da máquina)
        System.out.println(dataComHorario);

        Instant dataComHorarioUTC = Instant.now(); //horário baseado em UTC -> Tempo Universal Coordenado
        System.out.println(dataComHorarioUTC);
    }
}
