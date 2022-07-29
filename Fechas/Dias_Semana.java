
package programacionBasica;

import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

/**
 *
 * @author AlejaMundo
 */
public class Dias_Semana {

    /*Java.util (clase calendar):La clase Calendario es una clase abstracta que
    proporciona métodos para convertir entre un instante específico en el 
    tiempo y un conjunto de campos de calendario como AÑO, MES, DÍA_DE_MES,HORA.
    
	//formas de optener una instancia de la clase calendar ya que es abstracta
	*getInstance() sobrecargado:Obtiene un calendario con la zona horaria y 
        la configuración regional predeterminadas.
	*getInstance(Locale aLocale): Obtiene un calendario utilizando la zona 
        horaria predeterminada y la configuración regional especificada
	*getInstance(TimeZone zone): Obtiene un calendario utilizando la zona 
        horaria especificada y la configuración regional predeterminada.
	*getInstance(TimeZone zone, Locale aLocale): Obtiene un calendario con 
        la zona horaria y la configuración regional especificadas.
     */
    public static void main(String[] args) {
        Calendar today = Calendar.getInstance();//intancio calendar
        //de esta forma no es legible la fecha
        System.out.println("Today is " + today);
        //convierto calendar a dato tipo date
        System.out.println("Today is " + today.getTime());
        //tipo de calendario occidental
        System.out.println(today.getCalendarType());

        //Fijar una fecha
        //gregorian calendar tienen varios constructores por lo cual podemos
        //definir difrentes parametros año, mes, día, hora, minuto, segundo.
        Calendar sameDate = new GregorianCalendar(2010, Calendar.FEBRUARY, 22, 23, 11, 44);
        System.out.println("Some Date : " + sameDate.getTime());

        //leer campos de fecha
        //Obtiene el valor actual de la configuración regional predeterminada 
        //para esta instancia de Java Virtual Machine.
        Locale locale = Locale.getDefault();
        //para otro idioma de calendar
        Locale locale2 = Locale.GERMAN;
        Calendar today1 = Calendar.getInstance();
        System.out.println("Year : " + today.get(Calendar.YEAR));
        System.out.println("Month (0 is January): " + today.get(Calendar.MONTH));
        //Devuelve la representación de cadena del valor del campo de calendario 
        //en el estilo y la configuración regional proporcionados.
        System.out.println("Month (String): "
                + today.getDisplayName(Calendar.MONTH, Calendar.SHORT, locale));
        System.out.println("Day of Month : " + today.get(Calendar.DAY_OF_MONTH));
        System.out.println("Day of Week (0 is Sunday): "
                + today.get(Calendar.DAY_OF_WEEK));
        System.out.println("Day of Week (String): " + today.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, locale));

        System.out.println("Week of Year : " + today.get(Calendar.WEEK_OF_YEAR));
        System.out.println("Week of Month : " + today.get(Calendar.WEEK_OF_MONTH));
        System.out.println("Day of Year : " + today.get(Calendar.DAY_OF_YEAR));

        System.out.println("24-hour clock : " + today.get(Calendar.HOUR_OF_DAY));
        System.out.println("12-hour clock : " + today.get(Calendar.HOUR));
        System.out.println("AM/PM : " + today.get(Calendar.AM_PM));
        System.out.println("AM/PM : " + today.getDisplayName(Calendar.AM_PM, Calendar.LONG, locale));
        System.out.println("Minutes : " + today.get(Calendar.MINUTE));
        System.out.println("Seconds : " + today.get(Calendar.SECOND));
        System.out.println("MiliSeconds : " + today.get(Calendar.MILLISECOND));

        //sumar y restar fechas
        Calendar today3 = Calendar.getInstance();
        today3.add(Calendar.DAY_OF_MONTH, 20);//dia,mes,año,hola,minuto, segundo,valor a sumar
        System.out.println("Today plus 20 days : " + today3.getTime());

        today3 = Calendar.getInstance();
        today3.add(Calendar.YEAR, -28);
        System.out.println("Today minus 20 days : " + today3.getTime());

        //comprar fechas anterior o posterior a otra
        Calendar today4 = Calendar.getInstance();
        Calendar after = Calendar.getInstance();
        after.add(Calendar.HOUR_OF_DAY, 2);

        Calendar before = Calendar.getInstance();
        before.add(Calendar.HOUR_OF_DAY, -5);

        System.out.println("Today is after today+2hours " + today.after(after));
        System.out.println("Today is before today+2hours " + today.before(after));
        System.out.println("Today is after today-5hours " + today.after(before));
        System.out.println("Today is before today-5hours " + today.before(before));

        //dias entre dos semanaas diferncia entre dos fechas
        //podemos hacerlo en java o con librerias externas Joda Time
        Calendar aDay = Calendar.getInstance();
        aDay.set(Calendar.MONTH, Calendar.MARCH);

        Calendar otherDay = Calendar.getInstance();
        otherDay.set(Calendar.MONTH, Calendar.FEBRUARY);

        long milisec = aDay.getTimeInMillis() - otherDay.getTimeInMillis();
        long days = milisec / 1000 / 60 / 60 / 24;
        System.out.println("Days : " + days);

        //zonas horaarias en diferentes zonas
        Calendar spanishToday = Calendar.getInstance(TimeZone.getDefault());
        Calendar canadianToday = Calendar.getInstance(TimeZone.getTimeZone("America/Detroit"));

        System.out.println("colombia hour " + spanishToday.get(Calendar.HOUR_OF_DAY));
        System.out.println("españa hour " + canadianToday.get(Calendar.HOUR_OF_DAY));

        //zona horaria // Available TimeZones
        String[] timeZones = TimeZone.getAvailableIDs();
        System.out.println("Available Timezones " + Arrays.toString(timeZones));
        //UTC+08:00 es el décimo segundo huso horario del planeta cuya 
        //ubicación geográfica se encuentra en el meridiano 120 este. 
        //Aquellos países que se rigen por este huso horario se encuentran 
        //8 horas por delante del meridiano de Greenwich.

        Calendar aToday = Calendar.getInstance(TimeZone.getTimeZone("GMT+8:00"));
        /*GMT es la sigla en inglés de 'Greenwich Mean Time', 
        Hora del Meridiano de Greenwich. Es equivalente a UTC o Tiempo Universal 
        Coordinado, y se utiliza como referencia de la hora internacional.*/
        Calendar anotherToday = Calendar.getInstance(TimeZone.getTimeZone("GMT-4:00"));
        
        System.out.println("aToday: "+aToday.get(Calendar.HOUR_OF_DAY));
        System.out.println("AntherTaday: "+anotherToday.get(Calendar.HOUR_OF_DAY));

    }
}
