package model;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Liga implements Serializable {
    private String idLeague,strLeague,strSport;

    @Override
    public String toString() {
        return String.format("%s - %s",idLeague,strLeague);
    }
}
