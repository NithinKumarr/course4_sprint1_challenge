public class QuizDemo
{
    public String highestScore(String[] nameOfSchool, String[] scores)
    {
        int max = Integer.parseInt(scores[0]);
        int position = 0;
        try {
            for (int i = 0; i < scores.length; i++)
            {
                if (Integer.parseInt(scores[i]) > max)
                {
                    max = Integer.parseInt(scores[i]);
                    position = i;
                }
            }
        }
        catch (Exception exception)
        {
            return exception.getMessage();
        }
        return nameOfSchool[position];
    }

    public String[] convertAllNamesToCapital(String[] name)
    {
        String[] str = new String[name.length];
        String[] str1 = new String[1];
        try {
            for (int i = 0; i < name.length; i++)
            {
                str[i] = name[i].toUpperCase();
            }
        }
        catch (NullPointerException e)
        {
            str1[0] = e.toString();
            return str1;
        }
        return str;
    }
}