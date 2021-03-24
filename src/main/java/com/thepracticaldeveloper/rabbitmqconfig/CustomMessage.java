package com.thepracticaldeveloper.rabbitmqconfig;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public record CustomMessage(@JsonProperty("text") String text,
                         @JsonProperty("priority") int priority,
                         @JsonProperty("secret") boolean secret) implements Serializable {
}
