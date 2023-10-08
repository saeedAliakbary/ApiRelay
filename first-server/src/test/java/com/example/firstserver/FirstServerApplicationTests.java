package com.example.firstserver;

import org.eclipse.paho.client.mqttv3.MqttClient;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.mockito.Mockito.*;

@SpringBootTest
class FirstServerApplicationTests {

    @Test
    void clientConnectsToBroker() {
        // Mock the MqttClient class
        MqttClient mqttClient = mock(MqttClient.class);
        ServerAClient client = new ServerAClient(mqttClient);

        // Test that connect() is called when creating a client
        client.connectToBroker();

        // Verify that connect() was called
        verify(mqttClient, times(1)).connect(any());
    }
}
