package com.example.sendeservice;


public class MailInfo {

    private String receiver_mail;
    private String mail_message;
    private String mail_subject;

    public MailInfo(String receiver_mail ,
                    String mail_message , String mail_subject){

        this.receiver_mail = receiver_mail;
        this.mail_message = mail_message;
        this.mail_subject = mail_subject;

    }

    public MailInfo() {
    }

    public void setReceiver_mail(String receiver_mail) {
        this.receiver_mail = receiver_mail;
    }

    public void setMail_message(String mail_message) {
        this.mail_message = mail_message;
    }

    public void setMail_subject(String mail_subject) {
        this.mail_subject = mail_subject;
    }

    public String getReceiver_mail() {
        return receiver_mail;
    }

    public String getMail_message() {
        return mail_message;
    }

    public String getMail_subject() {
        return mail_subject;
    }
}
