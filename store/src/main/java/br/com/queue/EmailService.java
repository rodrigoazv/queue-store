package br.com.queue;

import org.apache.kafka.clients.consumer.ConsumerRecord;

public class EmailService {
    public static void main(String[] args) {
        var emailService = new EmailService();
        var service = new KafkaService("STORE_SEND_EMAIL", emailService::parse);

        service.run();

    }

    private void parse(ConsumerRecord<String, String> record){
        System.out.println("Sending Email");
        try{
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Email send");
    }

}
