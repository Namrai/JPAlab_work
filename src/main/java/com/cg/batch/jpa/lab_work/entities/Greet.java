package com.cg.batch.jpa.lab_work.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="greet")
public class Greet {
	
	@Id
	private int messageId;
	private String message_;
	
	public Greet() {
		super();
	}
	
	public Greet(int messageId,String message_) {
		super();
		this.messageId = messageId;
		this.message_ = message_;
	}
	public int getMessageId() {
		return messageId;
	}
	public void setMessageId(int messageId) {
		this.messageId = messageId;
	}
	public String getMessage_() {
		return message_;
	}
	public void setMessage_(String messgae) {
		this.message_ = messgae;
	}
	
	@Override
	public String toString() {
		
		return " Greet [ messageid = "+ messageId+", message_ = "+message_ + "]";
	}
	
	
	
	
}