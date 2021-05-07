package com.example.demo;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.socket.BinaryMessage;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

public class MytWebSocketHandler extends TextWebSocketHandler {

	private static final Logger LOGGER = LoggerFactory.getLogger(MytWebSocketHandler.class);
	
	private final List<WebSocketSession> sessions = new CopyOnWriteArrayList<>();

	@Override
	public void afterConnectionEstablished(WebSocketSession session) throws Exception {
		sessions.add(session);
		super.afterConnectionEstablished(session);
	}

	@Override
	protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
		super.handleTextMessage(session, message);
		/*
		sessions.forEach(wsSession -> {
			try {
				wsSession.sendMessage(message);
			}catch(IOException e) {
				LOGGER.error("Error occurred.",e);
			}
		});
		*/
		System.out.println("Text message received");
		try {
			session.sendMessage(message);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	

	@Override
	protected void handleBinaryMessage(WebSocketSession session, BinaryMessage message) {
		super.handleBinaryMessage(session, message);
		System.out.println("Binary message received");
		try {
			session.sendMessage(message);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception {
		sessions.remove(session);
		super.afterConnectionClosed(session, status);
	}
	
	
}
