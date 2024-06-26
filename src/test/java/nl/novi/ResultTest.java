package nl.novi;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class ResultTest {

  @Test
  void canCreateSuccesResult() {
    // arrange
    // act
    Result<String> sut = Result.success("succes");
    // assert
    assertEquals("good job buddy",sut);
  }



}
