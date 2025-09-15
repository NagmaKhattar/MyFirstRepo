/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factoryexample;

/**
 *
 * @author HP
 */
public class NotificationFactory {
	public Notification createNotification(String channel)
	{
		if (channel == null || channel.isEmpty())
			return null;
		switch (channel) {
		case "SMS":
			return new SMSNotification();
		case "EMAIL":
			return new EmailNotification();
		case "PUSH":
			return new PushNotification();
		default:
			throw new IllegalArgumentException("Unknown channel "+channel);
		}
	}
        
}
