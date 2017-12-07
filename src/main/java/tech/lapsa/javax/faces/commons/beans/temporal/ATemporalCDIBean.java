package tech.lapsa.javax.faces.commons.beans.temporal;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

import tech.lapsa.java.commons.time.MyTemporals.AFromTemporal;

public abstract class ATemporalCDIBean<T> {

    private final AFromTemporal<T> util;

    protected ATemporalCDIBean(AFromTemporal<T> util) {
	this.util = util;
    }

    public LocalDate toLocalDate(T value) {
	return util.toLocalDate(value);
    }

    public Instant toInstant(T value) {
	return util.toInstant(value);
    }

    public LocalDateTime toLocalDateTime(T value) {
	return util.toLocalDateTime(value);
    }

    public T getNow() {
	return util.now();
    }

    public Date toDate(T value) {
	return util.toDate(value);
    }

    public boolean isToday(T value) {
	return util.isToday(value);
    }

    public boolean isYesterday(T value) {
	return util.isYesterday(value);
    }

    public boolean isTommorow(T value) {
	return util.isTommorow(value);
    }
}