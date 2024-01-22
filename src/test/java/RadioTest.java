import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.radio.Radio;

public class RadioTest {
    @Test
    public void shouldNotIncreaseVolumeWhenPos() {
        Radio rad = new Radio();
        rad.setCurrentVolume(102);
        rad.increaseVolume();

        int expected = 100;
        int actual = rad.getCurrentVolume();

        System.out.println(actual);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotDecreaseVolumeWhenNeg() {
        Radio rad = new Radio();
        rad.setCurrentVolume(-1);

        int expected = 0;
        int actual = rad.getCurrentVolume();

        System.out.println(actual);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(50);
        rad.increaseVolume();

        int expected = 51;
        int actual = rad.getCurrentVolume();

        System.out.println(actual);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeWhen0() {
        Radio rad = new Radio();
        rad.setCurrentVolume(0);
        rad.decreaseVolume();

        int expected = 0;
        int actual = rad.getCurrentVolume();

        System.out.println(actual);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(50);
        rad.decreaseVolume();

        int expected = 49;
        int actual = rad.getCurrentVolume();

        System.out.println(actual);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextChannel() {
        Radio rad = new Radio();
        rad.setCurrentChannel(0);
        rad.next();

        int expected = 1;
        int actual = rad.getCurrentChannel();

        System.out.println(actual);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextChannelWhen9To0() {
        Radio rad = new Radio();
        rad.setCurrentChannel(9);
        rad.next();

        int expected = 0;
        int actual = rad.getCurrentChannel();

        System.out.println(actual);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevChannel() {
        Radio rad = new Radio();
        rad.setCurrentChannel(5);
        rad.prev();

        int expected = 4;
        int actual = rad.getCurrentChannel();

        System.out.println(actual);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevChannelWhen0To9() {
        Radio rad = new Radio();
        rad.setCurrentChannel(0);
        rad.prev();

        int expected = 9;
        int actual = rad.getCurrentChannel();

        System.out.println(actual);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotNextChannelPos() {
        Radio rad = new Radio();
        rad.setCurrentChannel(10);
        rad.next();

        int expected = 0;
        int actual = rad.getCurrentChannel();

        System.out.println(actual);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotPrevChannelWhenNeg() {
        Radio rad = new Radio();
        rad.setCurrentChannel(-1);
        rad.prev();

        int expected = 9;
        int actual = rad.getCurrentChannel();

        System.out.println(actual);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetChannel() {
        Radio rad = new Radio();

        rad.setCurrentChannel(9);

        int expected = 9;
        int actual = rad.getCurrentChannel();

        System.out.println(actual);
        Assertions.assertEquals(expected, actual);
    }
}