package com.colak;

import java.util.UUID;


class UUIDValueObject {

    private UUID uuid;

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public static UUIDValueObject createNew () {
        UUIDValueObject valueObject = new UUIDValueObject();
        valueObject.setUuid(UUID.randomUUID());
        return valueObject;
    }
}
