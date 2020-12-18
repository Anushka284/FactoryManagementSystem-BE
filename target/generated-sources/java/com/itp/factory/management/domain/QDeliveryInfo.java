package com.itp.factory.management.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QDeliveryInfo is a Querydsl query type for DeliveryInfo
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QDeliveryInfo extends EntityPathBase<DeliveryInfo> {

    private static final long serialVersionUID = 2045624059L;

    public static final QDeliveryInfo deliveryInfo = new QDeliveryInfo("deliveryInfo");

    public final StringPath amount = createString("amount");

    public final DateTimePath<java.sql.Timestamp> deliveryDate = createDateTime("deliveryDate", java.sql.Timestamp.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath loadingPlace = createString("loadingPlace");

    public final StringPath materials = createString("materials");

    public final StringPath name = createString("name");

    public final StringPath qty = createString("qty");

    public final StringPath rate = createString("rate");

    public final StringPath remarks = createString("remarks");

    public final StringPath vehicleNo = createString("vehicleNo");

    public QDeliveryInfo(String variable) {
        super(DeliveryInfo.class, forVariable(variable));
    }

    public QDeliveryInfo(Path<? extends DeliveryInfo> path) {
        super(path.getType(), path.getMetadata());
    }

    public QDeliveryInfo(PathMetadata metadata) {
        super(DeliveryInfo.class, metadata);
    }

}

