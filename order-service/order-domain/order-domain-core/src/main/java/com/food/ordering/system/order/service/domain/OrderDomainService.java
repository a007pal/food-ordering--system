package com.food.ordering.system.order.service.domain;

import com.food.ordering.system.domain.event.publisher.DomainEventPublisher;
import com.food.ordering.system.order.service.domain.entity.Order;
import com.food.ordering.system.order.service.domain.entity.Restaurant;
import com.food.ordering.system.order.service.domain.event.OrderCancelledEvent;
import com.food.ordering.system.order.service.domain.event.OrderCreatedEvent;
import com.food.ordering.system.order.service.domain.event.OrderPaidEvent;

import java.util.List;

public interface OrderDomainService {

    OrderCreatedEvent validateAndInitiateOrder(Order order, Restaurant restaurant,
                                               DomainEventPublisher<OrderCreatedEvent> orderCreatedEventDomainEventPublisher);
    OrderCancelledEvent cancelOrderPayment(Order order, List<String> failureMessage,
                                           DomainEventPublisher<OrderCancelledEvent> orderCancelledEventDomainEventPublisher);
    void approveOrder(Order order);
    OrderPaidEvent payOrder(Order order, DomainEventPublisher<OrderPaidEvent> orderPaidEventDomainEventPublisher);

    void cancelOrder(Order order, List<String> failureMessage);
}
