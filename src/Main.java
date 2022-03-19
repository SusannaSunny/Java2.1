public class Main {
    public static void main(String[] args) {

        // Объявляете переменные для входных данных и
        // параметров программы: одну для хранения
        // стоимости билета, другую для хранения количества
        // рублей для одной бонусной милли

        int TicketPrice = 1000;
        int RubMilli = 20;
        int CountMilli;


        // Рассчитываете количество бонусных милль, используя
        // значения заведённых переменных. Ответ сохраняете в
        // новую переменную и выводите на экран

        CountMilli = TicketPrice / RubMilli;
        System.out.println(CountMilli);


    }
}
