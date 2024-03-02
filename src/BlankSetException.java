public class BlankSetException extends RuntimeException {
    protected static final long serialVersionUID = 42L;
    public BlankSetException(String collection)
    {
        super("The " + collection + " is empty.");
    }
}
