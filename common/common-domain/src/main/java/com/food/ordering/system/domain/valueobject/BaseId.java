package com.food.ordering.system.domain.valueobject;

import lombok.Getter;

import java.util.Objects;

@Getter
public abstract class BaseId<T> {
    protected BaseId(T value) {
        this.value = value;
    }

    private final T value;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BaseId<?> baseId = (BaseId<?>) o;
        return Objects.equals(value, baseId.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
