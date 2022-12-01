package test.devxschool.student;

import test.devxschool.log.FindAnswerLogging;

import java.util.Arrays;
import java.util.List;

public class FindAnswer {

    public static void main(String[] args) {
        /* TODO

         Fix program.
         Add the best data type and find answers for the following questions.

         Update following characters =>
         ***    = DATA_TYPE (primitive: boolean, char, byte, short, int, long, float, double; object: String)
         ???  = ANSWER

         Then run the main method

         Example:
         // Which programming language is the best?
         *** bestLanguage = ???;

         Answer:
         // Which programming language is the best?
         String bestLanguage = “Java”;
         */

        // ****** Start here ******

        //1) is Elon Musk the richest person in the world as of 2022?
         String isElonMuskRichestPerson = "Yes";

        //2) he is CEO of which company?
         String company = "Tesla";

        //3) what is his net worth as of 2022?
         long netWorth = 25400000;

        //4) what is the most popular website in the world?
         String mostPopularWebsite = "Google.com";

        //5) which computer command is better than a time machine?
         String command = "Command+Z";

        //6-7) which two commands have saved more lives than Batman and Robin?
         String firstLifeSaverCommand = "shift+";
         String secondLifeSaverCommand = "Shift + P";

        //8) the only one even prime number
         int evenPrimeNumber = 2;

        //9) the only number that can't be represented in roman numerals
         char notRomanNumeral = '0';

        //10) how many seconds in a minute?
         int seconds = 60;

        //11) the best language for data analyses, devops and machine learning
         String language = "Java";

        //12) most popular language at this time?
         String popularLanguage = "English";

        //13) horror missing character for java programmers
         char horrorCharacter = ';';

        //14) tourists visit what country the most?
         String mostsVisitedCountry = "France";

        //15) how many countries don't use metric system?
         byte nonMetricCount = 3;

        //16) is United States use metric system?
         boolean isUSMetric = true;

        //17) the coldest temperature ever recorded in F?
         double coldestTemp = -128.6;

        //18) what much world's population watched both the 2010 and 2014 FIFA World Cup games. (0.25, 0.4, 0.5, 0.75)
         double population = 0.5;

        //19) as of 2019, the overall human population is estimated to be more than how many billion people?
         float worldPopulation = 7.7f;

        //20) 10 decimals of PI number
         double pi = 3.1415926535;

        //21) volume of data/information created worldwide by 2025 in zetabytes. Forecast by statista
         double dataVolume = 64.2;

        //22) IntelliJ autofill command
         String autofill = "Ctrl+Shift+Space";

        //23) java first appeared in what year?
         int firstAppeared = 1995;

        //24) java found by ...
         String founder = "James Gosling";

        //25) java name came from ...
         String fromName = "coffee";











































        // IGNORE THIS

        List answers = Arrays.asList(
                isElonMuskRichestPerson,
                company,
                netWorth,
                mostPopularWebsite,
                command,
                firstLifeSaverCommand,
                secondLifeSaverCommand,
                evenPrimeNumber,
                notRomanNumeral,
                seconds,
                language,
                popularLanguage,
                horrorCharacter,
                mostsVisitedCountry,
                nonMetricCount,
                isUSMetric,
                coldestTemp,
                population,
                worldPopulation,
                pi,
                dataVolume,
                autofill,
                firstAppeared,
                founder,
                fromName
        );
        FindAnswerLogging.testData(answers);
    }
}
