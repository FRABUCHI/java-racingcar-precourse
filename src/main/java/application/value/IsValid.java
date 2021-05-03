package application.value;

public class IsValid {

    private boolean isValid;

    public IsValid(boolean isValid) {
        isValid = isValid;
    }

    public boolean getIsValid() {
        return isValid;
    }

    public void setIsValid(boolean isValid) {
        if (isValid) {
            isValid = isValid;
        }
    }
}
