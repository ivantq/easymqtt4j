package com.zengfr.easymqtt4j.test.case1;

import com.zengfr.easymqtt4j.client.geteway.MqttSubscriberGateway;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

/**
 * Created by zengfr on 2020/5/12.
 * https://gitee.com/zengfr/easymqtt4j
 * https://github.com/zengfr/easymqtt4j
 */
@Component
public class MqttSubscriberGatewayImpl implements MqttSubscriberGateway {
    static Logger logger = LoggerFactory.getLogger(MqttSubscriberGatewayImpl.class);
    @Override
    public boolean handlerMqttMessage(Message<?> msg, String topic, String qos, String id, String timestamp) {
        logger.info(String.format("收到:%s", msg));

        return false;
    }
}
