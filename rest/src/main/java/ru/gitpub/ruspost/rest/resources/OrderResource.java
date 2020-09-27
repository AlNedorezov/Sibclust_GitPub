package ru.gitpub.ruspost.rest.resources;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderResource {

    private UUID id;

    private String geozoneId;

    private String name;

    private String serviceType;

    private Long sum;

    private Double rating;

    private Long time;

    private Long weight;

    public Long getTime() {
        if (time != null) {
            return time / 60 + 1;
        }
        return 0L;
    }
}
