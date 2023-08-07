package com.digitalhouse.digitalexpirience.dto.response;

import com.digitalhouse.digitalexpirience.model.place.Place;
import lombok.Builder;
import lombok.Data;

import java.util.List;
import java.util.stream.Collectors;

@Data
@Builder
public class PlaceResponseDTO {
    private Long id;

    private String name;

    private String country;

    private String city;
    public static PlaceResponseDTO placeModeltoPlaceResponseDTO(Place placeModel){
        return PlaceResponseDTO.builder()
                .id(placeModel.getId())
                .name(placeModel.getName())
                .country(placeModel.getCountry())
                .city(placeModel.getCity())
                .build();
    }

    public static List<PlaceResponseDTO> placeModelsToPlaceResponseDtos(List<Place> list) {
        return list.stream().map(mapper -> PlaceResponseDTO.builder()
                .id(mapper.getId())
                .name(mapper.getName())
                .city(mapper.getCity())
                .country(mapper.getCountry())
                .build()).collect(Collectors.toList());
    }
}
