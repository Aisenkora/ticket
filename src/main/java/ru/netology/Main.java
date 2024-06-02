package ru.netology;

import ru.netology.ticket.Ticket;
import ru.netology.ticket.TicketTimeComparator;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Ticket price1 = new Ticket(
                "Санкт-Петербург",
                "Москва",
                43_000,
                13,
                15
        );

        Ticket price2 = new Ticket(
                "Санкт-Петербург",
                "Москва",
                6_500,
                18,
                19
        );

        Ticket price3 = new Ticket(
                "Санкт-Петербург",
                "Москва",
                12_500,
                18,
                21
        );

        Ticket price4 = new Ticket(
                "Санкт-Петербург",
                "Москва",
                1_500,
                18,
                23
        );

        Ticket price5 = new Ticket(
                "Санкт-Петербург",
                "Москва",
                11_500,
                18,
                22
        );
        System.out.println(price1.compareTo(price2));
        System.out.println(price4.compareTo(price3));

        Ticket[] prices = { price1, price2, price3, price4, price5 };
        Arrays.sort(prices);

        TicketTimeComparator timeComparator = new TicketTimeComparator();

    }
}
