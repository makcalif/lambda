package com.design.loaner;

import java.util.function.Consumer;

/**
 * Created by x239954 on 10/11/2018.
 */
public class Mailer {

    private String to;
    private String from;

    private Mailer() {
    }

    public void setFrom(String from) {
        this.from = from;
        System.out.println("setting from");
    }
    public void setTo(String to){
        this.to = to;
        System.out.println("setting To");
    }
    public void send() {
        System.out.println("sending email");
    }

    public Mailer setFromWithPattern(String from ) {
        this.setFrom(from);
        return this;
    }
    public Mailer setToWithPattern(String to){
        this.setTo(to);
        return this;
    }

    public String getTo() {
        return to;
    }

    public String getFrom() {
        return from;
    }


    public static void sendWithPattern(final Consumer<Mailer> whatToDoWithTheComposedMailerObject) {  // this acce
        Mailer mailer = new Mailer();

        // the call of this method (sendWithPattern) dynamically defines what to do
        // with the mailer object that he is passing in
        //        Mailer.sendWithPattern(m -> m.setFromWithPattern("from@pattern.com")
        //                .setToWithPattern("to@pattern.com"));
        // in other words :
        //      set to and from ON the mailer object created above
        //      and that's it!!!
        // after this do whatever you like with mailer object

        whatToDoWithTheComposedMailerObject.accept(mailer);
        System.out.println(String.format("sending from [%s] To [%s]", mailer.getFrom(), mailer.getTo()));
    }


}
