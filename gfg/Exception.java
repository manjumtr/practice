public abstract class Exception extends RuntimeException {
    private String errorMessage;

    Exception(final String error) {
        this.errorMessage = error;
    }

}
