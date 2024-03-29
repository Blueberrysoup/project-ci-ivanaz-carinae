package com.br.accommodation.entity;

import com.br.accommodation.entity.BedroomStatus;
import com.br.accommodation.entity.HotelReservation;
import com.br.accommodation.entity.TypeBedroom;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-05-18T21:27:12")
@StaticMetamodel(Bedroom.class)
public class Bedroom_ { 

    public static volatile SingularAttribute<Bedroom, Integer> number;
    public static volatile SingularAttribute<Bedroom, BigDecimal> priceDaily;
    public static volatile CollectionAttribute<Bedroom, HotelReservation> hotelReservationCollection;
    public static volatile SingularAttribute<Bedroom, String> description;
    public static volatile SingularAttribute<Bedroom, Integer> id;
    public static volatile SingularAttribute<Bedroom, BedroomStatus> bedroomStatusId;
    public static volatile SingularAttribute<Bedroom, Integer> floor;
    public static volatile SingularAttribute<Bedroom, TypeBedroom> typeBedroomId;

}