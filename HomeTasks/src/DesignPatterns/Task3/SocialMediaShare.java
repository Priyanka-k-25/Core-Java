package DesignPatterns.Task3;

public class SocialMediaShare implements ShareStrategy {

    @Override
    public void share(String photo) {
        System.out.println("Sharing " + photo + " via Social Media");
    }
}
