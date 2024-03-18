package de.mid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SpaceConfiguration {
    private final String name;
    private final String title;
    private final String key;

    @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
    public SpaceConfiguration(
            @JsonProperty("name") final String name,
            @JsonProperty("title") final String title,
            @JsonProperty("key") final String key) {
        this.name = name;
        this.title = title;
        this.key = key;
    }

    public String getName() {
        return name;
    }

    public String getTitle() {
        return title;
    }

    public String getKey() {
        return key;
    }
}
