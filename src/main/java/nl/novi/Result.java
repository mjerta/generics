package nl.novi;

public class Result<T> {
  private final T value;
  private final String errorMessage;
  private final boolean success;

  private Result(T value, String errorMessage, boolean success) {
    this.value = value;
    this.errorMessage = errorMessage;
    this.success = success;
  }

  // is this a factory method? yes yes
  public static <T> Result<T> success(T value) {
    return new Result<T>(value, null, true); // die errormessage kan dus niet in dit geval, maar dat hoef ook niet.... denk ik

  }

  // is this a factory method? yes yes
  public static <T> Result<T> failure(String errorMessage) {
    return new Result<T>(null, errorMessage, false);
  }

  @Override
  public String toString() {
    if (success) {
      return "good job buddy";
    }
    else {
      return "better luck next time";
    }
  }


  public T getValue() {
    return value;
  }

  public String getErrorMessage() {
    return errorMessage;
  }

  public boolean isSuccess() {
    return success;
  }

}
