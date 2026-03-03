package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Liga implements Serializable {
    private static Long serialVersionUID = 123L;
    private String idLeague;
    private String strLeague;
    private String strSport;
}
