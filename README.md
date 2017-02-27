# spring-boot-amqp-messaging

This is a simple spring-boot app that shows how to configure easily RabbitMQ with AMQP for producing and consuming messages
in default format (java serialized) and JSON.

In this sample project every message is sent as JSON and then decoded on one queue as a generic `Message` object and in the other 
one as the original specific class.

If you want to have more information, with full explanation of this code, you can find it 
[on my blog](http://dev.macero.es/2016/10/23/produce-and-consume-json-messages-with-spring-boot-amqp/).
