package com.example.moha.test1;

/**
 * Created by MOHA on 14-Aug-17.
 */

public class Message {
    public String update;
    public String time;
    public String length;


    public Message() {
    }

    public Message(String update, String time, String length) {
        this.update = update;
        this.time = time;
        this.length = length;
    }

    @Override
    public String toString() {
        return "Message{" +
                "update='" + update + '\'' +
                ", time='" + time + '\'' +
                ", length='" + length + '\'' +
                '}';
    }
}
