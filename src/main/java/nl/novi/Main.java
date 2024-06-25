package nl.novi;

public class Main {
  public static void main(String[] args) {

    Result<String> failure = Result.failure("Het is niet gelukt makker!");
    Result<Integer> succes = Result.success(42);
    System.out.println(succes);
  }
}