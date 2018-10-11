package com.design.loaner;

public class MailCombinator {

    public static void main(String[] args) {
        //sendWithoutPattern();
        sendWithPattern();
    }

    private static void sendWithPattern() {
        //Mailer mailer = new Mailer();
        Mailer.sendWithPattern(m -> m.setFromWithPattern("from@pattern.com")
                .setToWithPattern("to@pattern.com"));
    }

    private static void sendWithoutPattern() {
//        Mailer mailer = new Mailer();
//        mailer.setFrom("from@new.com");
//        mailer.setTo("to@new.com");
//        mailer.send();
    }
}

