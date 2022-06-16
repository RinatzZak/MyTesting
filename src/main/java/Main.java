import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;

import java.io.FileReader;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    private static final String filepath = "src/main/json/ticket.json";


    @SneakyThrows
    public static void main(String[] args) {
        double averageTime = 0.0;
        ObjectMapper objectMapper = new ObjectMapper();
        Example example = objectMapper.readValue(new FileReader(filepath), Example.class);
        List<Ticket> tickets = example.getTickets();
        List<Double> doubles = new ArrayList<>();

        for (Ticket ticket : tickets) {
            LocalTime departureTime = LocalTime.parse(ticket.getDepartureTime());
            LocalTime arrivalTime = LocalTime.parse(ticket.getArrivalTime());
            int arrival = arrivalTime.getHour() * 60 + arrivalTime.getMinute();
            int departure = departureTime.getHour() * 60 + departureTime.getMinute();
            averageTime = (arrival - departure);
            doubles.add(averageTime);
        }

        System.out.printf("Cреднее время пути из Владивостока в Тель-Авив составляет - %4.2f  часов%n", averageTime / 60);
        System.out.println();
        System.out.print("90% перцентель времени полёта между городами Владивосток и Тель-Авив составляет: ");
        System.out.printf("%.2f%n", percentile(doubles, 90)/60);
    }


    public static double percentile(List<Double> latencies, double percentile) {
        Collections.sort(latencies);
        int index = (int) Math.ceil(percentile / 100.0 * latencies.size());
        return latencies.get(index - 1);
    }
}
