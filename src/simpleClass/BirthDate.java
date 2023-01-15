package simpleClass;

import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class BirthDate
{

    LocalDate birthDate;
    LocalDate today;
    LocalDate dun;
    LocalDate yarin;
    BirthDate(){
//        bugun tarihi bu
        today=LocalDate.now();
        birthDate=LocalDate.of(1996,9,24);

//        int years= Period.between(birthDate,today).getMonths();
//        int month=Period.between(birthDate,today).getMonths();
//        int days=Period.between(birthDate,today).getDays();
////        System.out.println(today);
////        System.out.println(birthDate);
//        System.out.println("numbers of years "+years);
////        System.out.println(month);
////        System.out.println(days);
//
//        System.out.println("bir isleri yapilacak .......................");
//        System.out.println("birthMath "+birthDate.getYear());
//        System.out.println("today's month "+today.getYear());
//        int i;
//        int j=today.getYear();
//        for(i=birthDate.getYear(); i<=j; i++){
//            System.out.println(i);

        }


//         int sayac=0;
////         burda ne dmek calismadin
//
//        while(today.getYear()>=birthDate.getYear())
//        {
//            sayac++;
//            if(sayac==years)
//            {
//                System.out.println( today.minusDays(sayac));
//            }
//        }
//
//        //        dun icin bir gun minus yapiyorus
//        dun=today.minusDays(1);
////        yarin icin dun 2 gun eklersek
//
////        anladin mi
//        yarin=dun.plusDays(2);




    public void getAge(){

//        ornek olarak gosterecm

//        burda bir ara toplama yapacz yaa yuzden list kullandm, listte localDate lazm baslangic nereye kadar
//        sonra bunu bir ara topma anldin mi
        //anladım
        List<LocalDate> dates=birthDate.datesUntil(today).toList();
        for(LocalDate i: dates) {
            System.out.println("date: "+i);
        }
    }

}
