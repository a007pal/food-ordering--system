package com.food.ordering.system.kafka.producer.execption;

public class KafkaProducerException extends RuntimeException{
    public KafkaProducerException(String message) {
        super(message);
    }
}
