package com.consious.aliens.alien;

import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class AlienService {

    public List<Alien> getAliens() {
        return List.of(
                new Alien("alien one", LocalDate.of(1999, Month.JULY, 22), 22)
        );
    }
}
