package de.mid;

import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.annotation.PostConstruct;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;

@Configuration
@ConfigurationProperties(prefix="json")
public class JsonProperties {
    private List<SpaceConfiguration> spaces;

    private String data;

    @PostConstruct
    public void parseJson() {
        try {
            this.spaces = Arrays.asList(new ObjectMapper().readValue(this.data, SpaceConfiguration[].class));
            this.spaces.forEach(s -> System.out.println(String.format("%s:%s:%s", s.getName(), s.getTitle(), s.getKey())));
        } catch (JacksonException e) {
            throw new IllegalArgumentException("Unable to read from property 'json.data'", e);
        }
    }

    public void setData(final String data) {
        this.data = data;
    }

    public List<SpaceConfiguration> getSpaces() {
        return spaces;
    }

    public String getData() {
        return data;
    }
}
