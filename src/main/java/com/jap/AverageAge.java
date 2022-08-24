package com.jap;

public class AverageAge
{

    public String averageAgeCalculator(String[] ageRawData)
    {
        double avg = 0;

        try{
            //Write the logic
            for (int i = 0; i < ageRawData.length; i++) {
                avg = avg + Integer.parseInt(ageRawData[i]);
            }
            avg = avg / ageRawData.length;
            //Handle specific exception
        }
        catch (Exception exception)
        {
            return exception.toString();
        }
        return String.valueOf(avg);
    }
    public static void main(String[] args) {
        AverageAge averageAge = new AverageAge();

        String[] age = {"35","26","32","44"};
        System.out.println(averageAge.averageAgeCalculator(age));
        String[] age1 = {"35","26","thirty-two","44"};
        System.out.println(averageAge.averageAgeCalculator(age1));

    }


}
