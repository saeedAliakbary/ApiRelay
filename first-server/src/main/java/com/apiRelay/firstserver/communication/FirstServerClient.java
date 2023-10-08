package com.apiRelay.firstserver.communication;
import org.eclipse.paho.client.mqttv3.*;

public class FirstServerClient {
        private IMqttClient mqttClient;

        public FirstServerClient(IMqttClient mqttClient) {
            this.mqttClient = mqttClient;
        }

        public void connectToBroker() {
            try {
                mqttClient.connect();
            } catch (MqttException e) {
                e.printStackTrace();
            }
        }
    }
