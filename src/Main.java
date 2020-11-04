import decorator.*;

/**
 * Декоратор - динамически наделяет обьект новыми возможностями и является гибкой
 * альтернативой субклассированию в области расширения функциональности.
 *
 * Типы декораторов соответствуют типам декорируемых компонентов (соответствие достигается
 * посредством наследования или реализации интерфейса)
 *
 * Декораторы изменяют поведение компонентов, добавляя новую функциональность до и (или) после (или даже вместо)
 * вызовов методов компонентов.
 *
 */
public class Main {
    public static void main(String[] args) {

     System.out.println("Добро пожаловать в мой маленький книжный магазин");


        //Реализация паттерна Decorator на примере покупки блокнота
        //Можно купить обычный блокнот, за вполне приветлевую цену
        Price simpleNotebook = new SimpleNotebook();
        System.out.printf("Товар: %s %nЦена: %.2f руб",simpleNotebook.getCover(), simpleNotebook.getCost());

        //Так же можно выбрать в твердной обложке, но и стоимость из за этого увеличится
        Price hardCover = new HardCover(new SimpleNotebook());
        System.out.printf("%nТовар: %s %nЦена: %.2f руб",hardCover.getCover(), hardCover.getCost());

        //А если вы хотите его кому-то подарить, то есть подарочная упаковка
        //Цена за данный блокнот конечно кусается...Но можете быть уверенны, он того стоит
        Price giftWrap =new GiftWrap(new HardCover(new SimpleNotebook()));
        System.out.printf("%nТовар: %s %nЦена: %.2f руб",giftWrap.getCover(), giftWrap.getCost());



    }
}












