
/**
 * PhaseGenerator
 * Created by nia on 13.11.2015.
 */
public class Task2 {
    static public void main (String[] args){

        /** Задаем массив фраз */

        String[] wordDataOne = {"Товарищи!","С другой стороны","Не следует, однако, забывать, что","Таким образом","Повседневная практика показывает, что","Значимость этих проблем настолько очевидна, что","Разнообразный и богатый опыт","Задача организации, в особенности же","Идейные соображения высшего порядка, а также","Равным образом"};

        String[] wordDataTwo = {"реализация намеченных плановых заданий","рамки и место обучения кадров","постоянный количественный рост и сфера нашей активности","сложившаяся структура организации","новая модель организационной деятельности","дальнейшее развитие различных форм деятельности","постоянное информационное обеспечение нашей деятельности","управления и развития структуры","консультация с широким активом","начало работы по формированию верных позиции"};

        String[] wordDataThree = {"играет важную роль в формировании","требуют от нас анализа","требуют определения и уточнения","способствуют подготовке и реализации","обеспечивают широкому кругу участие в формировании","позволяют выполнить важные задания по разработке","в значительной степени обусловливает создание","позволяет оценить значение","представляет собой интересный эксперимент проверки","влечет за собой интересный процесс внедрения и модернизации"};

        String[] wordDataFour = {"существующих финансовых и административных условий.","дальнейших направлений развития.","системы массового участия.","позиций, занимаемых участниками в отношении поставленных задач.","новых предложений.","направлений прогрессивного развития.","системы обучения кадров, соответствующей насущным нуждам.","соответствующих условий активизации.","модели развития.","форм воздействия."};

        /** Вычисляем длину массива */

        int dataOneLength = wordDataOne.length;
        int dataTwoLength = wordDataTwo.length;
        int dataThreeLength = wordDataThree.length;
        int dataFourLength = wordDataFour.length;

        /** Выбераем случайное число из диапазона */

        int random1 = (int)(Math.random()*dataOneLength);
        int random2 = (int)(Math.random()*dataTwoLength);
        int random3 = (int)(Math.random()*dataThreeLength);
        int random4 = (int)(Math.random()*dataFourLength);

        /** Собираем фразу с учетом случайных чисел */

        String PhaseGenerator = wordDataOne[random1]+" "+wordDataTwo[random2]+" "+wordDataThree[random3]+" "+wordDataFour[random4];

        /** Вывод фразы */

         System.out.print(PhaseGenerator);


    }
}