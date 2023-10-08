package com.relay.apirelay;

import com.apiRelay.firstserver.communication.FirstServerClient;
import com.apiRelay.firstserver.communication.MessageHandler;
import com.apiRelay.secondserver.communication.SecondServerClient;
import com.relay.apirelay.message.Message;
import org.eclipse.paho.client.mqttv3.IMqttClient;
import org.eclipse.paho.client.mqttv3.MqttClient;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

class CommunicationTest {

    @Test
    void testCommunication() {
        IMqttClient serverAMqttClient = mock(MqttClient.class);
        IMqttClient serverBMqttClient = mock(MqttClient.class);

        FirstServerClient serverAClient = new FirstServerClient(serverAMqttClient);
        SecondServerClient serverBClient = new SecondServerClient(serverBMqttClient);

        // Mock a message
        Message message = new Message("weather/get", "data");

        // Create a message handler
        MessageHandler messageHandler = mock(MessageHandler.class);

        // Simulate receiving a message
        messageHandler.handleMessage(message);

        // Verify that handleMessage was called with the correct message
        verify(messageHandler, times(1)).handleMessage(message);
    }
}