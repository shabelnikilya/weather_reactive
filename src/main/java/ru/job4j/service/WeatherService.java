package ru.job4j.service;

import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import ru.job4j.model.Weather;
import ru.job4j.repository.WeatherRepository;

@Service
public class WeatherService {
    private final WeatherRepository repository;

    public WeatherService(WeatherRepository repository) {
        this.repository = repository;
    }

    public Mono<Weather> findById(Integer id) {
        return repository.findById(id);
    }

    public Flux<Weather> all() {
        return repository.all();
    }

    public Mono<Weather> maxTempCity() {
        return repository.maxTempCity();
    }

    public Flux<Weather> citiesUpTemp(int temperature) {
        return repository.citiesUpTemp(temperature);
    }
}
