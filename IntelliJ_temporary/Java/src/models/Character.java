package models;

public abstract class Character extends Person{
    public abstract void attack(Hero hero);
}// 추상메소드. 내용이 없고 오버라이드를 통해 구현하는 방식. 이걸 상속받은 쪽에서는 강제로 구현해야 한다


