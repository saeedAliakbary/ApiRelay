package com.apiRelay.secondserver;

import com.apiRelay.secondserver.communication.SecondServerClient;
import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import static org.mockito.Mockito.*;
@SpringBootTest
class SecondServerApplicationTests {
    private static final Logger logger = LoggerFactory.getLogger(SecondServerApplicationTests.class);

        @Test
        void clientConnectsToBroker() {
            // Mock the MqttClient class
            MqttClient mqttClient = mock(MqttClient.class);
            SecondServerClient client = new SecondServerClient(mqttClient);

            // Test that connect() is called when creating a client
            client.connectToBroker();

            // Verify that connect() was called

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
