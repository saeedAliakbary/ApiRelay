package com.apiRelay.secondserver.communication;

import org.eclipse.paho.client.mqttv3.IMqttClient;
import org.eclipse.paho.client.mqttv3.MqttException;

public class SecondServerClient {
        private IMqttClient mqttClient;

        public SecondServerClient(IMqttClient mqttClient) {
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
