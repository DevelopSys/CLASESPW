package model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Jugador {
    private String idPlayer;
    private String idTeam;
    private String idTeam2;
    private Object idTeamNational;
    private String idAPIfootball;
    private Object idPlayerManager;
    private String idWikidata;
    private String idTransferMkt;
    private String idESPN;
    private String strNationality;
    private String strPlayer;
    private String strPlayerAlternate;
    private String strTeam;
    private String strTeam2;
    private String strSport;
    private Object intSoccerXMLTeamID;
    private Object dateDied;
    private String strNumber;
    private Object dateSigned;
    private String strSigning;
    private String strWage;
    private String strOutfitter;
    private String strKit;
    private String strAgent;
    private String strBirthLocation;
    private Object strDeathLocation;
    private String strEthnicity;
    private String strStatus;
    private String strDescriptionEN;
    private Object strDescriptionDE;
    private Object strDescriptionFR;
    private Object strDescriptionCN;
    private Object strDescriptionIT;
    private Object strDescriptionJP;
    private Object strDescriptionRU;
    private Object strDescriptionES;
    private Object strDescriptionPT;
    private Object strDescriptionSE;
    private Object strDescriptionNL;
    private Object strDescriptionHU;
    private Object strDescriptionNO;
    private Object strDescriptionIL;
    private Object strDescriptionPL;
    private String strGender;
    private String strSide;
    private String strLastName;
    private String strPosition;
}
