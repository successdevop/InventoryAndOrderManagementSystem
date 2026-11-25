package com.sioms.models.baseModels;

import java.io.Serializable;
import java.time.LocalDateTime;


public class TimestampData implements Serializable {
    private final LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public TimestampData(){
        LocalDateTime now = LocalDateTime.now();
        createdAt = now;
        updatedAt = now;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public LocalDateTime getUpdateAt() {
        return updatedAt;
    }

    public void recordNewUpdate() {
        this.updatedAt = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return "TimestampData{" +
                "createdAt=" + createdAt +
                ", updateAt=" + updatedAt +
                '}';
    }
}