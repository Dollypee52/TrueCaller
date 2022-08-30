package africa.semicolon.truecaller.services;

public class NoContactException extends RuntimeException {

    public NoContactException(String message) {
        super(message);
    }
}
