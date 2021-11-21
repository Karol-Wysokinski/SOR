package pl.restaurantmanagementsystem.rms.service;

import io.swagger.models.Response;
import lombok.AllArgsConstructor;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import pl.restaurantmanagementsystem.rms.model.ResponseUser;


import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class FilmsRankingService {
    public List<ResponseUser> getFilmsRanking() throws Exception {
        RestTemplate restTemplate = new RestTemplate();
        String url = "http://localhost:8082//v1/mock/ranking";

        ResponseEntity<ResponseUser[]> forEntity = restTemplate.getForEntity(url, ResponseUser[].class);

        if(forEntity.getStatusCode().is2xxSuccessful()){
            return Arrays.asList(Objects.requireNonNull(forEntity.getBody()));
        }

        throw new Exception("Cannot fetch ranking");

    }
}
