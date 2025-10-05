package io.github.traininglabz.solid.dip;

class ExampleSolution {

    interface Messenger {
        void sendMessage();
    }

    static class Email implements Messenger {
        @Override
        public void sendMessage() {
            System.out.println("Email sent!");
        }
    }

    static class SMS implements Messenger {
        @Override
        public void sendMessage() {
            System.out.println("SMS sent!");
        }
    }

    static class NotificationService {
        Messenger messenger;

        NotificationService(Messenger messenger) {
            this.messenger = messenger;
        }

        void notifyUser() {
            messenger.sendMessage();
        }
    }

    public static void run() {
        new NotificationService(new Email()).notifyUser();
        new NotificationService(new SMS()).notifyUser();
    }

}
