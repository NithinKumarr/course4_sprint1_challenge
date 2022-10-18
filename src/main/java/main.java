import java.util.Arrays;

public class main
{
    public static void main(String[] args)
    {
        String [] nameofSchool={"Dav","rohit","Treamis","Candor","Oak","uak","Bcgs","Bcbs","Baldwin","Nps"};
        String [] scores={"86","78","95","6","44","32","82","77","8","90"};
        QuizDemo quizDemo=new QuizDemo();
        System.out.println(quizDemo.highestScore(nameofSchool,scores));
        String [] str1=new String[nameofSchool.length];
        str1=quizDemo.convertAllNamesToCapital(nameofSchool);

        System.out.println(Arrays.toString(str1));
    }
}