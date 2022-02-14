package chapter2.item1.car;

import chapter2.item1.book.AfterBook;
import chapter2.item1.car.impl.Car;
import chapter2.item1.car.impl.Morning;
import chapter2.item1.car.impl.Sonata;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarFactoryTest {
  @Test
  @DisplayName("랜덤한 확률로 Sonata 혹은 Morning 객체 생성")
  void createRandomCar() {
    // given
    final Car randomCar = CarFactory.createCar();

    // when

    // then
    assertNotNull(randomCar);
    assertNotNull(randomCar.getModel());
    assertNotNull(randomCar.getPrice());
  }

  @Test
  @DisplayName("Sonata 객체 생성")
  void createRandomCar_2() {
    // given
    final Car expectedSonata = new Sonata();
    final Car expectedMorning = new Morning();
    final Car sonata = CarFactory.createCar(true);

    // when
    String targetModel = sonata.getModel();
    int targetPrice = sonata.getPrice();

    // then
    assertNotNull(sonata);
    assertNotNull(targetModel);
    assertNotNull(targetPrice);
    assertEquals(expectedSonata.getModel(), targetModel);
    assertEquals(expectedSonata.getPrice(), targetPrice);
    assertNotEquals(expectedMorning.getModel(), targetModel);
    assertNotEquals(expectedMorning.getPrice(), targetPrice);
  }

  @Test
  @DisplayName("Morning 객체 생성")
  void createRandomCar_3() {
    // given
    final Car expectedSonata = new Sonata();
    final Car expectedMorning = new Morning();
    final Car morning = CarFactory.createCar(false);

    // when
    String targetModel = morning.getModel();
    int targetPrice = morning.getPrice();

    // then
    assertNotNull(morning);
    assertNotNull(targetModel);
    assertNotNull(targetPrice);
    assertEquals(expectedMorning.getModel(), targetModel);
    assertEquals(expectedMorning.getPrice(), targetPrice);
    assertNotEquals(expectedSonata.getModel(), targetModel);
    assertNotEquals(expectedSonata.getPrice(), targetPrice);
  }
}
