package Carousel;

import java.util.ArrayList;
import java.util.List;

public class DecrementCarousel {
    List<Integer> array = new ArrayList<>();
    int maxValue;
    //конструктор, присвоили максимальную вместимость контейнера, описание в 1 картинке
    public DecrementCarousel(int max) {
        maxValue = max;
    }

    boolean addElement(int element){
        // проверки, если элемент отрицателен или равен 0 то не добавляет его
        //описание в картинке 3
        array.add(element);
        return true;
    }

}
