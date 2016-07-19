package org.oweis.messenger.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.oweis.messenger.database.DatabaseClass;
import org.oweis.messenger.model.Message;

public class MessageService {
	
	public MessageService(){
		messages.put(1L, new Message(1,"Hello Lear!","Oweis"));
		messages.put(2L, new Message(2,"Hello Jersey!","Oweis"));
	}
	
	private Map<Long, Message> messages = DatabaseClass.getMessages();
	
	public List<Message> getAllMessages(){
		return new ArrayList<Message>(messages.values());
	}
	
	public Message getMessage(long id){
		return messages.get(id);
	}
	
	public Message addMessage(Message message){
		message.setId(messages.size() + 1);
		messages.put(message.getId(),message);
		return message;
	}
	
	public Message updateMessage(Message message){
		if(message.getId()<=0) {return null;}
	messages.put(message.getId(),message);
	return message;
	}
	
	public Message removeMessage(long id){
		return messages.remove(id);
	}
	/* 
	 * old used to test stuff
	 *  public List<Message> getAllMessages(){
			Message m1 = new Message(1L,"Hello Lear!","Oweis");
			Message m2 = new Message(2L,"Hello Jersey!","Oweis");
			List<Message> list = new ArrayList<>();
			list.add(m1);
			list.add(m2);
			return list;

		} */
	}

