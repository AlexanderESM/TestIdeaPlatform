package orekhov;
import lombok.SneakyThrows;
import orekhov.dto.Ticket;
import orekhov.service.Methods;
import orekhov.service.ParserJson;

import java.util.List;

public class Start {
    public static final String PATH = "src/main/resources/tickets.json";
    @SneakyThrows
    public static void main(String[] args) {

        String json = ParserJson.readJson(PATH);

        List<Ticket> tickets = ParserJson.jsonToTickets(json);

        System.out.println(Methods.getResult(tickets));

    }
}
