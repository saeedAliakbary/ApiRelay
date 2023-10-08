package com.apiRelay.firstserver;

import com.apiRelay.firstserver.communication.FirstServerClient;
import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import static org.mockito.Mockito.*;

@SpringBootTest
class FirstServerApplicationTests {
    private static final Logger logger = LoggerFactory.getLogger(FirstServerApplicationTests.class);


    @Test
    void clientConnectsToBroker() {
        // Mock the MqttClient class
        MqttClient mqttClient = mock(MqttClient.class);
        FirstServerClient client = new FirstServerClient(mqttClient);

        // Test that connect() is called when creating a client
        client.connectToBroker();

        // Verify that connect() was called
        try {
            logger.info("start test of Server 1");
            verify(mqttClient, times(1)).connect(any());
        } catch (MqttException e) {
            logger.error(e.getMessage());
            throw new RuntimeException(e);
        }
    }
}
