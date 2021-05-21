package com.stocks.model;
// Generated Apr 9, 2021, 2:37:36 AM by Hibernate Tools 5.0.6.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

/**
 * Bhartiartl generated by hbm2java
 */
@Entity
@Table(name = "bhartiartl", catalog = "stocksdata", uniqueConstraints = @UniqueConstraint(columnNames = "date"))
public class Bhartiartl implements java.io.Serializable {

	private Integer sid;
	private Date date;
	private Double open;
	private Double high;
	private Double low;
	private Double close;
	private Double adjClose;
	private Double volume;
	private String SName;

	public Bhartiartl() {
	}

	public Bhartiartl(Date date, Double open, Double high, Double low, Double close, Double adjClose, Double volume,
			String SName) {
		this.date = date;
		this.open = open;
		this.high = high;
		this.low = low;
		this.close = close;
		this.adjClose = adjClose;
		this.volume = volume;
		this.SName = SName;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "sid", unique = true, nullable = false)
	public Integer getSid() {
		return this.sid;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "date", unique = true, length = 10)
	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Column(name = "open", precision = 22, scale = 0)
	public Double getOpen() {
		return this.open;
	}

	public void setOpen(Double open) {
		this.open = open;
	}

	@Column(name = "high", precision = 22, scale = 0)
	public Double getHigh() {
		return this.high;
	}

	public void setHigh(Double high) {
		this.high = high;
	}

	@Column(name = "low", precision = 22, scale = 0)
	public Double getLow() {
		return this.low;
	}

	public void setLow(Double low) {
		this.low = low;
	}

	@Column(name = "close", precision = 22, scale = 0)
	public Double getClose() {
		return this.close;
	}

	public void setClose(Double close) {
		this.close = close;
	}

	@Column(name = "adj_close", precision = 22, scale = 0)
	public Double getAdjClose() {
		return this.adjClose;
	}

	public void setAdjClose(Double adjClose) {
		this.adjClose = adjClose;
	}

	@Column(name = "volume", precision = 22, scale = 0)
	public Double getVolume() {
		return this.volume;
	}

	public void setVolume(Double volume) {
		this.volume = volume;
	}

	@Column(name = "s_name", length = 100)
	public String getSName() {
		return this.SName;
	}

	public void setSName(String SName) {
		this.SName = SName;
	}

}
