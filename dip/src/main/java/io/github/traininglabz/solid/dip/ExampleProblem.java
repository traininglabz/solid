package io.github.traininglabz.solid.dip;

class ExampleProblem {

    static class Email {

        void sendEmail() {
            System.out.println("Email sent!");
        }
    }

    static class NotificationService {
        Email email;

        NotificationService() {
            this.email = new Email();
        }

        void notifyUser() {
            email.sendEmail();
        }

    }

    public static void run() {
        new NotificationService().notifyUser();
    }
}
