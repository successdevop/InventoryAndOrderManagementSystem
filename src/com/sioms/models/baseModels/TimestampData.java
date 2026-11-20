package com.sioms.models.baseModels;

import java.time.LocalDateTime;


public class TimestampData {
    private final LocalDateTime createdAt;
    private LocalDateTime updateAt;

    public TimestampData(){
        createdAt = LocalDateTime.now();
        updateAt = LocalDateTime.now();
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public LocalDateTime getUpdateAt() {
        return updateAt;
    }

    public void recordNewUpdate() {
        this.updateAt = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return "TimestampData{" +
                "createdAt=" + createdAt +
                ", updateAt=" + updateAt +
                '}';
    }
}